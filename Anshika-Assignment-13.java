import java.util.Set;
import java.util.HashSet;
public class Test1{
   public static void main(String[] args){
      Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(10);
        s.add(15);
        s.add(20);
        s.add(25);
        System.out.println(s);
        System.out.println(s.contains(10));
        s.remove(15);
        System.out.println(s);
        System.out.println(s.size());
   }
}