public class BubbleSortUtils {

    public void sort(int[] array) {
        int currentNumber;
        int swappedCounter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    currentNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = currentNumber;
                    swappedCounter++;
                }
            }
        }
        System.out.println("Liczba przesunięć: \n" + swappedCounter);
    }

    public void printNumbersBeforeSort(int[] array) {
        System.out.println("Przed sortowaniem: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void printNumbersAfterSort(int[] array) {
        System.out.println("Po sortowaniu: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();
    }
}