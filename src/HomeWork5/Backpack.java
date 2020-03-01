package HomeWork5;

public class Backpack {
    /**
     *
     * @param weight - массив значений веса предметов
     * @param val - массив значений ценности предметов
     * @param w - максимально допустимый вес вещей в рюкзаке
     * @param itemNum - элемент, который мы хотим положить на текущей итерации
     * @return максимально возможная ценность предметов, которые могут поместиться в рюкзаке
     */
    public static int recursive(int[] weight, int[] val, int w, int itemNum) {
        if (w == 0 || itemNum == weight.length) {
            return 0;
        }
        if (weight[itemNum] > w) {
            return recursive(weight, val, w,itemNum + 1);
        }
        if (w>=weight[itemNum]&&itemNum == weight.length-1){
            return val[itemNum];
        }
        int weTakeThisItem = recursive(weight, val, w-weight[itemNum], itemNum+1);
        int weNotTakeThisItem = recursive(weight, val, w, itemNum+1);
        return Math.max(weNotTakeThisItem, weTakeThisItem+val[itemNum]);
    }

    public static void main(String[] args) {
        int[] weight = {2, 3, 3, 4, 1};
        int[] val = {1, 2, 5, 9, 6};
        int w = 7;

        System.out.println(recursive(weight, val, w, 0));
    }

}
