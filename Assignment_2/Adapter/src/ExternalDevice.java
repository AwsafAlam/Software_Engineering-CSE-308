import Interface.Device;

public class ExternalDevice implements Device {


    PortAdapter portAdapter;
    private static int DeviceCount=0;



    @Override
    public void Insert(String DeviceName, String PortType) {

        if (PortType.equalsIgnoreCase("usb-c") && DeviceCount < 2){
            DeviceCount++;
            System.out.println("New External Device : "+ DeviceName +" detected at USB-C port");

        }
        else if(PortType.equalsIgnoreCase("usbv2.0")
                ||PortType.equalsIgnoreCase("usbv3.0")
                ||PortType.equalsIgnoreCase("thunderbolt")
                ||PortType.equalsIgnoreCase("sd")
                ||PortType.equalsIgnoreCase("ethernet")
                ||PortType.equalsIgnoreCase("hdmi")){

            DeviceCount++;
            portAdapter = new PortAdapter(PortType);
            portAdapter.Insert(DeviceName , PortType);
        }
        else if(DeviceCount >= 2 ){
            System.out.println("Laptop does not have more than two ports");
        }
        else if( (PortType.equalsIgnoreCase("usbv2.0")
                ||PortType.equalsIgnoreCase("usbv3.0")
                ||PortType.equalsIgnoreCase("thunderbolt")
                ||PortType.equalsIgnoreCase("sd")
                ||PortType.equalsIgnoreCase("ethernet")
                ||PortType.equalsIgnoreCase("hdmi")
                ||PortType.equalsIgnoreCase("usb-c"))){

            portAdapter = new PortAdapter(PortType);
            portAdapter.Insert(DeviceName , PortType);

        }
        else {
            System.out.println("External Device :"+DeviceName+" is incompatible");
        }

    }

    public static int getDeviceCount() {
        return DeviceCount;
    }

    public static void setDeviceCount(int deviceCount) {
        DeviceCount = deviceCount;
    }

}
