public class ForLoop {
  public static void main(String[] args) {
  int x;
  for (int i = 1; i<=10; i++){
    x = i;
    if (x % 2 == 0)
    continue;
    System.out.println("The value of x is: " + x);

  }
  }
}
