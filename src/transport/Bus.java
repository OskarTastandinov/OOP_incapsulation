package transport;

public class Bus extends Transport implements Competing {
    private Capasity capasity;
    public Bus(String stamp, String model, double engineCapacity, Capasity capasity){
        super(stamp, model, engineCapacity);
        this.capasity = capasity;
    }

    public Capasity getCapasity() {
        return capasity;
    }

    public void setCapasity(Capasity capasity) {
        this.capasity = capasity;
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
        if(capasity == null){
            System.out.println("Данных недостаточно");
        }else {
            System.out.println("Вместимость автобуса: " + capasity.getFrom() + " до " +
                    capasity.getTo());
        }
    }

    @Override
    public String toString() {
        return "Марка - " + getStamp() + ", модель - " + getModel() +
                ", объем двигателя - " + getEngineCapacity() + " л.";
    }

    @Override
    public void pitStop() {
        System.out.println("Заправить автобус");
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
