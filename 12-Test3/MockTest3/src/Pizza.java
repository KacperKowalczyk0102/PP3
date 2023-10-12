public class Pizza extends Food implements Extra {
    int size;
    public Pizza(String name,int size){
        super(name);
        this.size = size;

    }
    @Override
    public float discount() {
        if(getPrice()>30){
            return 0.05f;

        }
        return 0;
    }

    @Override
    public float delivery() {
        if(size>50){
            return 8;
        }else {
            return 6;
        }
    }

    @Override
    public float delivery(int tip) {
        return delivery()+tip;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(float newPrice) {
        super.price = newPrice;
    }

    @Override
    public void setPrice() {
        super.price=this.size-10;
    }
}
