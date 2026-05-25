package lesson2_5;

public class Main {

    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "X", "8"}, // ошибка
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(wrongDataArray);
            System.out.println("Сумма: " + result);

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage()
                    + " [" + e.getRow() + "][" + e.getColumn() + "]");
        }

        // Демонстрация ArrayIndexOutOfBoundsException
        generateArrayIndexOutOfBounds();
    }

    public static void generateArrayIndexOutOfBounds() {
        try {
            int[] arr = new int[3];
            arr[5] = 10; // выход за границы
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
} ????