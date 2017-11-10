
package boutique;

import Utilidades.Fichero;
import static boutique.Boutique.miFichero;
import static boutique.Boutique.prendas;


public class Boutique {
    
    public static Fichero miFichero;
    public static PrendasList prendas;
    
    
    
    public static void main(String[] args) {
        
        miFichero = new Fichero("prendas.xml");
        prendas = (PrendasList) miFichero.leer();
        if (prendas == null) {
            prendas = new PrendasList();
        }
        
        Menu principal = new Menu();
        // Centramos la ventana en la pantalla
        principal.setLocationRelativeTo(null);
        // Lo hacemos visible
        principal.setVisible(true);
    }
    
}
