package com.shawn;

import java.lang.management.MemoryNotificationInfo;

public class Main {

    public static void main(String[] args) {
        Motherboard motherboard=new Motherboard("H310M-C/CSM","ASUS",8,8,"v2.44");
        Monitor monitor=new Monitor(24,"MSI","120Hz",new Resolution(1920,1080));
        Case theCase=new Case("GB-AC300W(2.0)","ATX","GIGABYTE",new Dimensions(8,8,30));

        PC newPC=new PC(motherboard,monitor,theCase);
        newPC.getTheCase().pressPowerButton(1);
        newPC.getMonitor().drawPixelAt(120,120,"Blue");
        newPC.getMotherboard().loadProgram("Windows 10 pro");

    }
}
