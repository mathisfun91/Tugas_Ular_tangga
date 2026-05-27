import java.util.Random;
public class Dice {
    

    private int value;
    private boolean isAnimating;

    private final Random random;

    // Constructor
    public Dice() {
        this.value = 1;
        this.isAnimating = false;
        this.random = new Random();
    }

    // Roll dice
    public int roll() {
        isAnimating = true;

        // Random angka 1 - 6
        value = random.nextInt(6) + 1;

        isAnimating = false;
        return value;
    }

    // Getter value
    public int getValue() {
        return value;
    }

    // Getter animating
    public boolean isAnimating() {
        return isAnimating;
    }

    // Setter animating
    public void setAnimating(boolean animating) {
        isAnimating = animating;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "value=" + value +
                ", isAnimating=" + isAnimating +
                '}';
    }
}
