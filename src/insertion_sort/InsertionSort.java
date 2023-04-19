package insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        insertionSort(array);
        for (int i:array
             ) {
            System.out.println(i);
        }

    }
    public static  void insertionSort(int[] array){
//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j;
//            for ( j =  i - 1; j >= 0 && array[j] > current ; j--) {
//                array[j + 1] = array[j];
//            }
//            array[j + 1] = current;
//        }
        for (int i = 1; i < array.length ; i++) {
            int current = array[i];
            int position = i;
            while (position > 0 && array[position - 1] > current){
                array[position] = array[position -1];
                position--;
            }
            array[position] = current;
        }
    }
}
