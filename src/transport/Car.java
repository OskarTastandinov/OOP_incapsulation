package transport;

public class Car extends Transport {
    private double engineCapacity; // объем двигателя

    // новые свойства:
    private String transmission; // коробка передач
    private String bodyType; // тип кузова
    private String regNumber; // регистрационный номер
    private int numberOfSeats; // количество мест
    private String typeOfRubber; // тип резины
    public Car(String stamp, String model, int yearOfProduction,
               String countryOfAssembly, String bodyColor, double engineCapacity,
               String transmission, String bodyType, String regNumber, int numberOfSeats, String typeOfRubber, double maxSpeed){
        super(stamp, model, yearOfProduction, countryOfAssembly, bodyColor, maxSpeed);
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;

        if (engineCapacity <= 0){
        this.engineCapacity = 1.5;
    }else{
        this.engineCapacity = engineCapacity;
        }
    }
    public double getEngineCapacity() {
        return engineCapacity;
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

    /*public void car(){
        System.out.println(getStamp() + " " + getModel() + ", " + getYearOfProduction() + " год выпуска, " +
                getCountryOfAssembly() + ", " + getBodyColor() + ", объем двигателя - " + engineCapacity +
                ", коробка передач - " + transmission + ", \nтип кузова - " + bodyType +
                ", регистрационный номер - " + regNumber + ", количество мест - " + numberOfSeats +
                ", тип резины - " + typeOfRubber + ", Максимальная скорость - " + getMaxSpeed() + " км/ч");
    }*/

    @Override
    public String toString() {
        return getStamp() + " " + getModel() + ", " + getYearOfProduction() + " год выпуска, " +
                getCountryOfAssembly() + ", " + getBodyColor() + ", объем двигателя - " + engineCapacity +
                ", коробка передач - " + transmission + ", \nтип кузова - " + bodyType +
                ", регистрационный номер - " + regNumber + ", количество мест - " + numberOfSeats +
                ", тип резины - " + typeOfRubber + ", Максимальная скорость - " + getMaxSpeed() + " км/ч";
    }

    public static class Key{
        private String remoteEngineStart; // удалённый запуск двигателя
        private String keylessAccess; // без ключевой доступ
        private Key key;

        public Key getKey() {
            return key;
        }

        public void setKey(Key key) {
            if (key == null){
                this.key = key;
            }
        }

        public Key(String remoteEngineStart, String keylessAccess){
            if (remoteEngineStart == null || remoteEngineStart.isEmpty()){
                this.remoteEngineStart = "default";
            }else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null || keylessAccess.isEmpty()){
                this.keylessAccess = "default";
            }else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }


    }
    public static class Insurance {
        private double InsuranceValidityPeriod; // Срок действия страховки
        private double costOfInsurance; // Стоимость страховки
        private int InsuranceNumber; // Номер страховки

        public double getInsuranceValidityPeriod() {
            if (InsuranceValidityPeriod <= 0){ // проверка на отрицательность и 0
                this.InsuranceValidityPeriod = 1; // хотя бы будет единица
            }else {
                this.InsuranceValidityPeriod = InsuranceValidityPeriod;
            }
            return InsuranceValidityPeriod;
        }

        public double getCostOfInsurance() {
            if (InsuranceValidityPeriod <= 0){ // проверка на отрицательность и 0
                this.InsuranceValidityPeriod = 1; // хотя бы будет единица
            }else {
                this.InsuranceValidityPeriod = InsuranceValidityPeriod;
            }
            return costOfInsurance;
        }

        public int getInsuranceNumber() {
            if (InsuranceValidityPeriod <= 0){ // проверка на отрицательность и 0
                this.InsuranceValidityPeriod = 1; // хотя бы будет единица
            }else {
                this.InsuranceValidityPeriod = InsuranceValidityPeriod;
            }
            return InsuranceNumber;
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
    @Override
    public void refill() {
        System.out.println("Пора заправить автомобиль бензином!");
    }
}
