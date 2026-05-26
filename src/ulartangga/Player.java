import java.awt.Color;
/**
 *
 * @author HP
 */
public class Player {
     // ===================== Atribut =====================
    private String name;
    private int position;       // 0 = belum mulai, 1-100 = di papan
    private Color color;
    private boolean hasWon;
    private int turnCount;
    private int snakeCount;
    private int ladderCount;
 
    // ===================== Constructor =====================
    public Player(String name, Color color) {
        this.name     = name;
        this.color    = color;
        this.position = 0;
        this.hasWon   = false;
        this.turnCount  = 0;
        this.snakeCount = 0;
        this.ladderCount = 0;
    }
 
    // ===================== Getter =====================
    public String getName()      { return name; }
    public int getPosition()     { return position; }
    public Color getColor()      { return color; }
    public boolean hasWon()      { return hasWon; }
    public int getTurnCount()    { return turnCount; }
    public int getSnakeCount()   { return snakeCount; }
    public int getLadderCount()  { return ladderCount; }
 
    // ===================== Setter =====================
    public void setPosition(int position) { this.position = position; }
    public void setHasWon(boolean hasWon) { this.hasWon = hasWon; }
 
    // ===================== Method =====================
 
    /* Tambah hitungan giliran setiap pemain melempar dadu */
    public void incrementTurnCount() {
        turnCount++;
    }
 
    /** Tambah hitungan kena ular */
    public void incrementSnakeCount() {
        snakeCount++;
    }
 
    /* Tambah hitungan naik tangga */
    public void incrementLadderCount() {
        ladderCount++;
    }
 
    /* Cek apakah pemain sudah ada di papan (posisi >= 1) */
    public boolean isOnBoard() {
        return position >= 1;
    }
 
    /* Reset semua stats — dipakai saat new game */
    public void reset() {
        position     = 0;
        hasWon       = false;
        turnCount    = 0;
        snakeCount   = 0;
        ladderCount  = 0;
    }
 
    /* Apakah ini BotPlayer? Dioverride di subclass */
    public boolean isBot() {
        return false;
    }
 
    @Override
    public String toString() {
        return name + " (pos=" + position + ", menang=" + hasWon + ")";
    }
}
