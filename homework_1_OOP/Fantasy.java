package homework_1_OOP;


public class Fantasy extends Films {
    
    public Fantasy(String nameFilms, int rang, String actors, String janr) {
        super(nameFilms, rang, actors, janr);
    
    }
    public String getJanr() {
        return "Fantasy";
    }

 }

