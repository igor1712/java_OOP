package dz_2_OOP;

public class FatherHuman extends GrandfatherHuman{

    
    public FatherHuman(String name, String surname, String patronymic, int age, String floor, int id) {
        super(name, surname, patronymic, age, floor, id);  
      
    }
    
    @Override
    public void speak() {
        System.out.println("Опять чем то не доволен");
    }

    @Override
    public void work() {
        System.out.println("Работает...");
    }

    @Override
    public void sleep() {
        System.out.println("Спит после рабочего дня");
    }
    public void engineer(){
        System.out.println("Отличный инженер.");
    }

    @Override
    public String toString() {
        return "FatherHuman: ";
    }
    
}
