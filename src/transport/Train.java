package transport;
public class Train extends Transport {

    public Train(String stamp, String model, double engineCapacity){
        super(stamp, model, engineCapacity);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    @Override
    public String toString() {
        return getStamp() + ", модель - " + getModel() + ", объем двигателя - " + getEngineCapacity();
    }
}
