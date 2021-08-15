import java.util.*;

public class hashMap {
  public static void main(String[] args) {
    HashMap<Integer, String> listA = new HashMap<>();
    listA.put(1, "Ana");
    listA.put(2, "Maria");
    HashMap<Integer, String> listB = new HashMap<>();
    listB.put(1, "Ana");
    listB.put(2, "Maria");
    if(!listA.equals(listB)){
      System.out.println("No is equal");
    }else {
      System.out.println("It is equal");
    }
  }
}
