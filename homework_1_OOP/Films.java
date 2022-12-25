package homework_1_OOP;

import java.util.*;


public class Films {
    private String nameFilms;
    private int rang;
    private String actors;
    protected static String janr;
    
    Scanner scan = new Scanner(System.in);
    
    
    Set<Films> setFilms = new HashSet<Films>();
    List<Films> arrFilms = new ArrayList<Films>();
    
    public Films(String nameFilms, int rang, String actors, String janr) {
        this.nameFilms = nameFilms;
        this.rang = rang;
        this.actors = actors;
        
        
    }
    
    public String getNameFilms() {
        return nameFilms;
    }
    
    public int getRang() {
        return rang;
    }

    public String getActors() {
        return actors;
    }
    
    public String getJanr() {
        return janr;
    }
    
    
    public void add(Films fil) {
    }
    
    public void SearchByName(){
        System.out.println("Введите название фильма: ");
        String input = scan.nextLine();
        for (Films fil : setFilms) {
            if (fil.getNameFilms().equals(input))
                arrFilms.add(fil);  
            }
            System.out.println(arrFilms);
            System.out.println("Приятного просмотра:)");
            if(arrFilms.size() == 0){
                System.out.println("Такого фильма нет.");
            }
        }
    
    @Override
    public String toString() {
        return "\n Films " + nameFilms + ", rang= " + rang + ", actors= " + actors +", janr "+ getJanr()+"]";
        
    }
}