package bubble_sort_1;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] array = {10,4,2,3,1,5,8,9,6,7};
        bubbleSort(array);
        for (int i:array
             ) {
            System.out.println(i);
        }

    }
    public static void bubbleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length -1 ; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
