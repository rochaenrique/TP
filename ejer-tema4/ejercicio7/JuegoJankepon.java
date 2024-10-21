import java.util.Scanner;

enum Jankepon  { 
    TIJERAS, PAPEL, PIEDRA, LAGARTO, SPOCK;
}

public class JuegoJankepon { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su jugada (");
        Jankepon[] plays = Jankepon.values();
        for (Jankepon play : plays)  
            System.out.print(play.name().substring(0, 1) + play.name().substring(1).toLowerCase() + ", ");
        System.out.print("): ");

        Jankepon player = Jankepon.valueOf(sc.next().toUpperCase());
        System.out.println("Has jugado " + player.name());
        Jankepon computer = plays[(int)(Math.random() * plays.length) + 1];
        System.out.println("El computador a jugado " + computer.name());

        int diff = player.ordinal() - computer.ordinal();
        if ((diff > 0 && diff % 2 == 0) || (diff < 0 && diff % 2 != 0))
            System.out.println("Has ganado!");
        else
            System.out.println("Ha ganado el computador!");


        sc.close();
    };
}

