import Interface.Device;
import Interface.ExternalPort;
import Port.*;

import java.util.List;

public class PortAdapter implements Device {

    ExternalPort externalDongle;



    public PortAdapter(String PortType) {

        if (PortType.equalsIgnoreCase("usbv2.0")){
            externalDongle = new USBv2();
        }
        else if (PortType.equalsIgnoreCase("usbv3.0")){
            externalDongle = new USBv3();
        }
        else if (PortType.equalsIgnoreCase("thunderbolt")){
            externalDongle = new Thunderbolt();
        }
        else if (PortType.equalsIgnoreCase("sd")){
            externalDongle = new MacroSD();
        }
        else if (PortType.equalsIgnoreCase("ethernet")){
            externalDongle = new Ethernet();
        }
        else if (PortType.equalsIgnoreCase("hdmi")){
            externalDongle = new HDMI();
        }

    }

    @Override
    public void Insert(String DeviceName, String PortType) {
        if (PortType.equalsIgnoreCase("usbv2.0")){
            externalDongle.InsertUSBv2(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("usbv3.0")){
            externalDongle.InsertUSBv3(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("thunderbolt")){
            externalDongle.InsertThunderbolt(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("sd")){
            externalDongle.InsertSD(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("ethernet")){
            externalDongle.InsertEthernet(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("hdmi")){
            externalDongle.InsertHDMI(DeviceName);
        }
    }
}
