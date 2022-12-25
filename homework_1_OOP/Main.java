package homework_1_OOP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

       Films films = new Films(null, 0, null, null);

        films.setFilms.add(new ComediesFilms("Classmates", 9, "Adam Sendler", null));
        films.setFilms.add(new ComediesFilms("Mask", 10, "Jim Carrey",null));
        films.setFilms.add(new ComediesFilms("Mr. Bean", 8, "Rowan Atkinson",null));
        
        films.setFilms.add(new Fighters("Terminator - 1", 10, "Arnold Schwarzenegger", null));
        films.setFilms.add(new Fighters("John Wick", 9, "Keanu Reeves", null));

        films.setFilms.add(new Fantasy("Avatar", 10, "Sam Worthington", null));
        films.setFilms.add(new Fantasy("Twilight", 2,  
        "Кристен Стюарт", null));
        
        System.out.println("Выберите фильм с библиотеки: \n"+films.setFilms);
        films.SearchByName();
       
            }
    }
