package OOPs.Interfaces;
    public class SmartTv implements SmartDevices, WifiConnectable {

    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned ON.");
        logStatus("Smart TV"); // Calling the default method
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned OFF.");
        logStatus("Smart TV"); // Calling the default method
    }

    @Override
    public void connectToWifi(String network) {
        System.out.println("Connecting Smart TV to Wi-Fi network: " + network);
    }
}