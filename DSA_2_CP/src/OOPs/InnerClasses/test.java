package OOPs.InnerClasses;

public class test {
    public static void main(String[] args) {
        // 1. Member Inner Class (Requires Outer Instance)
        SmartHome myHome = new SmartHome("Villa 404");
        SmartHome.SmartLight livingRoomLight = myHome.new SmartLight("Living Room");
        livingRoomLight.turnON();

        // 2. Static Nested Class (No Outer Instance Required)
        double fahrenheit = SmartHome.TemperatureSensor.celsiusToFahrenheit(25.0);
        System.out.println("Temperature: " + fahrenheit + " °F");

        // 3. Local Inner Class (Scoped inside method)
        myHome.RunSecurityCheck("Alex");

        // 4. Anonymous Inner Class (On-the-fly implementation)
        myHome.triggerAlarm(new SmartHome.AlarmListener() {
            @Override
            public void onTrigger(String message) {
                System.out.println("SIREN ALERT: " + message);
            }
        }, "Motion Detected!");

    }
}
