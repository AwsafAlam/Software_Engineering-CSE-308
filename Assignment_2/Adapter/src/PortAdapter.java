import Interface.Device;
import Interface.ExternalPort;
import Port.*;

import java.util.List;

public class PortAdapter implements Device {

    ExternalPort externalDongle;
    List<ExternalPort> adapterlist;


    public PortAdapter(String deviceName, String PortType, List<ExternalPort> adapterList) {

        this.adapterlist = adapterList;
        if (PortType.equalsIgnoreCase("usbv2.0")){
            externalDongle = new USBv2(deviceName);
        }
        else if (PortType.equalsIgnoreCase("usbv3.0")){
            externalDongle = new USBv3(deviceName);
        }
        else if (PortType.equalsIgnoreCase("thunderbolt")){
            externalDongle = new Thunderbolt(deviceName);
        }
        else if (PortType.equalsIgnoreCase("sd")){
            externalDongle = new MacroSD(deviceName);
        }
        else if (PortType.equalsIgnoreCase("ethernet")){
            externalDongle = new Ethernet(deviceName);
        }
        else if (PortType.equalsIgnoreCase("hdmi")){
            externalDongle = new HDMI(deviceName);
        }
        adapterList.add(externalDongle);

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

    @Override
    public void Remove(String DeviceName, String PortType) {
        if (PortType.equalsIgnoreCase("usbv2.0")){
            externalDongle = new USBv2(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("usbv3.0")){
            externalDongle = new USBv3(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("thunderbolt")){
            externalDongle = new Thunderbolt(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("sd")){
            externalDongle = new MacroSD(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("ethernet")){
            externalDongle = new Ethernet(DeviceName);
        }
        else if (PortType.equalsIgnoreCase("hdmi")){
            externalDongle = new HDMI(DeviceName);
        }
        adapterlist.remove(externalDongle);
    }
}
