
package boutique;

import Modelo.Prenda;
import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class PrendasList {
    
    
    //ArrayList donde se guardaran todas las prendas registradas
    public static ArrayList<Prenda> prendas;

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
    
    //añadir prenda al array
    public void addPrenda(Prenda p) {
        prendas.add(p);
    }
    
    //muestra los codigos de todas las prendas
    public ArrayList<String> codigos() {
        ArrayList<String> codigos = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!codigos.contains(p.getCodigo())) {
                codigos.add(p.getCodigo());
            }
        }return codigos;
    }
    
    //muestra el objeto prenda mediante el string recibido
    public Prenda prendaCodigo(String codigo) {
        for (Prenda p : prendas) {
            if (codigo.equalsIgnoreCase(p.getCodigo())) {
                return p;
            }
        }return null;
    }
    
    //muestra los colores de todas las prendas
    public ArrayList<String> colores() {
        ArrayList<String> colores = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!colores.contains(p.getColor())) {
                colores.add(p.getColor());
            }
        }return colores;
    }
    
    //muestra las tallas de todas las prendas
    public ArrayList<String> tallas() {
        ArrayList<String> tallas = new ArrayList<>();
        for (Prenda p : prendas) {
            if (!tallas.contains(p.getTalla())) {
                tallas.add(p.getTalla());
            }
        }return tallas;
    }
    
    //muestra el numero total de prendas
    public int prendasTotales() {
        int numStock = 0;
        for (int i=0;i<prendas.size();i++) {
            numStock = numStock + prendas.get(i).getStock();
        }
        return numStock;
    }
    
    //muestra el precio sumado de todas las prendas
    public double precioTotal() {
        double precioT = 0;
        int numStock = 0;
        for (int i=0;i<prendas.size();i++) {
            numStock = prendas.get(i).getStock();
            precioT = precioT + (prendas.get(i).getPrecioCoste() * numStock);
        }
        return precioT;
    }
    
    //muestra los objetos que tengan el mismo color y talla, pasado por parametros
    public ArrayList<Prenda> colorTallaPrendas(String color, String talla) {
        ArrayList<Prenda> PrendasColorTalla = new ArrayList();
        for (Prenda p : prendas) {
            if (color.equalsIgnoreCase(p.getColor()) && talla.equalsIgnoreCase(p.getTalla())) {
                PrendasColorTalla.add(p);
            }
        }return PrendasColorTalla;
    }
    
     
}
