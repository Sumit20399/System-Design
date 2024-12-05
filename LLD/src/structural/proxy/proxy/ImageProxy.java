package structural.proxy.proxy;

import structural.proxy.realsubject.HighResolutionImage;
import structural.proxy.subjectInterface.Image;

public class ImageProxy implements Image {
    private String fileName;
    private HighResolutionImage highResolutionImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (highResolutionImage == null) {
            highResolutionImage = new HighResolutionImage(fileName); // Lazy initialization
        }
        highResolutionImage.display();
    }
}

