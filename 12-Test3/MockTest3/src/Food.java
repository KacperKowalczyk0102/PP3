public abstract class Food {
    String name;
    float price;

    Food(String name){
        this.name = name;
    }
    public abstract String getName();
    public abstract float getPrice();
    public abstract void setPrice(float price);
    public abstract void setPrice();

}
