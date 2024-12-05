package structural.proxy.realsubject;

import structural.proxy.subjectInterface.Image;

public class HighResolutionImage implements Image {
    private String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-resolution image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying high-resolution image: " + fileName);
    }
}

