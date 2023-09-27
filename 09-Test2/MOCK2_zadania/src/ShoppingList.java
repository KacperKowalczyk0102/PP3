import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> listOfProducts = new ArrayList<Product>();

    public void add(Product p){
        listOfProducts.add(p);
    }
    public String toString(){
        String returnString = "";
        for(Product product: listOfProducts){
            returnString+=",";
            returnString+= product.getName();

        }
        return returnString.substring(1);
    }
}
