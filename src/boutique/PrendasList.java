
package boutique;

import Modelo.Prenda;
import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class PrendasList {
    
    private ArrayList<Prenda> prendas;

    public PrendasList(ArrayList<Prenda> prendas) {
        this.prendas = prendas;
    }

    public ArrayList<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(ArrayList<Prenda> prendas) {
        this.prendas = prendas;
    }
    
    public void addPrenda(Prenda p) {
        prendas.add(p);
    }

    public void removePrenda(Prenda p) {
        prendas.remove(p);
    }
    
}
