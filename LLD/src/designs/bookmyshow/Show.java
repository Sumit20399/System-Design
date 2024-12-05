package designs.bookmyshow;

import java.time.LocalDateTime;

public class Show {
    private String showId;
    private Movie movie;
    private Screen screen;
    private LocalDateTime startTime;
    private double basePrice;

    public Show(String showId, Movie movie, Screen screen, LocalDateTime startTime, double basePrice) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.basePrice = basePrice;
    }

    public double calculatePrice(SeatType seatType) {
        switch (seatType) {
            case REGULAR:
                return basePrice;
            case PREMIUM:
                return basePrice * 1.5;
            case RECLINER:
                return basePrice * 2;
            default:
                return basePrice;
        }
    }
}

