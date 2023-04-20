package admin;

import java.util.HashMap;

public class Admin {
    HashMap<String ,String > map;

    public Admin() {
        this.map = new HashMap<>();
        map.put("Ankit","ankit@123");
        map.put("Sonu","sonu@123");
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }
}
