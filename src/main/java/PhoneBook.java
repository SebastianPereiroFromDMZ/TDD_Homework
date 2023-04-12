import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {


    private Map<String, String> map = null;

    public int add(String name, String phoneNumber) {
        if (map == null) {
            map = new HashMap<>();
            map.put(name, phoneNumber);
        }

        map.put(name, phoneNumber);
        return map.size();
    }

    public String findByNumber(String value) {

        Optional<String> result = map.entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        return result.get();
    }


    public String findByName(String key){
        return map.get(key);
    }

    public ArrayList<String> printAllNames(){
        Set<String> keys = map.keySet();
         return (ArrayList<String>) new ArrayList<>(keys).stream()
                 .sorted()
                 .collect(Collectors.toList());
    }

}
