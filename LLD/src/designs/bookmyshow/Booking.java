package designs.bookmyshow;

import java.util.List;

public class Booking {
    private String bookingId;
    private Show show;
    private User user;
    private List<Seat> bookedSeats;
    private double totalAmount;
    private BookingStatus status;

    public Booking(String bookingId, Show show, User user, List<Seat> bookedSeats) {
        this.bookingId = bookingId;
        this.show = show;
        this.user = user;
        this.bookedSeats = bookedSeats;
        this.totalAmount = calculateTotalAmount();
        this.status = BookingStatus.PENDING;
    }

    private double calculateTotalAmount() {
        double total = 0.0;
        for (Seat seat : bookedSeats) {
            total += show.calculatePrice(seat.getType());
        }
        return total;
    }

    public void confirmBooking() {
        this.status = BookingStatus.BOOKED;
    }

    public void cancelBooking() {
        this.status = BookingStatus.CANCELLED;
        for (Seat seat : bookedSeats) {
            seat.release();
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status.name();
    }
}

class Payment {
    private String paymentId;
    private double amount;
    private PaymentStatus status;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }

    public void completePayment() {
        this.status = PaymentStatus.SUCCESS;
    }

    public String getStatus() {
        return status.name();
    }
}

