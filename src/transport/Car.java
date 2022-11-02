package transport;

public class Car extends Transport implements Competing {

    public Car(String stamp, String model, double engineCapacity){
        super(stamp, model, engineCapacity);
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
    public String toString() {
            return "Марка - " + getStamp() + ", модель - " + getModel() +
                    ", объем двигателя - " + getEngineCapacity() + " л.";
    }

    @Override
    public void pitStop() {
        System.out.println("Заправить легковой автомобиль");
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
