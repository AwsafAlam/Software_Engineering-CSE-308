package Port;

import Interface.ExternalPort;

public class Ethernet implements ExternalPort {
    @Override
    public void InsertEthernet(String Devicename) {
        System.out.println("New External Device : "+Devicename+" detected at Ethernet port");
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

    }

    @Override
    public void InsertSD(String Devicename) {

    }
}
