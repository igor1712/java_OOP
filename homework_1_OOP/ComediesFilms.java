package homework_1_OOP;


public class ComediesFilms extends Films{

    public ComediesFilms(String nameFilms, int rang, String actors, String getJanr) {
        super(nameFilms, rang, actors, janr);
      
    }

    public String getJanr() {
        return "Comedies";
    }  
}
