import org.apache.commons.lang3.math.NumberUtils;

public abstract class TabAlgos {
    /**
     * @param tab tableau des valeurs entier
     * @return
     * @return valeur la plus grande d'un tableau.
     */
     protected static int plusGrand(final int[] tab) {
          int max = NumberUtils.max(tab);
          return max;
      }
     /**
      * @param tab tableau des valeurs entier
      * @return moyenne des valeurs du tableau.
      * @throw IllegalArgumentException si tab et null ou vide.
      */
     protected static int moyenne(final int[] tab) {
         if (tab.length > 0) {
            int somme = 0;
            for (int i = 0; i < tab.length; i++) {
                somme += tab[i];
            }
            int moyenne = somme / tab.length;
            return moyenne;
         } else {
            throw new IllegalArgumentException("Attention le tableau est vide");
         }
      }
     /**
      * @param tab1
      * @param tab2
      * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
      * @return true si les 2 tableaux contiennent les mêmes éléments
      * avec les mêmes nombres d'occurences
      * (avec les elements dans le meme ordre).
      */
     protected static boolean egaux(final int[] tab1, final int[] tab2) {
          boolean resultat = false;
          if (tab1.length == tab2.length) {
              for (int i = 0; i < tab1.length; i++) {
                  if (tab1[i] == tab2[i]) {
                      resultat = true;
                  } else {
                      resultat = false;
                  }
              }
          }
          return resultat;
       }
      /**
       * @param tab1
       * @param tab2
       * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
       * @return true si les 2 tableaux contiennent les mêmes éléments
       * avec les mêmes nombres d'occurrence
       * (pas forcément dans le meme ordre).
       */
     protected static boolean similaires(final int[] tab1, final int[] tab2) {
          if (tab1.length == tab2.length) {
             int compteur = 0;
              for (int i = 0; i < tab1.length; i++) {
                  for (int j = 0; j < tab2.length; j++) {
                      if (tab1[i] == tab2[j]) {
                          compteur++;
                          break;
                      }
                  }
                  if (compteur == tab1.length) {
                      return true;
                  }
               }
             return false;
           }
         return false;
       }
}
