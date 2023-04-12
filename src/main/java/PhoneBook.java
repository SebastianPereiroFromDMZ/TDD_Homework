import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

        return null;
    }
}
