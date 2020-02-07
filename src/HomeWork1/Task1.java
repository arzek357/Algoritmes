package HomeWork1;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1,0,-2,7,1,8,-3,-2,-1,-7};
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
}
