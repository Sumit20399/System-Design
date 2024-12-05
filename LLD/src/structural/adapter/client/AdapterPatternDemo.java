package structural.adapter.client;

import structural.adapter.adaptee.VGA;
import structural.adapter.adapter.VGAtoHDMIAdapter;
import structural.adapter.target.HDMI;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        VGA vga = new VGA();
        HDMI adapter = new VGAtoHDMIAdapter(vga);

        adapter.displayHDMI();
    }
}
