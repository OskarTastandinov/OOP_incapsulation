import transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Полиморфизм:");
        System.out.println("Легковые автомобили");
        printCar();
        System.out.println("Грузовые автомобили");
        printTrucks();
        System.out.println("Автобусы");
        printBus();
        System.out.println();

    }
    public static void printCar(){
        Car lada = new Car("Lada", "Grande",1.6, TypeOfbody.COMPARTMENT);
        lada.pitStop();
        lada.BestLapTime();
        lada.maxSpeed();
        lada.startMoving();
        lada.finishTheMovement();
        lada.printType();
        System.out.println(lada.toString());
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2.0, TypeOfbody.SEDAN);
        audi.pitStop();
        audi.BestLapTime();
        audi.maxSpeed();
        audi.startMoving();
        audi.finishTheMovement();
        audi.printType();
        System.out.println(audi.toString());
        Car bmw = new Car("BMW", "Z8",3.0, TypeOfbody.SEDAN);
        bmw.pitStop();
        bmw.BestLapTime();
        bmw.maxSpeed();
        bmw.startMoving();
        bmw.finishTheMovement();
        bmw.printType();
        System.out.println(bmw.toString());
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, TypeOfbody.SEDAN);
        kia.pitStop();
        kia.BestLapTime();
        kia.maxSpeed();
        kia.startMoving();
        kia.finishTheMovement();
        kia.printType();
        System.out.println(kia.toString());

    }
    public static void printTrucks(){
        Trucks kamaz = new Trucks("КАМАЗ", "0505",5, Weight.N1);
        kamaz.startMoving();
        kamaz.finishTheMovement();
        kamaz.pitStop();
        kamaz.BestLapTime();
        kamaz.maxSpeed();
        kamaz.printType();
        System.out.println(kamaz.toString());
        Trucks gaz66 = new Trucks("ГАЗ", "66",4,Weight.N2);
        gaz66.pitStop();
        gaz66.BestLapTime();
        gaz66.maxSpeed();
        gaz66.startMoving();
        gaz66.finishTheMovement();
        gaz66.printType();
        System.out.println(gaz66.toString());
        Trucks maz = new Trucks("МАЗ", "12313",5,Weight.N3);
        maz.pitStop();
        maz.BestLapTime();
        maz.maxSpeed();
        maz.startMoving();
        maz.finishTheMovement();
        maz.printType();
        System.out.println(maz.toString());
        Trucks mitsubishi = new Trucks("Mitsubishi", "Fuso",4,Weight.N1);
        mitsubishi.startMoving();
        mitsubishi.finishTheMovement();
        mitsubishi.printType();
        System.out.println(mitsubishi.toString());
    }
    public static void printBus(){
        Bus autobus1 = new Bus("ПАЗ","001", 5,Capasity.SMALL);
        autobus1.pitStop();
        autobus1.BestLapTime();
        autobus1.maxSpeed();
        autobus1.startMoving();
        autobus1.finishTheMovement();;
        autobus1.printType();
        System.out.println(autobus1.toString());
        Bus autobus2 = new Bus("Луиза","002", 5,Capasity.ESPECIALLY_BIG);
        autobus2.pitStop();
        autobus2.BestLapTime();
        autobus2.maxSpeed();
        autobus2.startMoving();
        autobus2.finishTheMovement();
        autobus2.printType();
        System.out.println(autobus2.toString());
        Bus autobus3 = new Bus("Электробус-1","01", 4,Capasity.ESPECIALLY_SMALL);
        autobus3.pitStop();
        autobus3.BestLapTime();
        autobus3.maxSpeed();
        autobus3.startMoving();
        autobus3.finishTheMovement();
        autobus3.printType();
        System.out.println(autobus3.toString());
        Bus autobus4 = new Bus("ПАЗ","001", 4,Capasity.BIG);
        autobus4.pitStop();
        autobus4.BestLapTime();
        autobus4.maxSpeed();
        autobus4.startMoving();
        autobus4.finishTheMovement();
        autobus4.printType();
        System.out.println(autobus4.toString());
    }
}


