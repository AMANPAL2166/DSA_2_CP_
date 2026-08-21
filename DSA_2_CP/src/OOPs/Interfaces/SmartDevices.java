package OOPs.Interfaces;

public interface SmartDevices {
    void turnOn();
    void turnOff();
    default void logStatus(String deviceName){
        System.out.println("[LOG]: " + deviceName + " state changed.");
    }
}
