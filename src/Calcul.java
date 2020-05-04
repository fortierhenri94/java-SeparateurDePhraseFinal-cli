import java.util.ArrayList;
import java.util.*;

/**
 * Calcule les différents résultat à obtenir dans l'exécution de l'application.
 */

public class Calcul {

    /**
     * Construit l'objet de la classe Calcul.
     *
     * @param
     * @return
     */

    public Calcul() {
}

    /**
     * Calcule la variable C qu'on retrouve dans l'énoncé du TP.
     *
     * @param list1
     * @param list2
     * @return c
     */

    public int calculC(ArrayList<ArrayList<String>> list1, ArrayList<ArrayList<String>> list2) {
        int c = 0;
        ArrayList<ArrayList<String>> cList = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).toString().equalsIgnoreCase(list2.get(j).toString())) {
                    cList.add(list1.get(i));
                    list1.remove(list1.get(i));
                    list2.remove(list2.get(j));
                    j--;
                }
            }
        }

        c = cList.size();
        return c;
    }

    /**
     * Calcule la variable R qu'on retrouve dans l'énoncé du TP.
     *
     * @param c
     * @param cardinal
     * @return r
     */

    public double calculR(int c, int cardinal) {
        double r;
        if (cardinal == 0) {
            r = 0;
        }
        else {
            r = (double) c / (double) cardinal;
        }

        return r;
    }

    /**
     * Calcule la variable Q qu'on retrouve dans l'énoncé du TP.
     *
     * @param c
     * @param cardinal
     * @return q
     */

    public double calculQ(int c, int cardinal) {
        double q;
        if (cardinal == 0) {
            q = 0;
        }
        else {
            q = (double) c / (double) cardinal;
        }

        return q;
    }

    /**
     * Calcule la variable F qu'on retrouve dans l'énoncé du TP.
     *
     * @param r
     * @param q
     * @return f
     */

    public double calculF(double r, double q) {
        double f;
        if (r + q == 0) {
            f = 0;
        }
        else {
            f = 2 * ((r * q) / (r + q));
        }

        return f;
    }

}
