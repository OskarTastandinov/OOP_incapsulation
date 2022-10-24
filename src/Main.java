import transport.Car;
public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");
        task1();
        System.out.println("ЗАДАНИЕ 2");
        task2();
        System.out.println("ЗАДАНИЕ 3");
        task3();
        System.out.println("ЗАДАНИЕ 4");
        task4();

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
        Car lada = new Car("Lada", "Grande",0,
                "сборка в России", "желтого цвета", 0,
                "Автомат", "Седан", "А042АС04",4, "Зимняя");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020,
                "сборка в Германии", "черный цвет кузова", 3.0,
                "Автомат", "Седан", "А042АС04",4, "Зимняя");

        Car bmw = new Car("BMW", "Z8", "Сборка в Германии",
                2021, "черный цвет кузова", 3.0, "Автомат",
                "Седан", "А042АС04",4, "Зимняя");

        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Сборка в Южной Корее", "цвет кузова красный", 2.4,
                "Автомат", "Седан", "А042АС04",4, "Зимняя");


        Car hyundai = new Car("Hyundai", "Avante", "сборка в Южной Корее", "цвет кузова оранжевый", 1.6, 2016,
                "Автомат", "Седан", "А042АС04",4, "Зимняя");

        System.out.println(lada.getStamp() + " " + lada.getModel() + ", " + lada.getYearOfProduction() + " год выпуска, " +
                lada.getCountryOfAssembly() + ", " + lada.getBodyColor() + ", объем двигателя - " + lada.getEngineCapacity() +
                        ", коробка передач - " + lada.getTransmission() + ", \nтип кузова - " + lada.getBodyType() +
                ", регистрационный номер - " + lada.getRegNumber() + ", количество мест - " + lada.getNumberOfSeats() + ", тип резины - " + lada.getTypeOfRubber());

        System.out.println(audi.getStamp() + " " + audi.getModel() + ", " + audi.getYearOfProduction() + " год выпуска, " +
                audi.getCountryOfAssembly() + ", " + audi.getBodyColor() + ", объем двигателя - " + audi.getEngineCapacity() +
                ", коробка передач - " + audi.getTransmission() + ", \nтип кузова - " + audi.getBodyType() +
                ", регистрационный номер - " + audi.getRegNumber() + ", количество мест - " + audi.getNumberOfSeats() + ", тип резины - " + audi.getTypeOfRubber());

        System.out.println(bmw.getStamp() + " " + bmw.getModel() + ", " + bmw.getCountryOfAssembly() + ", в " +
                bmw.getYearOfProduction() + " году, " + bmw.getBodyColor() + ", объем - " + bmw.getEngineCapacity() +
                ", коробка передач - " + bmw.getTransmission() + ", \nтип кузова - " + bmw.getBodyType() +
                ", регистрационный номер - " + bmw.getRegNumber() + ", количество мест - " + bmw.getNumberOfSeats() + ", тип резины - " + bmw.getTypeOfRubber());

        System.out.println(kia.getStamp() + " " + kia.getModel() + ", " + kia.getYearOfProduction() + " года выпуска, " +
                kia.getCountryOfAssembly() + ", " + kia.getBodyColor() + ", объем двигателя - " + kia.getEngineCapacity() +
                ", коробка передач - " + kia.getTransmission() + ", \nтип кузова - " + kia.getBodyType() +
                ", регистрационный номер - " + kia.getRegNumber() + ", количество мест - " + kia.getNumberOfSeats() + ", тип резины - " + kia.getTypeOfRubber());

        System.out.println(hyundai.getStamp() + " " + hyundai.getModel() + ", " + hyundai.getCountryOfAssembly() + ", " +
                hyundai.getBodyColor() + ", объем двигателя - " + hyundai.getEngineCapacity() + ", год выпуска - " +
                hyundai.getYearOfProduction() + " год, коробка передач - " + hyundai.getTransmission() + ", \nтип кузова - " + hyundai.getBodyType() +
                ", регистрационный номер - " + hyundai.getRegNumber() + ", количество мест - " + hyundai.getNumberOfSeats() + ", тип резины - " + hyundai.getTypeOfRubber());
    }
    public static void task4(){

    }
}


