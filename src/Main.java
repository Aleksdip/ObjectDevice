public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 120f,"AB1234567CD", 1280, 1024 );
        Device device = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(monitor);
        System.out.println(device);
        System.out.println(monitor.hashCode());
        System.out.println(device.hashCode());
        System.out.println(monitor.equals(device));
        System.out.println(device.equals(monitor));
    }
}
