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
    public void car(){
        System.out.println(stamp + " " + model + ", " + yearOfProduction + " год выпуска, " +
                countryOfAssembly + ", " + bodyColor + ", объем двигателя - " + engineCapacity +
                ", коробка передач - " + transmission + ", \nтип кузова - " + bodyType +
                ", регистрационный номер - " + regNumber + ", количество мест - " + numberOfSeats + ", тип резины - " + typeOfRubber);
    }

    public static class Key{
        private String remoteEngineStart; // удалённый запуск двигателя
        private String keylessAccess; // бесключевой доступ
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

    /*Данные параметры неизменяемые. Добавьте ко всем новым полям проверку данных, что параметры не пустые, не равны null и содержат корректные данные.
    Добавьте метод проверки срока годности страховки - не просрочена ли она. Если страховка просрочена, то в консоль должно выводится предупреждающее
    сообщение о том, что нужно срочно ехать оформлять новую страховку. Если страховка ещё действует, то никаких сообщений выводить не нужно.
    Добавьте метод проверки, что номер страховки содержит 9 знаков. Если знаков больше или меньше, то вывести сообщение “Номер страховки некорректный!”

    Добавьте к каждому уже созданному объекту данные о страховке, подставив собственные значения

- Критерии оценки:
            - Создан вложенный класс insurance
    - Созданы параметры класса
    - Создан метод проверки данных срока годности и номера страховки
    - Все параметры вложенного класса помечены модификатором доступа private
    - Создан конструктор для создания нового объекта класса*/
}
