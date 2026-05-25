import animals.*;
import shapes.*;

public class Main {

    public static void main(String[] args) {

        Dog bobik = new Dog("Бобик");
        Cat barsik = new Cat("Барсик");
        Cat murka = new Cat("Мурка");

        bobik.run(100);
        bobik.swim(5);

        barsik.run(150);
        murka.run(50);

        Bowl bowl = new Bowl(15);

        Cat[] cats = {barsik, murka};

        for (Cat c : cats) {
            c.eat(bowl);
        }

        for (Cat c : cats) {
            System.out.println(c.getName() + " сытость: " + c.isFull());
        }

        bowl.addFood(10);

        Shape[] shapes = {
                new Circle(5, "red", "black"),
                new Rectangle(4, 6, "blue", "white"),
                new Triangle(3, 4, 5, "green", "yellow")
        };

        for (Shape s : shapes) {
            s.printInfo();
        }

        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Котов: " + Cat.getCount());
        System.out.println("Собак: " + Dog.getCount());
    }
}