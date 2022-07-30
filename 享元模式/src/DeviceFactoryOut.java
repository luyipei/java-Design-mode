import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class DeviceFactoryOut {
    private ArrayList devices=new ArrayList();
    private int totalTerminal=0;

    public DeviceFactoryOut(){
        NetworkDeviceOut nd1=new SwitchOut("cisco-ws-c2950-24");
        devices.add(nd1);
        NetworkDeviceOut nd2=new HubOut("tp-link-hf8m");
        devices.add(nd2);
    }

    public NetworkDeviceOut getNetworkDevice(String type)
    {
        if (type.equalsIgnoreCase("cisco"))
        {
            totalTerminal++;
            return (NetworkDeviceOut) devices.get(0);
        }
        else if (type.equalsIgnoreCase("tp")){
            totalTerminal++;
            return (NetworkDeviceOut) devices.get(1);
        }
        else {
            return null;
        }
    }

    public int getTotalDevice(){
        return devices.size();
    }
    public int getTotalTerminal(){
        return totalTerminal;
    }
}
