package transport;

public class DriverC <B extends Driver> {
    public void pitStop() {
        System.out.println("заправить авто");
    }
    public void stop(){
        System.out.println("остановиться");
    }
    public void begin(){
        System.out.println("начать движение");
    }

    public void DriverB(String FIO, String driversLicense) {
        System.out.println(FIO + " управляет " + driversLicense + " и будет участвовать в заезде");
    }
}
