package selection_sort;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập kích thước mảng");
            size = scanner.nextInt();
            if (size > 10){
                System.out.println("Mời nhập lai: ");
                break;
            }
        }while (size > 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d]", i);
            array[i] = scanner.nextInt();
        }
        insertionSort1(array);
        for (int i:array
             ) {
            System.out.println(i);
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
    public static void insertionSort1(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int current = array[i];
            int k;
            for (k = i - 1; k >= 0 && current < array[k] ; k--) {
                    array[k + 1] = array[k];
            }
            array[k + 1] = current;
        }
    }
}
