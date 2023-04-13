import java.util.ArrayList;
import java.util.HashMap;

public class mapa {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> paises=new HashMap<String, ArrayList<String>>();

        paises.put("España",new ArrayList<>());
        paises.put("España","Cordoba");
        paises.put("España","Dos Hermanas");
        paises.put("Fracia","París");
        paises.put("Alemania","Berlín");
        paises.put("Portugal","Lisboa");
        paises.put("China","Pekin");
        paises.put("Japón","Tokio");

        System.out.println(paises.get("España"));


        System.out.println(paises.containsKey("China"));
        System.out.println(paises.containsValue("Tokio"));
        paises.remove("Francia");
        paises.remove("París");



    }
}
