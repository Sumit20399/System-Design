package structural.facade.facade;

import structural.facade.subsystem.DessertRestaurant;
import structural.facade.subsystem.NonVegRestaurant;
import structural.facade.subsystem.VegRestaurant;

public class HotelFacade {
    private VegRestaurant vegRestaurant;
    private NonVegRestaurant nonVegRestaurant;
    private DessertRestaurant dessertRestaurant;

    public HotelFacade() {
        this.vegRestaurant = new VegRestaurant();
        this.nonVegRestaurant = new NonVegRestaurant();
        this.dessertRestaurant = new DessertRestaurant();
    }

    public String getVegMenu() {
        return vegRestaurant.getMenu();
    }

    public String getNonVegMenu() {
        return nonVegRestaurant.getMenu();
    }

    public String getDessertMenu() {
        return dessertRestaurant.getMenu();
    }
}

