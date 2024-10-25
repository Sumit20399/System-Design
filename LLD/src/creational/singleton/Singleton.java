package creational.singleton;

import java.io.Serializable;

/*
How volatile Solves the Issue
The volatile keyword prevents this issue by ensuring visibility and ordering guarantees:

Visibility: When a thread writes to a volatile variable, the new value is immediately
            visible to all other threads. So, if one thread assigns an object reference
            to the instance variable, other threads will immediately see it.

Ordering: The volatile keyword prevents instruction reordering.
          It guarantees that the steps in object creation (allocation, initialization, and assignment)
          happen in the correct order.
 */

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // Volatile keyword ensures visibility of changes across threads
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() { }

    // Double-checked locking for thread-safe instance creation
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // readResolve method to return the same instance during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
