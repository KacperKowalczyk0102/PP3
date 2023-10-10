import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<Product> listaProduktow = new ArrayList<Product>();

    public void add(Product product){
        listaProduktow.add(product);
    }

    public String toString(){
        String returnString="";
        for (Product product: listaProduktow){
            returnString+=",";
            returnString+=product.getName();
        }
        return returnString.substring(1);
    }
    public int total(){
        int suma = 0;
        for (Product product: listaProduktow){
            suma+= product.getQuantity();

        }
        return suma;
    }
}