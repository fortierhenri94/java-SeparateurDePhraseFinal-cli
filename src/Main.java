import java.util.Scanner;
import java.util.*;

/**
 * Travail réalisé SEUL par :
 * Henri Fortier
 * FORH16059401
 * Groupe 010
 * le 19 Avril 2020
 */

/**
 * Exécute le programme dans cette classe.
 */

public class Main {

    /**
     * Permet a l'application de rouler grâce à cette fonction : main.
     *
     * @param args
     * @return void
     */

    public static void main(String[] args) {
        app();
    }

    /**
     * Exécute l'application dans une méthode.
     *
     * @param
     * @return void
     */

    public static void app() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer la phrase générée : ");
        String p1 = sc.nextLine();
        System.out.print("Entrer la phrase cible : ");
        String p2 = sc.nextLine();
        Grammes phrase1 = new Grammes(p1);
        Grammes phrase2 = new Grammes(p2);

        System.out.println("1-grammes de la phrase 1 = " + phrase1.nGrammes1(phrase1.input()));
        System.out.println("2-grammes de la phrase 1 = " + phrase1.nGrammes2(phrase1.input()));
        System.out.println("3-grammes de la phrase 1 = " + phrase1.nGrammes3(phrase1.input()));
        System.out.println("4-grammes de la phrase 1 = " + phrase1.nGrammes4(phrase1.input()));
        System.out.println("1-grammes de la phrase 2 = " + phrase2.nGrammes1(phrase2.input()));
        System.out.println("2-grammes de la phrase 2 = " + phrase2.nGrammes2(phrase2.input()));
        System.out.println("3-grammes de la phrase 2 = " + phrase2.nGrammes3(phrase2.input()));
        System.out.println("4-grammes de la phrase 2 = " + phrase2.nGrammes4(phrase2.input()));

        Calcul c1 = new Calcul();

        System.out.println
                ("c1 = " + c1.calculC(phrase1.nGrammes1(phrase1.input()), phrase2.nGrammes1(phrase2.input())) + ", " +
                        "c2 = " + c1.calculC(phrase1.nGrammes2(phrase1.input()), phrase2.nGrammes2(phrase2.input())) + ", " +
                        "c3 = " + c1.calculC(phrase1.nGrammes3(phrase1.input()), phrase2.nGrammes3(phrase2.input())) + ", " +
                        "c4 = " + c1.calculC(phrase1.nGrammes4(phrase1.input()), phrase2.nGrammes4(phrase2.input())));

        System.out.println
                ("r1 = " + c1.calculR(c1.calculC(phrase1.nGrammes1(phrase1.input()), phrase2.nGrammes1(phrase2.input())), phrase2.nGrammes1(phrase2.input()).size())
                        + ", r2 = " + c1.calculR(c1.calculC(phrase1.nGrammes2(phrase1.input()), phrase2.nGrammes2(phrase2.input())), phrase2.nGrammes2(phrase2.input()).size())
                        + ", r3 = " + c1.calculR(c1.calculC(phrase1.nGrammes3(phrase1.input()), phrase2.nGrammes3(phrase2.input())), phrase2.nGrammes3(phrase2.input()).size())
                        + ", r4 = " + c1.calculR(c1.calculC(phrase1.nGrammes4(phrase1.input()), phrase2.nGrammes4(phrase2.input())), phrase2.nGrammes4(phrase2.input()).size()));

        System.out.println
                ("q1 = " + c1.calculQ(c1.calculC(phrase1.nGrammes1(phrase1.input()), phrase2.nGrammes1(phrase2.input())), phrase1.nGrammes1(phrase1.input()).size())
                        + ", q2 = " + c1.calculQ(c1.calculC(phrase1.nGrammes2(phrase1.input()), phrase2.nGrammes2(phrase2.input())), phrase1.nGrammes2(phrase1.input()).size())
                        + ", q3 = " + c1.calculQ(c1.calculC(phrase1.nGrammes3(phrase1.input()), phrase2.nGrammes3(phrase2.input())), phrase1.nGrammes3(phrase1.input()).size())
                        + ", q4 = " + c1.calculQ(c1.calculC(phrase1.nGrammes4(phrase1.input()), phrase2.nGrammes4(phrase2.input())), phrase1.nGrammes4(phrase1.input()).size()));

        System.out.println
                ("F1 = " + c1.calculF(c1.calculR(c1.calculC(phrase1.nGrammes1(phrase1.input()), phrase2.nGrammes1(phrase2.input())), phrase2.nGrammes1(phrase2.input()).size()), c1.calculR(c1.calculC(phrase1.nGrammes1(phrase1.input()), phrase2.nGrammes1(phrase2.input())), phrase1.nGrammes1(phrase1.input()).size()))
                        + ", F2 = " + c1.calculF(c1.calculR(c1.calculC(phrase1.nGrammes2(phrase1.input()), phrase2.nGrammes2(phrase2.input())), phrase2.nGrammes2(phrase2.input()).size()), c1.calculR(c1.calculC(phrase1.nGrammes2(phrase1.input()), phrase2.nGrammes2(phrase2.input())), phrase1.nGrammes2(phrase1.input()).size()))
                        + ", F3 = " + c1.calculF(c1.calculR(c1.calculC(phrase1.nGrammes3(phrase1.input()), phrase2.nGrammes3(phrase2.input())), phrase2.nGrammes3(phrase2.input()).size()), c1.calculR(c1.calculC(phrase1.nGrammes3(phrase1.input()), phrase2.nGrammes3(phrase2.input())), phrase1.nGrammes3(phrase1.input()).size()))
                        + ", F4 = " + c1.calculF(c1.calculR(c1.calculC(phrase1.nGrammes4(phrase1.input()), phrase2.nGrammes4(phrase2.input())), phrase2.nGrammes4(phrase2.input()).size()), c1.calculR(c1.calculC(phrase1.nGrammes4(phrase1.input()), phrase2.nGrammes4(phrase2.input())), phrase1.nGrammes4(phrase1.input()).size())));

    }

}
