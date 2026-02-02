import java.util.LinkedHashMap;
public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, String> configurations = new LinkedHashMap<>();
        configurations.put("theme","dark");
        configurations.put("language","en_US");
        configurations.put("notification","enabled");
        configurations.put("theme","light");
        System.out.println(configurations);

        //get
        System.out.println(configurations.get("theme"));

        //remove
        System.out.println(configurations.remove("language"));
        ///System.out.println(configurations.remove)
        //iterate over key
        //iterate over both


    }
    
}
