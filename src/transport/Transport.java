package transport;

public abstract class Transport {
    private final String stamp; // марка
    private final String model; // модель
    private final double engineCapacity; // объем двигателя

    public Transport(String stamp, String model, double engineCapacity) {
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
        if (engineCapacity <= 0){
            this.engineCapacity = 1.6;
        }else{
            this.engineCapacity = engineCapacity;
        }
    }
    public abstract void startMoving();
    public abstract void finishTheMovement();
    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
    public abstract void printType();
}

