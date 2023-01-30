public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        //Array erstellen
        int[] array = m.createArray(10);

        //Array mit zufälligen Zahlen füllen
        array = m.fillArray(array);

        System.out.println("Erstes Array:");

        //Array ausgeben
        m.printArray(array);

        //Array sortieren
        array = m.sortArray(array);

        System.out.println("Sortiertes Array:");

        //Array ausgeben
        m.printArray(array);

    }

    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Methode zum erstellen eines Arrays
    public int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    //Methode zum Füllen eines Arrays mit zufälligen Zahlen von 1 bis 100
    public int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }

    //Methode zum Sortieren eines Arrays von klein nach groß
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}