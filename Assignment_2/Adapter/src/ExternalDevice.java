import Interface.Device;
import Interface.ExternalPort;
import Port.USB_C;

import java.util.ArrayList;
import java.util.List;

public class ExternalDevice implements Device {


    private PortAdapter portAdapter;
    private List<ExternalPort> adapterList;

    ExternalDevice(){
        adapterList = new ArrayList<>();
    }

    @Override
    public void Insert(String DeviceName, String PortType) {

        if (PortType.equalsIgnoreCase("usb-c") && adapterList.size() < 2){
            System.out.println("New External Device : "+ DeviceName +" detected at USB-C port");
            adapterList.add(new USB_C(DeviceName));
        }
        else if(PortType.equalsIgnoreCase("usbv2.0")
                ||PortType.equalsIgnoreCase("usbv3.0")
                ||PortType.equalsIgnoreCase("thunderbolt")
                ||PortType.equalsIgnoreCase("sd")
                ||PortType.equalsIgnoreCase("ethernet")
                ||PortType.equalsIgnoreCase("hdmi")){

            portAdapter = new PortAdapter(DeviceName,PortType, adapterList);
            portAdapter.Insert(DeviceName , PortType);
        }
        else if(adapterList.size() >= 2 ){
            System.out.println("Laptop does not have more than two ports");
        }
        else {
            System.out.println("External Device :"+DeviceName+" is incompatible");
        }

    }

    @Override
    public void Remove(String DeviceName, String PortType) {
        if (PortType.equalsIgnoreCase("usb-c")){
            System.out.println("New External Device : "+ DeviceName +" detected at USB-C port");
            adapterList.remove(new USB_C(DeviceName));
        }
        else if(PortType.equalsIgnoreCase("usbv2.0")
                ||PortType.equalsIgnoreCase("usbv3.0")
                ||PortType.equalsIgnoreCase("thunderbolt")
                ||PortType.equalsIgnoreCase("sd")
                ||PortType.equalsIgnoreCase("ethernet")
                ||PortType.equalsIgnoreCase("hdmi")){

            portAdapter = new PortAdapter(DeviceName, PortType, adapterList);
            portAdapter.Remove(DeviceName , PortType);
        }
        else {
            System.out.println("External Device :"+DeviceName+" is incompatible");
        }

    }


}
