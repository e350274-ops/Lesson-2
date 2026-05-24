public class Main {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(checkSum(10, 7));

        printNumberSign(0);

        System.out.println(isNegative(-5));

        printStringMultipleTimes("Hello QA", 3);

        System.out.println(isLeapYear(2024));

        int[] arr1 = {1,1,0,0,1,0,1,1,0,0};
        invertArray(arr1);

        int[] arr2 = createArray(100);

        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        multiplyLessThanSix(arr3);

        int[][] matrix = new int[5][5];
        fillDiagonal(matrix);

        int[] filled = createArrayWithValue(5, 7);
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 5;
        int b = -10;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void printNumberSign(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // 7
    public static boolean isNegative(int a) {
        return a < 0;
    }

    // 8
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }

    // 11
    public static int[] createArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // 12
    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    // 13
    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    // 14
    public static int[] createArrayWithValue(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;?????????
    }
}