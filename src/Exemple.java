/**
* Ma class d'exemple.
*/
public class Exemple {
    /**
    * @rubrique t est un string
    */
    private final String t;
    /**
    * @rubrique v est un int
    */
    private int v = 0;
    /**
    * constructeur.
    * @param t1 est une chaine
    */
    public Exemple(final String t1) {
        this.t = t1;
    }
    /**
    * @return la valeur de v
    */
    public int getV() {
        return this.v;
    }
    /**
     * @param v1 est un entier
     */
    public final void setV(final int v1) {
        this.v = v1;
    }
    /**
    * @return t si v est positif
    */
    public final String getT() {
        if (v > 0) {
           return t;
        }
        return t;
    }
}
