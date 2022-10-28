package transport;

public class Train extends Transport {
    double priceTrip; // цена поездки
    double timeTrip; // время поездки
    String nameDepartureStation; // Название станции отбытия
    String finalStop; // конечная остановка
    int numberOfWagons; // количество вагонов

    public Train(String stamp, String model, int yearOfProduction, String countryOfAssembly ,double maxSpeed, String nameDepartureStation,
                 String finalStop, double priceTrip, int numberOfWagons, double timeTrip) {

        super(stamp,model,yearOfProduction, countryOfAssembly,maxSpeed);
        this.priceTrip = priceTrip;
        this.timeTrip = timeTrip;
        this.nameDepartureStation = nameDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }
    public double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(double timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        this.nameDepartureStation = nameDepartureStation;
    }
    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }
    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return (getStamp() + ", модель - " + getModel() + ", год выпуска - " + getYearOfProduction() +
                getCountryOfAssembly() + ", скорость передвижения - " + getMaxSpeed() + " км/ч,\n отходит от " +
                getNameDepartureStation() + " и следует до станции " + getFinalStop() + ".\n Цена поездки - " +
                getPriceTrip() + ", в поезде " + getNumberOfWagons() + ", время поездки - " + getTimeTrip() + " часа");
    }

    @Override
    public void refill() {
        System.out.println("Пора произвести заправку поезда дизелем!");
    }
}
