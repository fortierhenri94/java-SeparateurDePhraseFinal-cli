import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Détermine les n-grammes selon les 2 phrases entrée (input) par l'utilisateur.
 */

public class Grammes {


    public String p;
    public int counter = 0;

    /**
     * Constructeur de la classe Grammes.
     *
     * @param p
     */

    public Grammes(String p) {
        this.p = p;
        counter ++;
    }

    /**
     * Recoit la phrase entrée par l'utilisateur et la transforme en ArrayList de String contenant seulement des lettres.
     *
     * @param
     * @return wordsList2
     */

    public ArrayList<String> input() {
        ArrayList<ArrayList<String>> test2 = new ArrayList<ArrayList<String>>();
        ArrayList<String> wordsList2 = new ArrayList<String>();

        String[] words = p.split("[^a-zA-Z]");
        List wordsList = Arrays.asList(words);

        for (int i = 0; i < wordsList.size(); i++) {
            if (!wordsList.get(i).equals("")) {
                wordsList2.add(wordsList.get(i).toString());
            }
        }
        return wordsList2;
    }

    /**
     * Détermine le 1-gramme selon les phrases entrées par l'utilisateur
     *
     * @param list
     * @return megaList1
     */

    public ArrayList<ArrayList<String>> nGrammes1(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList1 = new ArrayList<>();
        for (String s : list) {
            ArrayList<String> list2 = new ArrayList<>();
            list2.add(s);
            megaList1.add(list2);
        }
        return megaList1;
    }

    /**
     * Détermine le 2-grammes selon les phrases entrées par l'utilisateur
     *
     * @param list
     * @return megaList2
     */


    public ArrayList<ArrayList<String>> nGrammes2(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList2 = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-1) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                megaList2.add(list2);
            }
        }
        return megaList2;
    }

    /**
     * Détermine le 3-grammes selon les phrases entrées par l'utilisateur
     *
     * @param list
     * @return megaList3
     */

    public ArrayList<ArrayList<String>> nGrammes3(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList3 = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-2) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                list2.add(list.get(i+2));
                megaList3.add(list2);
            }
        }
        return megaList3;
    }

    /**
     * Détermine le 4-grammes selon les phrases entrées par l'utilisateur
     *
     * @param list
     * @return megaList4
     */

    public ArrayList<ArrayList<String>> nGrammes4(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList4 = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-3) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                list2.add(list.get(i+2));
                list2.add(list.get(i+3));
                megaList4.add(list2);
            }
        }
        return megaList4;
    }

}
