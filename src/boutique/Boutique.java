
package boutique;

import static boutique.Boutique.prendas;


public class Boutique {
    
    public static PrendasList prendas;
 
    public static void main(String[] args) {
        
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
