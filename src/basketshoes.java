import java.util.ArrayList;
public class basketshoes {
  public static ArrayList<String> marcas(ArrayList<String> mk){
    ArrayList<String> marks = new ArrayList<>();

    for(int i=0; i < mk.size(); i++){
      if(!marks.contains(mk.get(i))){
        marks.add(mk.get(i));
      }
    }
    return marks;
  }

  public static ArrayList<Integer> marcas_faltantes(ArrayList<Integer> nb, ArrayList<String> srt, String m){
    ArrayList<Integer> marksOutStock = new ArrayList<>();

    for(int i=0; i < nb.size(); i++){
      if(srt.get(nb.get(i)).equals(m)){
        marksOutStock.add(nb.get(i));
      }
    }
    return marksOutStock;
  }

  public static ArrayList<String> zapatillas_faltantes(ArrayList<String> ar1, ArrayList<String> ar2){
    ArrayList<String> shoesOutStock = new ArrayList<>();

    for(int i=0; i < ar1.size(); i++){
      if(!ar2.contains(ar1.get(i))){
        shoesOutStock.add(ar1.get(i));
      }
    }
    return shoesOutStock;
  }

  public static Integer zapatillas_disponibles_para_cambio(ArrayList<String> a1, ArrayList<String> a2){
    Integer shoesToChange = 0;

    for(int i=0; i < a2.size(); i++){
      if(!a1.contains(a2.get(i))){
        shoesToChange++;
      }
    }
    return shoesToChange;
  }
}