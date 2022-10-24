package transport;

public class Car {
    private String stamp; // марка
    private String model; // модель
    private double engineCapacity; // объем двигателя
    private String bodyColor; // цвет кузова
    private int yearOfProduction; // год выпуска
    private String countryOfAssembly; // страна сборки
    // новые свойства:
    private String transmission; // коробка передач
    private String bodyType; // тип кузова
    private String regNumber; // регистрационный номер
    private int numberOfSeats; // количество мест
    private String typeOfRubber; // тип резины
    public Car(String stamp, String model, int yearOfProduction,
               String countryOfAssembly, String bodyColor, double engineCapacity,
               String transmission, String bodyType, String regNumber, int numberOfSeats, String typeOfRubber){
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
        if(stamp == null){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null){
            this.model = "default";
        }else{
            this.model = model;
        }
        if(countryOfAssembly == null){
            this.countryOfAssembly = "default";
        }else{
            this.countryOfAssembly = countryOfAssembly;
        }
        if (engineCapacity <= 0){
            this.engineCapacity = 1.5;
        }else{
            this.engineCapacity = engineCapacity;
        }
        if (bodyColor == null){
            this.bodyColor = "Белый";
        }else{
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction <= 0){
            this.yearOfProduction = 2000;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
    }
    public Car(String stamp, String model, String countryOfAssembly, int yearOfProduction, String bodyColor,
               double engineCapacity, String transmission, String bodyType, String regNumber, int numberOfSeats, String typeOfRubber){
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
        if(stamp == null){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null){
            this.model = "default";
        }else{
            this.model = model;
        }
        if(countryOfAssembly == null){
            this.countryOfAssembly = "default";
        }else{
            this.countryOfAssembly = countryOfAssembly;
        }
        if (engineCapacity <= 0){
            this.engineCapacity = 1.5;
        }else{
            this.engineCapacity = engineCapacity;
        }
        if (bodyColor == null){
            this.bodyColor = "Белый";
        }else{
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction <= 0){
            this.yearOfProduction = 2000;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
    }
    public Car(String stamp, String model, String countryOfAssembly, String bodyColor, double engineCapacity,
               int yearOfProduction, String transmission, String bodyType, String regNumber, int numberOfSeats, String typeOfRubber){
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
        if(stamp == null){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null){
            this.model = "default";
        }else{
            this.model = model;
        }
        if(countryOfAssembly == null){
            this.countryOfAssembly = "default";
        }else{
            this.countryOfAssembly = countryOfAssembly;
        }
        if (engineCapacity <= 0){
            this.engineCapacity = 1.5;
        }else{
            this.engineCapacity = engineCapacity;
        }
        if (bodyColor == null){
            this.bodyColor = "Белый";
        }else{
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction <= 0){
            this.yearOfProduction = 2000;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
    }
    public static void rubberСhange(){
        int typeOfRubber = 1;
        switch (typeOfRubber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 10:
            case 11:
            case 12:
                System.out.println("Зимняя");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Летняя");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
    public String getStamp() {
        return this.stamp;
    }
    public String getModel() {
        return this.model;
    }
    public String getCountryOfAssembly() {
        return this.countryOfAssembly;
    }
    public int getYearOfProduction() {
        return this.yearOfProduction;
    }
    public String getBodyColor() {
        return this.bodyColor;
    }
    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }
}
