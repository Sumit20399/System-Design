package structural.facade.client;

import structural.facade.facade.HotelFacade;

public class FacadePatternExample {
    public static void main(String[] args) {
        // Using the Facade
        HotelFacade hotelFacade = new HotelFacade();

        // Client requests menus via the facade
        System.out.println("Veg Menu:");
        System.out.println(hotelFacade.getVegMenu());

        System.out.println("\nNon-Veg Menu:");
        System.out.println(hotelFacade.getNonVegMenu());

        System.out.println("\nDessert Menu:");
        System.out.println(hotelFacade.getDessertMenu());
    }
}
