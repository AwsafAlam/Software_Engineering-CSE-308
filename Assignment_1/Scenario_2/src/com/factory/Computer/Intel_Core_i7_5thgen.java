package com.factory.Computer;

import com.factory.Resolution;

public class Intel_Core_i7_5thgen implements Resolution {

    private static final double Speed_in_GHz = 3.0;
    private static final double Memory = 16;

    public static double getSpeed_in_GHz() {
        return Speed_in_GHz;
    }

    public static double getMemory() {
        return Memory;
    }

    @Override
    public int getPixelLength() {
        return 2400;
    }

    @Override
    public int getPixelWidth() {
        return 1800;
    }
}
