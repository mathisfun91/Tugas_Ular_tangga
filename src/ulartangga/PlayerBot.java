import java.awt.Color;

public class PlayerBot extends Player {

    // ===================== Atribut =====================
    private int thinkDelay; // delay dalam milidetik sebelum bot jalan (ms)

    // ===================== Constructor =====================
    public PlayerBot(String name, Color color, int thinkDelay) {
        super(name, color);
        this.thinkDelay = thinkDelay;
    }

    /* Constructor dengan delay default 1000ms */
    public PlayerBot(String name, Color color) {
        super(name, color);
        this.thinkDelay = 1000;
    }

    // ===================== Getter & Setter =====================
    public int getThinkDelay()             { return thinkDelay; }
    public void setThinkDelay(int delay)   { this.thinkDelay = delay; }

    // ===================== Override =====================

    /* Selalu true untuk BotPlayer */
    @Override
    public boolean isBot() {
        return true;
    }

    @Override
    public String toString() {
        return "[BOT] " + getName() + " (pos=" + getPosition() + ", menang=" + hasWon() + ")";
    }
}
