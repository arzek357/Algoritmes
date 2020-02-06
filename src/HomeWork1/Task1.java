package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,1,8,-3,-2,-1,-7};
        var1(arr);
    }
    //Вариант 1
    private static void var1(int[] arr){
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                for (int k =0;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==0)
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
    }
    private static void var2(int[] arr){
        int positive=0;int nullNumber=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>=0)
                positive++;
        }
        if(positive==0||arr.length<3){
            return;
        }
        int[] positiveArr = new int[positive];
        int[] negativeArr = new int[arr.length-positive];
        for (int i = 0;i<arr.length;i++){
            int countPositive=0;int countNegative=0;
            if (arr[i]>=0){
                countNegative++;
                countPositive=0;
                positiveArr[i-countPositive]=arr[i];
            }
            else{
                countNegative=0;
                countPositive++;
                negativeArr[i-countNegative]=arr[i];
            }
        }
        for (int i= 0;i<positiveArr.length;i++){
            for (int k =0;k<negativeArr.length;k++){
                if (i)
            }
        }
    }
}
