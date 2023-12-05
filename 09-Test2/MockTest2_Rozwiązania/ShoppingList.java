import java.util.ArrayList;

public class ShoppingList{
    ArrayList<Product> produkty = new ArrayList<Product>();
    public void add(Product product){
        produkty.add(product);
    }
    public String toString(){
        String napis = "";
        for(Product produkt: produkty){
            napis+=",";
            napis+=produkt.getName();
            
        }return napis.substring(1);
    }
    public int total(){
        int sum = 0;
        for(Product produkt: produkty){
            sum+=produkt.getQuantity();
        }
        return sum;

    }

}