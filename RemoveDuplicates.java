import java.util.HashSet;
import java.util.Set;

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String abc = "Java";
        System.out.println(RemoveDuplicate(abc));
    }

    public static String RemoveDuplicate(String abc) {
        Set<Character> set = new HashSet<>();
        StringBuffer sf = new StringBuffer();
        
    for (int i=0; i<abc.length(); i++){
        Character c = abc.charAt(i);
        if(!set.contains(c)){
            set.add(c);
            sf.append(c);
        }
    }
        return sf.toString();
    }
}