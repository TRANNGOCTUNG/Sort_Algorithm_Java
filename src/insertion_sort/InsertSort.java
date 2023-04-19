package insertion_sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {10,7,3,2,6,5,1,8,9,4};
//        insertSort(array);
        insertSort5(array);
        for (int a:array
             ) {
            System.out.println(a);
        }

    }
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int current = array[i];
            int position = i;
            while (position > 0 && current < array[position - 1]){
                 array[position] = array[position - 1];
                position--;
            }
            array[position] = current;
        }
    }
    public static void insertSort1(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
//            int position = i;
            int j;
            for ( j = i - 1; j >= 0 && array[j] > current ; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1 ] = current;
        }
    }
    public static  void insertSort3(int[] array){
        for (int i = 1; i < array.length;i ++){
            int current = array[i];
            int position = i;
            while (position > 0 && current < array[position -1]){
                array[position] = array[position - 1];
                position--;
            }
            array[position] = current;
        }
    }
    public static void insertSort5(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int current = array[i];
            int j;
            for (j = i - 1; j >= 0 && current < array[j] ; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = current;
        }
    }
}
