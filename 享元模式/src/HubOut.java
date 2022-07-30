public class HubOut implements NetworkDeviceOut{
    private String type;
    public HubOut(String type){
        this.type=type;
    }
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("Linked by Hub,type is"+this.type+",port is"+port.getPort());

    }
}
