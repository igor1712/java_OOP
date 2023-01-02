package dz_2_OOP;

public class GrandfatherHuman extends Human {

    public GrandfatherHuman(String name, String surname, String patronymic, int age, String floor, int id) {
        super(name, surname, patronymic, age, floor, id);
       
    }


    @Override
    public void speak() {
        System.out.println("В мои годы все было по другому");  
    }

    @Override
    public void work() {
        System.out.println("Копает огород"); 
    }

    @Override
    public void sleep() {
        System.out.println("Спит и хропит...");
    }

    public void chessPlayer(){
        System.out.println("Отличный игрок в шахматы.");
    }


    @Override
    public String toString() {
        return "GrandfatherHuman: ";
    }




}
