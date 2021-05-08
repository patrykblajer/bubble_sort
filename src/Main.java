public class Main {
    public static void main(String[] args) {

        BubbleSortUtils bubbleSortUtils = new BubbleSortUtils();
        ArrayCreator arrayCreator = new ArrayCreator();

        int[] firstArray = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = new int[]{5, 4, 3, 2, 1};
        int[] thirdArray = arrayCreator.createArray1To100();
        int[] fourthArray = arrayCreator.createArray100To1();
        int[] fifthArray = new int[]{5, 2, 3, 1, 4};

        bubbleSortUtils.printNumbersBeforeSort(firstArray);
        bubbleSortUtils.sort(firstArray);
        bubbleSortUtils.printNumbersAfterSort(firstArray);

        bubbleSortUtils.printNumbersBeforeSort(secondArray);
        bubbleSortUtils.sort(secondArray);
        bubbleSortUtils.printNumbersAfterSort(secondArray);

        bubbleSortUtils.printNumbersBeforeSort(thirdArray);
        bubbleSortUtils.sort(thirdArray);
        bubbleSortUtils.printNumbersAfterSort(thirdArray);

        bubbleSortUtils.printNumbersBeforeSort(fourthArray);
        bubbleSortUtils.sort(fourthArray);
        bubbleSortUtils.printNumbersAfterSort(fourthArray);

        bubbleSortUtils.printNumbersBeforeSort(fifthArray);
        bubbleSortUtils.sort(fifthArray);
        bubbleSortUtils.printNumbersAfterSort(fifthArray);
    }
}