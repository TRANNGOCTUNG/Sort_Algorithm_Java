package bubble_sort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,2,7,1,0,6,9,10,8};
        bubbleSort(numbers);
        for (int i: numbers
             ) {
            System.out.println(i);
        }

        bubbleSort1(numbers);
        for (int i1:numbers
             ) {
            System.out.println(i1);
        }
        bubbleSort2(numbers);
        for (int i2:numbers
             ) {
            System.out.println(i2);
        }

    }
    public static void bubbleSort(int[] array){
        for(int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] > array[j + 1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSort1( int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j  -1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }
        }
    }
    public static void bubbleSort2(int[] array) {
        boolean nessNextPass = true;
        for (int i = 1; i < array.length && nessNextPass; i++) {
            nessNextPass = false;
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    nessNextPass = true;
                }
            }
        }
    }
}
