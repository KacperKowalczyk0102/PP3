public class Product {
    private String name;
    private Boolean isVegeterian ;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Boolean getIsVegeterian(){
        return isVegeterian;
    }
    public void setIsVegeterian(Boolean isVegeterian){
        this.isVegeterian = isVegeterian;
    }
    public Product(String name, Boolean isVegeterian){
        this.name = name;
        this.isVegeterian = isVegeterian;
    }
}
