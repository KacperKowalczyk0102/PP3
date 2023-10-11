public class Number {
    int system;
    String value;
    Number(int system,String value){
        this.system = system;
        this.value = value;
    }
    int get10(){
        int suma = 0;
        int potega = value.length()-1;//ponieważ mnożymy też przez 0
        for(char liczba: value.toCharArray()){
            int znakNaLiczbe = Integer.parseInt(liczba+"");
                if(znakNaLiczbe>=8)
                {return -1;}

                suma+= (int)Math.pow(system,potega)*znakNaLiczbe;
                liczba--;
        }
return suma;
    }
}
