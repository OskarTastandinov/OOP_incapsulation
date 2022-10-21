public class Main {
    public static void main(String[] args){
        Human maxim = new Human("Максим","Минск", 35, "Бренд менеджера");
        maxim.setTown(null);
        maxim.human();

        Human anna = new Human("Аня","Москва", 29, "методиста образовательных программ");
        anna.human();

        Human katya = new Human("Катя","Калининград", 28, "продакт-менеджера");
        katya.human();

        Human artem = new Human("Артем","Москва", 27, "директора по развитию бизнеса");
        artem.human();

        Human vladimir = new Human("Владимир","Казань", 21, "нигде не работает");
        vladimir.human();

    }

}


