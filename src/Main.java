import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");
        task1();
        System.out.println("ЗАДАНИЕ 2");
        task2();
        System.out.println("ЗАДАНИЕ 3");
        task3();
        System.out.println("ЗАДАНИЕ 1.2 (Инкапсуляция)");
        task4();
        System.out.println("ЗАДАНИЕ 1.3 (Инкапсуляция)");
        task5();
    }
    public static void task1(){
        Human maxim = new Human("Максим", "Минск", 35, "Бренд менеджера");
        maxim.setTown(null);
        maxim.human();
        Human anna = new Human("Аня", "Москва", 29, "методиста образовательных программ");
        anna.human();
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджера");
        katya.human();
        Human artem = new Human("Артем", "Москва", 27, "директора по развитию бизнеса");
        artem.human();
        Human vladimir = new Human("Владимир", "Казань", 21, "Нигде не работаю");
        vladimir.human1();
    }
    public static void task2(){
        Flover rose = new Flover("Роза обыкновенная", "Голландия", 35.59, "", 0);
        rose.flover();
        Flover chrysanthemum = new Flover("Хризантема", "", 15, "", 5);
        chrysanthemum.flover();
        Flover pion = new Flover("Пион", "Англия", 69.9, "", 1);
        pion.flover();
        Flover gypsophila = new Flover("Гипсофила", "Турция", 19.5, "", 10);
        gypsophila.flover();
    }
    public static void task3(){
        Key keyCar = new Key("sd", "df");

        Car lada = new Car("Lada", "Grande",0,
                "сборка в России", "желтого цвета", 0,
                "Автомат", "Седан", "А042АС04",4, "Зимняя", 100);
        lada.refill();
        System.out.println(lada.toString());
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020,
                "сборка в Германии", "черный цвет кузова", 3.0,
                "Автомат", "Седан", "А042АС04",4, "Зимняя", 100);
        audi.refill();
        System.out.println(audi.toString());
        Car bmw = new Car("BMW", "Z8",2021, "Сборка в Германии",
                "черный цвет кузова",3.0,"Автомат","Седан","А042АС04",
                4,"Зимняя", 100);
        bmw.refill();
        System.out.println(bmw.toString());
        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Сборка в Южной Корее",
                "цвет кузова красный", 2.4,
                "Автомат", "Седан", "А042АС04",4, "Зимняя", 100);
        kia.refill();
        System.out.println(kia.toString());
        Car hyundai = new Car("Hyundai", "Avante", 2016, "сборка в Южной Корее",
                "цвет кузова оранжевый", 1.6, "Автомат", "Седан", "А042АС04",
                4, "Зимняя", 100);
        hyundai.refill();
        System.out.println(hyundai.toString());
    }
    public static void task4(){
        Train train1 = new Train("Поезд Ласточка", "В-901",2011,
                "в России", 301, "Белорусского вокзала",
                "Минск-Пассжарский",3500, 11, 23);
        train1.refill();
        System.out.println(train1.toString());
        Train train2 = new Train("Поезд Ленинград", "D-125",2019,
                "в России", 270, "Ленинградского вокзала",
                "Ленинград-Пассажирский",1700, 8, 9);
        train2.refill();
        System.out.println(train2.toString());

    }
    public static void task5(){
        Bus autobus1 = new Bus("ПАЗ","001", 2000, "Россия", "Серый", 20,35);
        autobus1.refill();
        System.out.println(autobus1.toString());
        Bus autobus2 = new Bus("Луиза","002", 2001, "Россия", "Красный", 22,50);
        autobus1.refill();
        System.out.println(autobus2.toString());
        Bus autobus3 = new Bus("Электробус-1","01", 2022, "Россия", "Белый", 30,100);
        autobus1.refill();
        System.out.println(autobus3.toString());

    }
}


