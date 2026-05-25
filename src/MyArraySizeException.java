public class MyArraySizeException extends Exception {

    // Конструктор с сообщением об ошибке
    public MyArraySizeException(String message) {
        super(message);
    }

    // (Необязательно) Конструктор без параметров
    public MyArraySizeException() {
        super();
    }
}