package transport;

public class Car extends Transport implements Competing {
    private TypeOfbody typeOfBody;
    public Car(String stamp, String model, double engineCapacity, TypeOfbody typeOfBody){
        super(stamp, model, engineCapacity);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfbody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfbody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        if(typeOfBody == null){
            System.out.println("Данных недостаточно");
        }else {
            this.typeOfBody = typeOfBody;
        }
    }

    @Override
    public String toString() {
            return "Марка - " + getStamp() + ", модель - " + getModel() +
                    ", тип кузова - " + getTypeOfBody() +
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
