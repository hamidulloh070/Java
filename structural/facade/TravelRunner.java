package structural.facade;

public class TravelRunner {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();

        travelFacade.bookTrip();
        travelFacade.cancelTrip();
    }
}
