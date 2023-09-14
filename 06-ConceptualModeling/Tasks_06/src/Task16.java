import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {

    public static class ShoppingList {
        private ArrayList<String> products = new ArrayList<String>();

        public void displayList(){
            System.out.println("Shopping list: ");
            for(String product: products){
                System.out.println(product);
            }
        }
        public void displayNumOfProducts(){
            System.out.println("Number of products to buy: "+ products.size());
        }
        public void addProduct(String product){
            products.add(product);
        }
        void addProduct(){
            Scanner keybarod = new Scanner(System.in);
            System.out.println("Enter product: ");
            String product = keybarod.nextLine();
            products.add(product);
        }


        public static void main(String[] args) {
            ShoppingList s1 = new ShoppingList();
            s1.displayList();
            s1.displayNumOfProducts();
            s1.addProduct("Apple");
            s1.addProduct("Milk");
            s1.addProduct("Water");
            s1.displayList();
            s1.displayNumOfProducts();
            s1.addProduct("Grape");
            s1.displayList();
            s1.displayNumOfProducts();
            s1.addProduct();
            s1.displayList();
            s1.displayNumOfProducts();

        }
    }

}
