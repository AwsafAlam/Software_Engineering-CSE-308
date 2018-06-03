package Interface;

public interface ExternalPort {
    public void InsertEthernet(String Devicename);
    public void InsertUSBv2(String Devicename);
    public void InsertUSBv3(String Devicename);
    public void InsertHDMI(String Devicename);
    public void InsertThunderbolt(String Devicename);
    public void InsertSD(String Devicename);

}
