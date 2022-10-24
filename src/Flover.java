public class Flover {
    private String name;
    private String flowerColor; // цвет цветка
    private String country; // Страна происхождения
    private double cost; // стоимость
    int lifeSpan; // Срок стояния, указанный в целых днях

    public String getName() {
        return name;
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public String getCountry() {
        return country;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public double getCost() {
        return cost;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }
    public Flover(String name, String country, double cost, String flowerColor, int lifeSpan){
        this.name = name;
        if (cost <= 0){
            this.cost = 1;
        }else{
            this.cost = cost;
        }
        if (lifeSpan <= 0){
            this.lifeSpan = 3;
        }else {
            this.lifeSpan = lifeSpan;
        }
        if (country == null || country.isEmpty()){
            this.country = "Россия";
        }else{
            this.country = country;
        }
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public void flover(){
        System.out.println("Название цветка - " + getName() + ", Страна - " + getCountry() + ", стоимость штуки - " +
                getCost() + ", цвет цветка - " + getFlowerColor() + ", cрок стояния - " + getLifeSpan() + " дня");
    }
}
