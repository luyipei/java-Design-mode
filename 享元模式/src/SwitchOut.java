public class SwitchOut implements NetworkDeviceOut{
    private String type;
    public SwitchOut(String type){
        this.type=type;
    }
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("Linked by switch,type is"+this.type+",port is"+port.getPort());

    }
}
