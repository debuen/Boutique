
package boutique;

import Modelo.Prenda;
import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class PrendasList {
    
    private ArrayList<Prenda> prendas;

    public PrendasList() {
        prendas = new ArrayList();
    }
    
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
    
    
    public ArrayList<String> colores() {
        ArrayList<String> colores = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!colores.contains(p.getColor())) {
                colores.add(p.getColor());
            }
        }
        return colores;
    }
    
    //lista prendas por color
    public PrendasList colorPrendas(String color) {
        PrendasList PrendasColores = new PrendasList();
        for (Prenda p : prendas) {
            if (color.equalsIgnoreCase(p.getColor())) {
                PrendasColores.addPrenda(p);
            }
        }return PrendasColores;
    }
    
    public PrendasList tallaPrendas(String talla) {
        PrendasList tallas = new PrendasList();
        for (Prenda p : prendas) {
            if (talla.equalsIgnoreCase(p.getTalla())) {
                tallas.addPrenda(p);
            }
        }return tallas;
    }
    
}
