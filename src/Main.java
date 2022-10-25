import transport.Car;
import transport.Car.Key;
public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");
        task1();
        System.out.println("ЗАДАНИЕ 2");
        task2();
        System.out.println("ЗАДАНИЕ 3");
        task3();


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
                "Автомат", "Седан", "А042АС04",4, "Зимняя");
        lada.setKay(keyCar);

        lada.car();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020,
                "сборка в Германии", "черный цвет кузова", 3.0,
                "Автомат", "Седан", "А042АС04",4, "Зимняя");
        audi.car();
        Car bmw = new Car("BMW", "Z8",2021, "Сборка в Германии",
                "черный цвет кузова",3.0,"Автомат","Седан","А042АС04",
                4,"Зимняя");
        bmw.car();
        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Сборка в Южной Корее",
                "цвет кузова красный", 2.4,
                "Автомат", "Седан", "А042АС04",4, "Зимняя");
        kia.car();
        Car hyundai = new Car("Hyundai", "Avante", 2016, "сборка в Южной Корее",
                "цвет кузова оранжевый", 1.6, "Автомат", "Седан", "А042АС04",
                4, "Зимняя");
        hyundai.car();


    }
}


