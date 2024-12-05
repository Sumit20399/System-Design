package structural.adapter.adapter;

import structural.adapter.adaptee.VGA;
import structural.adapter.target.HDMI;

public class VGAtoHDMIAdapter implements HDMI {
    private VGA vga;

    public VGAtoHDMIAdapter(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void displayHDMI() {
        System.out.println("Converting VGA signal to HDMI.");
        vga.displayVGA();
    }
}
