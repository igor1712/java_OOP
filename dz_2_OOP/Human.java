package dz_2_OOP;

public abstract class Human {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String floor;
    private int id;

    public abstract void speak();
    public abstract void work();
    public abstract void sleep();
    
    public Human(String name, String surname, String patronymic, int age, String floor, int id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.floor = floor;
        this.id = id;
    }

}
