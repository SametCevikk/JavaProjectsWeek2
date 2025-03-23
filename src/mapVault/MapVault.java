package mapVault;

import java.util.HashMap;
import java.util.Map;

public class MapVault {
    public static void main(String[] args) {
        Map<String,Integer> cities = new HashMap<>();
        cities.put("İstanbul",34);
        cities.put("Ankara",6);
        cities.put("İzmir",35);
        cities.put("Kocaeli",41);
        cities.put("Sakarya",54);

        for(Map.Entry<String,Integer> entry : cities.entrySet()){
            System.out.println(entry);
        }
    }
}
