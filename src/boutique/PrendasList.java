
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
    
    public ArrayList<String> codigos() {
        ArrayList<String> codigos = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!codigos.contains(p.getCodigo())) {
                codigos.add(p.getCodigo());
            }
        }return codigos;
    }
    
     public Prenda prendaCodigo(String codigo) {
        for (Prenda p : prendas) {
            if (codigo.equalsIgnoreCase(p.getCodigo())) {
                return p;
            }
        }return null;
    }
    
    public ArrayList<String> colores() {
        ArrayList<String> colores = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!colores.contains(p.getColor())) {
                colores.add(p.getColor());
            }
        }return colores;
    }
    
    public ArrayList<String> tallas() {
        ArrayList<String> tallas = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!tallas.contains(p.getTalla())) {
                tallas.add(p.getTalla());
            }
        }return tallas;
    }
    
    //lista prendas por color
    public PrendasList colorTallaPrendas(String color, String talla) {
        PrendasList PrendasColorTalla = new PrendasList();
        for (Prenda p : prendas) {
            if (color.equalsIgnoreCase(p.getColor()) && talla.equalsIgnoreCase(p.getTalla())) {
                PrendasColorTalla.addPrenda(p);
            }
        }return PrendasColorTalla;
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
