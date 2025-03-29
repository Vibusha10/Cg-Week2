import java.util.Scanner;

class Device{
    protected int deviceId;
    protected String status;

    public Device(int deviceId,String status){
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device{
    private int temperatureSetting;

    public Thermostat(int deviceId,String Status,int temperatureSetting){
        super(deviceId,Status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus(){
        System.out.println("Device Details : ");
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status : " + status);
        System.out.println("Temperature Setting : " + temperatureSetting);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat(101, "ON", 24);
        t1.displayStatus();
    }
}