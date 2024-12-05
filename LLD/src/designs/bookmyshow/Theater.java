package designs.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String theaterId;
    private String name;
    private String location;
    private List<Screen> screens;

    public Theater(String theaterId, String name, String location) {
        this.theaterId = theaterId;
        this.name = name;
        this.location = location;
        this.screens = new ArrayList<>();
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public List<Screen> getScreens() {
        return screens;
    }
}

class Screen {
    private String screenId;
    private List<Seat> seats;

    public Screen(String screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

