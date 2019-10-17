package com.shawn;

public class Monitor {
    private int displaySize;
    private String brand;
    private String refreshRate;
    private Resolution nativeResolution;

    public Monitor(int displaySize, String brand, String refreshRate, Resolution nativeResolution) {
        this.displaySize = displaySize;
        this.brand = brand;
        this.refreshRate = refreshRate;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println("drawing pixel at: "+x+","+y+" in the color "+color);
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public String getBrand() {
        return brand;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
