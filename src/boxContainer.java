public class boxContainer {

  protected Object obj;

  public boxContainer(Object obj) {
    this.obj = obj;
  }

  public Object getValue() {
    return obj;
  }

  public String decorate() {
      String s = obj.toString();
      String line = "*";
      for (int i = 0; i < s.length(); i++) {
        line += "*";
      }
      line += "*";
      return line + "\n*" + s + "*\n" + line;
  }
  public static void main(String[] args) {
    boxContainer box = new boxContainer("Pedro Páramo");
    System.out.println(box.decorate());
    System.out.println(box.getValue());
  }
}
