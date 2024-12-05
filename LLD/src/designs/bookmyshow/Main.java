package designs.bookmyshow;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Movie
        Movie movie = new Movie("M1", "Inception", "Sci-Fi", 148);

        // Step 2: Create a Theater and Screen
        Seat seat1 = new Seat("S1", SeatType.REGULAR);
        Seat seat2 = new Seat("S2", SeatType.PREMIUM);
        Screen screen = new Screen("SCR1", Arrays.asList(seat1, seat2));
        Theater theater = new Theater("T1", "PVR Cinemas", "Bangalore");
        theater.addScreen(screen);

        // Step 3: Create a Show
        Show show = new Show("SH1", movie, screen, LocalDateTime.now(), 200.0);

        // Step 4: Book a Seat
        User user = new User("U1", "John Doe", "john.doe@example.com");
        seat1.book();
        Booking booking = new Booking("B1", show, user, Arrays.asList(seat1));

        System.out.println("Booking created for user: " + user.getUserId());
        System.out.println("Total amount: " + booking.getTotalAmount());

        // Step 5: Payment
        Payment payment = new Payment("P1", booking.getTotalAmount());
        payment.completePayment();
        booking.confirmBooking();

        System.out.println("Payment status: " + payment.getStatus());
        System.out.println("Booking status: " + booking.getStatus());
    }
}

