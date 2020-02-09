package HomeWork2;

public class MyArray {
    private int[] arr;
    public MyArray(int len) {
        arr = new int[len];
        fillArrayOnePlus();
    }
    //Процедура заполнения значений массива случайными числами в диапазоне от 0 до 100
    private void fillArrayOnePlus(){
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
    }
    //Процедура удаления элемента массива
    public void remove(int index){
        int[] temp = new int[arr.length-1];
        for (int j=0,i=0;j<arr.length;j++,i++){
            if (i==index){
                temp[i] = arr[j+1];
                j++;
            }
            else{
                temp[i] = arr[j];
            }
        }
        arr = temp;
    }
    //Процедура вывода массива в консоль
    void printInConsole() {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    //Процедура добавления элемента массива
    void add(int index, int value){
        int[] temp = new int[arr.length+1];
        for (int j=0,i=0;i<temp.length;j++,i++){
            if (i==index){
                temp[i]=value;
                j--;
            }
            else{
                temp[i] = arr[j];
            }
        }
        arr = temp;
    }
    //Процедура поиска элемента массива
    boolean isContain(int value){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==value){
                return true;
            }
        }
        return false;
    }
    void bubbleSort(){
        for (int i = arr.length-1;i>0;i--){
            for (int j =0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i =0;i<arr.length;i++){
            int minIx = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIx]){
                    minIx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIx];
            arr[minIx]=temp;
        }
    }
    void insertionSort(){
        for (int i =1;i<arr.length;i++){
            int temp = arr[i];
            int j =i;
            while (j>0&&arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    void mergeSort(){
        int[] tmp = new int[arr.length];
        mergeSortInt(arr,tmp,0,arr.length-1);
    }
    private void mergeSortInt(int[] arr,int[] tmp,int lo,int hi){
        if (hi<=lo){
            return;
        }
        int mid = lo+(hi-lo)/2;
        mergeSortInt(arr,tmp,lo,mid);
        mergeSortInt(arr,tmp,mid+1,hi);
        merge(arr, tmp, lo, mid, hi);
    }
    private static void merge(int[] arr, int[] tmp, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            tmp[k] = arr[k];
        }

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              arr[k] = tmp[j++];
            else if (j > hi)               arr[k] = tmp[i++];
            else if (tmp[j] < tmp[i]) arr[k] = tmp[j++];
            else                           arr[k] = tmp[i++];
        }
    }

}
