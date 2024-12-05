package structural.proxy.client;

import structural.proxy.proxy.ImageProxy;
import structural.proxy.subjectInterface.Image;

public class ProxyPatternExample {
    public static void main(String[] args) {
        // Using Proxy
        Image image1 = new ImageProxy("Photo1.jpg");
        Image image2 = new ImageProxy("Photo2.jpg");

        // The images are not loaded from disk yet.
        System.out.println("Image1 display call:");
        image1.display(); // Loads and displays the first image.

        System.out.println("\nImage1 display call again:");
        image1.display(); // Uses the already loaded image.

        System.out.println("\nImage2 display call:");
        image2.display(); // Loads and displays the second image.
    }
}

