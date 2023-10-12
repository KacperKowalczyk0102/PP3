import java.util.ArrayList;


public class Cities {
    String[] cityNames;

    Cities(String[] cityNames){
        this.cityNames = cityNames;
    }
    Cities filter(char znak){
        ArrayList<String> lista = new ArrayList<String>();
        for(String city: cityNames){
           char[] arr = city.toCharArray();
           if(arr[0]==znak){
               lista.add(city);

           }

        }   return new Cities(lista.toArray(new String[lista.size()]));
    }
    String cities(){
        String nazwyRazem="";
        for(String city: cityNames){
            nazwyRazem+=city;
        }
        return nazwyRazem;
    }
    public static void main(String[] args) {
        String[] myCities = {"Warszawa","Sopot","Kielce","Szczecin"};
        Cities cities = new Cities(myCities);
        System.out.println(cities.filter('S').cities());
    }
}
