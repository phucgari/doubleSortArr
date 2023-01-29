public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Setup2Arr arr=new Setup2Arr(3, 6, 2, 7);
        int[]result=doubleSort2Arr_returnSubArr(arr.getFirstArr(),arr.getSecondArr());
        System.out.println(print(result));
    }

    public static int[] doubleSort2Arr_returnSubArr(int[] mainArr, int[] subArr) {
        int n=mainArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mainArr[j] > mainArr[j + 1]) {
                    int temp = mainArr[j];
                    mainArr[j] = mainArr[j + 1];
                    mainArr[j + 1] = temp;

                    temp = subArr[j];
                    subArr[j] = subArr[j + 1];
                    subArr[j + 1] = temp;
                }
            }
        }
        return subArr;
    }
    public static String print(int[] arr){
        String result="";
        for (int num:arr) {
            result+=num+" ";
        }
        return result;
    }
}
