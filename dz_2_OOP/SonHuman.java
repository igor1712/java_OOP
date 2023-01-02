package dz_2_OOP;

public class SonHuman extends FatherHuman {

    public SonHuman(String name, String surname, String patronymic, int age, String floor, int id) {
        super(name, surname, patronymic, age, floor, id);
        
    }
    
    @Override
    public void speak() {
        System.out.println("Говорит о мультиках.");
    }

    @Override
    public void work() {
        System.out.println("Идет в школу");
    }

    @Override
    public void sleep() {
        System.out.println("Сладко спит");
    }
    public void programmer(){
        System.out.println("Отлично знает программирование.");
    }

    @Override
    public String toString() {
        return "SonHuman: ";
    }
}
