import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

class Noeud {
    private int id;
    private List<Integer> voisins;
    private boolean isPasserelle;

    public Noeud(int id) {
        this.id = id;
        this.voisins = new ArrayList<>();
        this.isPasserelle = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getVoisins() {
        return voisins;
    }

    public void setVoisins(List<Integer> voisins) {
        this.voisins = voisins;
    }

    public boolean isPasserelle() {
        return isPasserelle;
    }

    public void setPasserelle(boolean passerelle) {
        isPasserelle = passerelle;
    }
}
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways

        List<Noeud> listNoeud = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            listNoeud.add(new Noeud(i));
        }

        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            listNoeud.get(N1).getVoisins().add(N2);
            listNoeud.get(N2).getVoisins().add(N1);
        }
        for (int i = 0; i < E; i++) {
            int EI = in.nextInt(); // the index of a gateway node
            listNoeud.get(EI).setPasserelle(true);
        }


        // game loop
        while (true) {
            int SI = in.nextInt(); // The index of the node on which the Bobnet agent is positioned this turn

            Noeud n = listNoeud.get(SI);
            Noeud priorityNode = null;
            for (Integer neighbor : n.getVoisins()) {
                if (listNoeud.get(neighbor).isPasserelle()) {
                    priorityNode = listNoeud.get(neighbor);
                    break;
                }
            }

            System.out.println(priorityNode != null ? priorityNode.getId() + " " + SI : n.getVoisins().get(1) + " " + SI);
        }
    }
}
