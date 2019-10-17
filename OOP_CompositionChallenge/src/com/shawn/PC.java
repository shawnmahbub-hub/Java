package com.shawn;

public class PC {

    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getTheCase() {
        return theCase;
    }
}
