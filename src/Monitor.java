
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor() {
    }

    public Monitor(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
    @Override
    public String toString() {
        return super.toString() + ", X = " + resolutionX + ", Y = " + resolutionY;
    }
}
