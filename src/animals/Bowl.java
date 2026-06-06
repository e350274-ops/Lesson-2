package animals;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public boolean takeFood(int amount) {
        if (amount <= 0) return false;

        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public int getFood() {
        return food;
    }
}