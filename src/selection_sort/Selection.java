package selection_sort;

public class Selection {
    public static void main(String[] args) {
        int[] array = {2,3,1,5,4,6,11,9,7,8,10};
        selectionSort(array);
        for (int i:array
             ) {
            System.out.println(i);
        }
        selectionSort1(array);
        for (int a: array
             ) {
            System.out.println(a);
        }
    }
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if(array[j] < array[min])
                    min = j;
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void selectionSort1(int[] array){
        for (int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if(currentMin > array[j]){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if(currentMin != i){
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }

        }
    }

    public static  void selectionSort3 (int[] array){
        for (int i = 0; i < array.length -1; i++) {
            int min = i;
            for (int j =  i +1; j < array.length ; j++) {
                if(array[j] < min) min = j;
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array [min] = temp;
            }
        }
    }
    public static void selectionSort4(int[] array){
        for (int i = 0; i < array.length; i++) {
            int currenMin = array[i];
            int currentIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < currenMin){
                    currenMin = array[j];
                    currentIndex = j;
                }
            }
            if(currentIndex != i){
                array[currentIndex] = array[i];
                array[i] = currenMin;
            }
        }
    }
}
