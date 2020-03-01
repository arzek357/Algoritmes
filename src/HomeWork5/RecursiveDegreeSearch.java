package HomeWork5;

public class RecursiveDegreeSearch {
    private static int recursive(int number,int degree){
        if (degree==1){
            return number;
        }
        return number*recursive(number,degree-1);
    }

    public static void main(String[] args) {
        System.out.println(recursive(5,3));
    }
}
