package com.factory.Computer;

import com.factory.Resolution;

public class Intel_Core_i5_6thgen implements Resolution {

    private static final double Speed_in_GHz = 2.4;
    private static final double Memory = 8;

    public static double getSpeed_in_GHz() {
        return Speed_in_GHz;
    }

    public static double getMemory() {
        return Memory;
    }

    @Override
    public int getPixelLength() {
        return 1600;
    }

    @Override
    public int getPixelWidth() {
        return 900;
    }
}
