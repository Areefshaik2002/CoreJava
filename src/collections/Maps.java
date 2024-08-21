package collections;

//import java.util.Hashtable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.TreeMap;

public class Maps {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Map m = new HashMap();
//	Map m = new TreeMap();
//	Map m = new Hashtable();
	m.put("name", "Narendra");
	m.put("age", 69);
	m.put("YOP", 1955);
	m.put("rollno", 9696);
	
		Set s = m.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Object key = i.next();
			Object value = m.get(key);
			System.out.println(key +" : "+value);
			}
		}
}
