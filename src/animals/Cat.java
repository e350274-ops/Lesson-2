package animals;

public class Cat extends Animal {

    private static int count = 0;
    private final int maxRun = 200;
    private boolean full = false;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (full) return;

        if (bowl.takeFood(10)) {
            full = true;
            System.out.println(name + " поел и стал сытым.");
        } else {
            System.out.println(name + " не поел — мало еды в миске.");
        }
    }

    public boolean isFull() {
        return full;
    }

    public static int getCount() {
        return count;
    }
}