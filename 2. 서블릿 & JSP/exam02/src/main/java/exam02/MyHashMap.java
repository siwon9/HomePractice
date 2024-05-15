package exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("이병헌", Integer.valueOf(90));
        map.put("최시원", Integer.valueOf(100));
        map.put("송승헌", Integer.valueOf(90));
        map.put("이진태", Integer.valueOf(80));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
        }

        set=map.keySet();
    }
}
