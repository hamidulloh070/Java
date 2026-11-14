package structural.facade;

public class TravelFacade {
    private final FlightBooking flightBooking;
    private final HotelBooking hotelBooking;
    private final Payment payment;

    public TravelFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.payment = new Payment();
    }

    public void bookTrip() {
        System.out.println("Sayohatni bron qilish jarayoni boshlandi...");
        flightBooking.bookFlight();
        hotelBooking.bookHotel();
        payment.makePayment();
        System.out.println("Sayohat muvaffaqiyatli to'liq bron qilindi!\n");
    }

    public void cancelTrip() {
        System.out.println("Sayohatni bekor qilish jarayoni boshlandi...");
        flightBooking.cancelFlight();
        hotelBooking.cancelHotel();
        payment.refundPayment();
        System.out.println("Sayohat muvaffaqiyatli bekor qilindi va to'lov qaytarildi.");
    }
}
