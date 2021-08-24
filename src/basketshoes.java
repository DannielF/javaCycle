import java.util.ArrayList;
import java.util.Arrays;

public class basketshoes {
  public static ArrayList<String> casos_marcas(){
    ArrayList<String> marks = new ArrayList<>();

    String[] marcas = {"nike","adidas","rebook", "rebook", "rebook", "nike", "adidas" , "rebook", "rebook", "rebook"};

    for(int i=0; i < marcas.length; i++){
      if(!marks.contains(marcas[i])){
        marks.add(marcas[i]);
      }
    }
    return marks;
  }

  public static ArrayList<Integer> casos_marcas_faltantes(){
    ArrayList<Integer> marksOutStock = new ArrayList<>();

    Integer listIndex[] = {1,3,6,8};
    String marks1[] = {"nike","adidas","rebook", "rebook", "rebook", "nike", "adidas", "rebook", "rebook", "rebook"};
    String mark2 = "rebook";

    for(int i=0; i < listIndex.length; i++){
      if(marks1[listIndex[i]].equals(mark2)){
        marksOutStock.add(listIndex[i]);
      }
    }
    return marksOutStock;
  }

  public static ArrayList<Integer> casos_zapatillas_faltantes(){
    ArrayList<Integer> shoesOutStock = new ArrayList<>();

    Integer arr1[] =  {3,5,7,10,15,16};
    Integer arr2[] = {4,10,5,8};

    Integer i=0;
    do{
      Integer ele = arr1[i];
      Arrays.sort(arr2);
      Integer abs = Arrays.binarySearch(arr2, ele);
      if (abs<=-1) {
        shoesOutStock.add(ele);
      }
      i++;
    }while(i<arr1.length);

    return shoesOutStock;
  }

  public static Integer casos_zapatillas_disponibles_para_cambio(){
    Integer shoesToChange = 0;

    Integer arr1[] =  {3,5,7,10,15,16};
    Integer arr2[] = {4,10,5,8};

    Integer i=0;
    do{
      Integer ele = arr2[i];
      Arrays.sort(arr1);
      Integer abs = Arrays.binarySearch(arr1, ele);
      if (abs<=-1) {
        shoesToChange++;
      }
      i++;
    }while(i<arr2.length);

    return shoesToChange;
  }

  public static void main(String[] args) {
    System.out.println(casos_marcas());
    System.out.println(casos_marcas_faltantes());
    System.out.println(casos_zapatillas_faltantes());
    System.out.println(casos_zapatillas_disponibles_para_cambio());
  }
}

