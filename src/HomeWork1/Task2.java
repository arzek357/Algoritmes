package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,0,-2,7,1,8,-3,-2,-1,-7};
        var1(arr);
    }
    //Вариант 1 (Сложность: N)
    private static void var1(int[] arr){
        int firstMaxValue = Integer.MIN_VALUE;
        int secondMaxValues = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>firstMaxValue){
                secondMaxValues = firstMaxValue;
                firstMaxValue=arr[i];
            }
        }
        if (secondMaxValues==Integer.MIN_VALUE){
            System.out.println("Второй максимум отсутствует. Значение первого максимума: "+firstMaxValue);
        }
        else
        System.out.println("Значение первого максимума: "+firstMaxValue+". Значение второго максимума: "+secondMaxValues);
    }
}
