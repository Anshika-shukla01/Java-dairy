import java.util.ArrayList;
class GenricList<T>{
   public ArrayList<T> List ;

   public GenricList(){
       List = new ArrayList<>();
   }
   void add(T element){
       List.add(element);
   }
    public T get(int index){
       if(index < 0 || index >= List.size()){
            throw new IndexOutOfBoundsException("invalid : " + index);
       }
       return List.get(index);
    }
    public void printList(){
       System.out.println(List);
    }
}
public class Main{
    public static void main(String[] args){
       GenricList<Integer> intList = new GenricList<>();
         intList.add(10);
         intList.add(20);
         intList.add(30);
         intList.add(40);
         intList.add(50);
         intList.printList();
         System.out.println("Element at index 1: " + intList.get(1));
    }
}