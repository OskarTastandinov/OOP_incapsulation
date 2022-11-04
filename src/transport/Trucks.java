package transport;

public class Trucks extends Transport implements Competing {
    private Weight weight;

    private static final String REMONT = "Осуществить ремонт транспорта";
    private static final String TIME_TRUCKS = "Засечь лучшее время проезда с начальной точки до конечной";
    private static final String SPEED_TRUCKS = "Замерить максимальную скорость";

    public Trucks(String stamp, String model, double engineCapacity, Weight weight){
        super(stamp, model, engineCapacity);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void startMoving() {
        System.out.println("начинаем движение с начала улицы");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("заканчиваем движение в конце улицы");
    }

    @Override
    public void printType() {
        if(weight == null){
            System.out.println("Данных недостаточно");
        }else {
            String from = weight.getFrom() == null?"":"от " + weight.getFrom() + " ";
            String to = weight.getTo() == null?"":"до " + weight.getTo();
            System.out.println("Грузоподъемность автомобиля: " + from + to);
        }
    }

    @Override
    public String toString() {
        return "Марка - " + getStamp() + ", модель - " + getModel() +
                ", объем двигателя - " + getEngineCapacity() + " л.";
    }

    @Override
    public void pitStop() {
        System.out.println("Заправить грузовой автомобиль");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Измерить лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Измерить максимальную скорость");
    }
}
