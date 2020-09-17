import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTabAlgos {
    /**
     * Test de plus grand nombre d'un tableau.
     */
    @Test
    public void plusGrand() {
        final int v1 = 1;
        final int v2 = 2;
        final int v3 = 4;
        final int v4 = 7;
        final int max = 7;
        //new Const().serve(v1, v2, v3, v4);
        int[] tab = new int[] {v1, v2, v3, v4};
        assertEquals(max, TabAlgos.plusGrand(tab), 0);
    }
    /**
     * Test de moyenne d'un tableau.
     */
    @Test
    public void moyenne() {
        final int v1 = 1;
        final int v2 = 2;
        final int v3 = 4;
        final int v4 = 7;
        final int moy = 3;
        int[] tab = new int[] {v1, v2, v3, v4};
        assertEquals(moy, TabAlgos.moyenne(tab), 0);
    }
    /**
     * Test d'égalité des tableaux.
     */
    @Test
    public void egaux() {
        final int v1 = 1;
        final int v2 = 2;
        final int v3 = 4;
        final int v4 = 7;
        int[] tab1 = new int[] {v1, v2, v3, v4};
        int[] tab2 = new int[] {v1, v2, v3, v4};
        assertTrue(TabAlgos.egaux(tab1, tab2));
    }
    /**
     * Test de similarité de valeurs des tableaux.
     */
    @Test
    public void similaires() {
        final int v1 = 8;
        final int v2 = 2;
        final int v3 = 4;
        final int v4 = 7;
        final int v5 = 8;
        int[] tab1 = new int[] {v1, v2, v3, v4, v5};
        int[] tab2 = new int[] {v1, v2, v3, v4, v5};
        assertTrue(TabAlgos.similaires(tab1, tab2));
    }
}
