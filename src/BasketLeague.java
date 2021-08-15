import java.util.Scanner;

public class BasketLeague {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.println("");
    int toledo = Integer.parseInt(sc.next());
    int norato = (toledo * 2) + 4; 
    int barrero = (toledo + norato) / 5;
    String pointsBarrero;
    if (barrero > 0 && barrero <= 20){
      pointsBarrero = "Uno";
    }else if(barrero >= 21 && barrero <=30){
      pointsBarrero = "Dos";
    }else if(barrero >= 31 && barrero <=50){
      pointsBarrero = "Tres";
    }else {
      pointsBarrero = "Cuatro";
    }
    sc.close();
    System.out.println(toledo + " " + norato + " " + barrero);
    System.out.println(pointsBarrero);
  }
}
