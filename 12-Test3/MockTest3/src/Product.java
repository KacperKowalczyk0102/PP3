import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product implements Comparable<Product> {
    private String name;
    private float price;

    Product(String name, float price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product innyProdukt) {
        return name.compareTo(innyProdukt.getName());
    }

    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();
        Product p1 = new Product("banan", 10);
        Product p2 = new Product("banan", 11);
        Product p3 = new Product("jabłko", 12);
        int wynik=p1.compareTo(p3);
        if(wynik<0){
            System.out.println("Produkt: "+p1.getName()+" jest lepszy niż: "+ p3.getName());
        }else if (wynik>0){
            System.out.println("Produkt: "+p1.getName()+" jest gorszy niż: "+ p3.getName());
        }

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        for (Product produkt : lista) {
            System.out.println(produkt.getName() + ": " + produkt.getPrice());
        }

    }
}
