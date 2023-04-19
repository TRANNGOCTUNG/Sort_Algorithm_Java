package exercise_bubbleSort;

import java.util.Scanner;

public class BubbleSort_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập kích thước mảng: ");
            size = scanner.nextInt();
            if(size > 10){
                System.out.println("Vui lòng nhập lại: ");
                break;
            }
        }while (size > 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.printf("Nhập M[%d] : ",i);
            array[i] = scanner.nextInt();
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("M[%d] = %d\n",i,array[i]);
//        }
        bubbleSort_exercise(array);


    }
    public static void bubbleSort_exercise(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = list.length -1 ; j >= i; j--) {
                if(list[j] < list[j - 1]){
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    needNextPass = true;
                }
            }
            if(needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed: ");
                break;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.printf("M[%d] = %d\n",i,list[i]);
        }
    }
}
