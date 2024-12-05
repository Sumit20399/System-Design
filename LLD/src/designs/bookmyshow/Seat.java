package designs.bookmyshow;

public class Seat {
    private String seatId;
    private SeatType type;
    private boolean isAvailable;

    public Seat(String seatId, SeatType type) {
        this.seatId = seatId;
        this.type = type;
        this.isAvailable = true;
    }

    public boolean book() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void release() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public SeatType getType() {
        return type;
    }
}

