package transport;

public enum Capasity {
    ESPECIALLY_SMALL(0,10),
    SMALL(10,25),
    AVERAGE(40,65),
    BIG(60,80),
    ESPECIALLY_BIG(100,120);

    private final int from;
    private final int to;


    Capasity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
