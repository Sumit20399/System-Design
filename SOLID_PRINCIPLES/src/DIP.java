public class DIP {
    /*

    High-level modules should not depend on low-level modules.
    Both should depend on abstractions (interfaces).
    Also, abstractions should not depend on details.
    Details should depend on abstractions.

    // Without DIP - tight coupling
    class LightBulb {
        public void turnOn() {
            System.out.println("LightBulb is on");
        }

        public void turnOff() {
            System.out.println("LightBulb is off");
        }
    }

    class Switch {
        private LightBulb lightBulb;

        public Switch(LightBulb lightBulb) {
            this.lightBulb = lightBulb;
        }

        public void operate() {
            lightBulb.turnOn();
        }
    }

    In this example, Switch depends directly on the LightBulb class, creating tight coupling.

     */
}

// With DIP - loose coupling
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
/*
Here, the Switch class depends on the Switchable interface,
not on specific implementations like LightBulb or Fan,
promoting flexibility and loose coupling.
 */
