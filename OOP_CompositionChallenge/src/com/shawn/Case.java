package com.shawn;

public class Case {
    private String model;
    private String size;
    private String manufacturer;
    private Dimensions dimensions;

    public Case(String model, String size, String manufacturer, Dimensions dimensions) {
        this.model = model;
        this.size = size;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(int button)
    {
        if (button==1)
        {
            System.out.println("the pc is turning on");
        }else {
            System.out.println("the pc is off");
        }

    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
