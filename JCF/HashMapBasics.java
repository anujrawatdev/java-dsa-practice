package JCF;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapBasics {

    public static void main(String[] args){

        Map<String,String> mapping = new HashMap<>();

        mapping.put("in","India");
        mapping.put("en","England");
        mapping.put("us","United States");
        
        Map<String,String> table = new HashMap<>();

        table.put("br","Brazil");
        System.out.print(table);

        table.putAll(mapping);
        System.out.println(table);

        table.putIfAbsent("ind", "india5");
        System.out.println(table);

        System.out.println(table.getOrDefault("es" ,"no country"));

        System.out.println(table.containsKey("in"));
        System.out.println(table.containsValue("Brazil3"));

        table.replace("ind", "Indonesia");
        System.out.println(table);




        Set<String> keySet = table.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);
        
       Set<Map.Entry<String, String>> entrySet = table.entrySet();
       System.out.println(entrySet);
    }
}