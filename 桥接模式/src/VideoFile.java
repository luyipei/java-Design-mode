public abstract class VideoFile {
    protected OperatingSystemVersion operatingSystemVersion;
    public void getOperatingSystemVersion(OperatingSystemVersion operatingSystemVersion){
        this.operatingSystemVersion=operatingSystemVersion;
    }
    public abstract void play();
}
