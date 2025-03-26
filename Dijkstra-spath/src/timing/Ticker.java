package timing;

public class Ticker {
    private int ticks = 0;
    public void tick() { ticks++; }
    public int getTicks() { return ticks; }
}
