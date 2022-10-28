package transport;

public class Bus extends Transport {
    private int numberSeats;
    public Bus(String stamp, String model, int yearOfProduction, String countryOfAssembly, String bodyColor, int numberSeats, double maxSpeed){
        super(stamp,model,yearOfProduction,countryOfAssembly,bodyColor,maxSpeed);
        this.numberSeats = numberSeats;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    @Override
    public String toString() {
        return "Марка - " + getStamp() + ", модель - " + getModel() + ", год выпуска - " + getYearOfProduction() +
                ", страна производитель - " + getCountryOfAssembly() + ", цвет кузова - " + getBodyColor() +
                ", количество мест - " + getNumberSeats() + ", максимальная скорость - " + getMaxSpeed() + " км/ч";
    }

    @Override
    public void refill() {
        System.out.println("Пора заправить автобус дизелем!");
    }
}
