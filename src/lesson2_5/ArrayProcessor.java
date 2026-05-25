package lesson2_5;

public class ArrayProcessor {

    public static int processArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        // Проверка размера 4x4
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4");
            }
        }

        int sum = 0;

        // Проход по массиву
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Неверные данные в ячейке",
                            i,
                            j
                    );
                }
            }
        }

        return sum;
    }
}