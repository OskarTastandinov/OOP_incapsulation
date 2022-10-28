package transport;

public abstract class Transport {

    private String stamp; // марка
    private String model; // модель
    private int yearOfProduction; // год выпуска (НЕ ИЗМЕНЯЕТСЯ, убираем сеттер)
    private String countryOfAssembly; // страна сборки (НЕ ИЗМЕНЯЕТСЯ, убираем сеттер)
    private String bodyColor; // цвет кузова
    private double maxSpeed; // максимальная скорость

    public Transport(String stamp, String model, int yearOfProduction, String countryOfAssembly, String bodyColor, double maxSpeed) {
        if(stamp == null || stamp.isEmpty()){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null || model.isEmpty()){
            this.model = "default";
        }else{
            this.model = model;
        }
        if (bodyColor == null || bodyColor.isEmpty()){ // УСЛОВИЯ ДЛЯ ЦВЕТА КУЗОВА
            this.bodyColor = "default";
        }else{
            this.bodyColor = bodyColor;
        }
        if (maxSpeed <= 0){
            this.maxSpeed = 1;
        }else {
            this.maxSpeed = maxSpeed;
        }
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
    }
    public Transport(String stamp, String model, int yearOfProduction, String countryOfAssembly, double maxSpeed){
        if(stamp == null || stamp.isEmpty()){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null || model.isEmpty()){
            this.model = "default";
        }else{
            this.model = model;
        }
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;
        this.countryOfAssembly = countryOfAssembly;
    }
    public abstract void refill();

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getBodyColor() {
        return bodyColor = bodyColor;
    }


    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
