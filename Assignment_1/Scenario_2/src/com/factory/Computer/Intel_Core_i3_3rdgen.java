package com.factory.Computer;

import com.factory.Resolution;

public class Intel_Core_i3_3rdgen implements Resolution {

    private static final double Speed_in_GHz = 2.1;
    private static final double Memory = 4;

    public static double getSpeed_in_GHz() {
        return Speed_in_GHz;
    }

    public static double getMemory() {
        return Memory;
    }

    @Override
    public int getPixelLength() {
        return 840;
    }

    @Override
    public int getPixelWidth() {
        return 720;
    }
}
