package Collection;
import java.util.HashMap;
public class Map_class {
    public static void main(String[] args) {
        HashMap<String, Integer> virsta = new HashMap<String, Integer>();
        virsta.put("Andrei", 13);
        virsta.put("Vasile", 11);
        virsta.put("Magdalena", 18);
        System.out.print("Magdalena are " + virsta.get("Magdalena") + " ani \n");
        virsta.put("Magdalena", 19);
        System.out.print("Magdalena are acum " + virsta.get("Magdalena") + " ani \n");
        virsta.remove("Vasile");
        boolean exist = virsta.containsKey("Vasile");
        System.out.print("Mapa noastra contine virsta lui Vasile? : " +  exist + "\n");
        virsta.put("Nicolae", 20);
        virsta.put("Damian", 18);
        virsta.put("Alexandru", 17);
        System.out.println(virsta.entrySet());
        System.out.print("HashMap size is " + virsta.size());
        virsta.clear();
        System.out.print("\nNow our HashMap size is = " + virsta.size());
    }
}
