import java.util.Arrays;

public class BubbleSortUtils {

    public void sort(int[] array) {
        boolean sorted = false;
        int length = array.length;
        int counter = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
                counter++;
            }
            length--;
        }
        System.out.printf("Liczba porównań: \n%d\n", counter);
    }

    public void printNumbersBeforeSort(int[] array) {
        System.out.println("Przed sortowaniem: ");
        System.out.println(Arrays.toString(array));
    }

    public void printNumbersAfterSort(int[] array) {
        System.out.println("Po sortowaniu: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}