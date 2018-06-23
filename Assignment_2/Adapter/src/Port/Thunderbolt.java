package Port;

import Interface.ExternalPort;

public class Thunderbolt implements ExternalPort {
    @Override
    public void InsertEthernet(String Devicename) {

    }

    @Override
    public void InsertUSBv2(String Devicename) {

    }

    @Override
    public void InsertUSBv3(String Devicename) {

    }

    @Override
    public void InsertHDMI(String Devicename) {

    }

    @Override
    public void InsertThunderbolt(String Devicename) {
        System.out.println("New External Device : "+Devicename+" detected at Thunderbolt port");
    }

    @Override
    public void InsertSD(String Devicename) {

    }

    @Override
    public void InsertUSB_C(String Devicename) {

    }
}
