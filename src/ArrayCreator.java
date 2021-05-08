public class ArrayCreator {

    public int[] createArray1To100() {
        int[] array = new int[99];
        for (int i = 0; i < 99; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public int[] createArray100To1() {
        int[] array = new int[99];
        for (int i = 0; i < 99; i++) {
            for (int j = 99; j > 0; j--) {
                array[i++] = j;
            }
        }
        return array;
    }
}