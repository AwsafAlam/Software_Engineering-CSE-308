import Interface.Device;

public class ExternalDevice implements Device {

    PortAdapter portAdapter;

    @Override
    public void Insert(String DeviceName, String PortType) {
        if (PortType.equalsIgnoreCase("usb-c")){
            System.out.println("New External Device : "+DeviceName+" detected at USB-C port");
        }
        else if(PortType.equalsIgnoreCase("usbv2.0")
                ||PortType.equalsIgnoreCase("usbv3.0")
                ||PortType.equalsIgnoreCase("thunderbolt")
                ||PortType.equalsIgnoreCase("sd")
                ||PortType.equalsIgnoreCase("ethernet")
                ||PortType.equalsIgnoreCase("hdmi")){

            portAdapter = new PortAdapter(PortType);
            portAdapter.Insert(DeviceName , PortType);
        }
        else {
            System.out.println("External Device :"+DeviceName+" is incompatible");
        }

    }

}
