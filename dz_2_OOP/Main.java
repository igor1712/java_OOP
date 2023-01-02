package dz_2_OOP;

public class Main {
    public static void main(String[] args) {
        GrandfatherHuman gf = new GrandfatherHuman("Петр", "Третьяков", "Витальевич", 78, "Мужской", 1);
        FatherHuman father = new FatherHuman("Иван", "Третьяков", "Петрович", 47, "Мужской", 2);
        SonHuman son = new SonHuman("Олег", "Третьяков", "Иванович", 15, "Мужской", 3);

        System.out.println(gf.toString());
        gf.chessPlayer();

        System.out.println(father.toString());
        father.chessPlayer();
        father.engineer();

        System.out.println(son.toString());
        son.chessPlayer();
        son.engineer();
        son.programmer();

    }
    
}
