package OOPs.InnerClasses;

import OOPs.Interfaces.SmartTv;

public class SmartHome {
    private String HomeName;
    private boolean isSecuritySystemAcitivate = true;
    //Contructor to initialize object
    public    SmartHome(String HomeName){
        this.HomeName = HomeName;
    }
    //1. Member Inner class
    //Represents a component tightly coupled with a specific SmartHome instance
    public class SmartLight{
        private String roomName;
        //Constructor
        public SmartLight( String roomName){
            this.roomName = roomName;
        }
        public  void turnON(){
            //Directly access outer class Home
            System.out.println(roomName + " light turned ON in " + HomeName);
        }
    }
    //Static nested class
    public static class TemperatureSensor{
        public static double celsiusToFahrenheit(double celsius){
            return (celsius * 9/5)+32;
        }
    }
    //Local Inner class
    public void RunSecurityCheck(String personName){
        class CheckValidator{
            boolean isValidator( ){
                return personName != null && !personName.isBlank();
            }
        }
        CheckValidator validator = new CheckValidator();
        if(validator.isValidator() && isSecuritySystemAcitivate){
            System.out.println("Access GRANTED for: " + personName);
        } else {
            System.out.println("Access DENIED.");
        }
    }
    //Interfaces and anonymous class
    public interface AlarmListener{
        void onTrigger(String message);
    }
    public void triggerAlarm(AlarmListener listener, String reason) {
        listener.onTrigger(reason);
    }


}
