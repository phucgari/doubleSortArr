public class Setup2Arr {
    private int[]firstArr;
    public Setup2Arr(int...nums){
        firstArr=nums;
    }

    public int[] getSecondArr() {
        int[]secondArr=new int[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            secondArr[i]=i;
        }
        return secondArr;
    }
    public int[] getFirstArr(){
        return firstArr;
    }
}
