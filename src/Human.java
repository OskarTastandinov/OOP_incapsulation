public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        if (name != name || name == null || name == "") {
            this.name = null;
        }else{
            this.name = name;
        }
        if (yearOfBirth < 0){
            this.yearOfBirth = Math.abs(yearOfBirth);
        }else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town != town || town == null || town == ""){
            this.town = null;
        }else{
            this.town = town;
        }
        if (job != job || job == null || job == ""){
            this.job = null;
        }else{
            this.job = job;
        }
    }

    public String getTown() {
        return this.town;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()){
            System.out.println("Информация не указана");
        }else{
            this.town = town;
        }

    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0){
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void human(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + getTown() +
                ". Мне " +  getYearOfBirth() + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
