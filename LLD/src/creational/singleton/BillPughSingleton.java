package creational.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private BillPughSingleton() {

    }
    private static class SingletonHelper {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // To prevent new instance creation during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
