public class Figures {
    int lenght;
    int width;

    Figures(int lenght, int width){
        this.lenght = lenght;
        this.width = width;

    }
    int circuit(){
        return 2*lenght + 2*width;
    }
    int area(){
        return lenght*width;
    }
    String dimensions(){
        return "Lenght: " + this.lenght+"\n" + "Width: " + this.width;
    }

    public static void main(String[] args) {
        Figures figure1 = new Figures(3,4);
        Figures figure2 = new Figures(2,7);

        System.out.println("Figure 1");
        System.out.println(figure1.dimensions());
        System.out.println("Area: "+ figure1.area());
        System.out.println("Circiut: " + figure1.circuit() + "\n");

        System.out.println("Figure 2");
        System.out.println(figure2.dimensions());
        System.out.println("Area: "+ figure2.area());
        System.out.println("Circiut" +figure2.circuit());


    }
}
