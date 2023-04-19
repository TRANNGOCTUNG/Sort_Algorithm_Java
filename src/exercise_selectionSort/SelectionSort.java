package exercise_selectionSort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Nhập kích thước mảng: ");
            size = scanner.nextInt();
            if(size > 10){
                System.out.println("Nhập lại số lượng:");
                break;
            }
        } while(size > 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d] : ",i);
            array[i] = scanner.nextInt();
        }
        selectionSort2(array);
        for (int i: array
             ) {
            System.out.println(i);
        }

    }
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void selectionSort2(int[] array){
        for (int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < currentMin){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }

        }

//        for (int i = 0; i < array.length; i++) {
//            int currenMin = array[i];
//            int currentIndex = i;
//            for (int j = i + 1; j < array.length ; j++) {
//                if (array[j] < currenMin){
//                    currenMin = array[j];
//                    currentIndex = j;
//                }
//            }
//            if(currentIndex != i){
//                array[currentIndex] = array[i];
//                array[i] = currenMin;
//            }
//        }
    }
}
