class Box {
  int width;
  int height;
  int breadth;

  double getVolume (){
    return this.width * this.height * this.breadth;
  }
}

public class ClassMethods {
  public static void main(String[] args) {
    Box myBox = new Box();
    myBox.width = 100;
    myBox.height =100;
    myBox.breadth = 30;
    System.out.println("Volume of myBox is: " + myBox.getVolume());
    
  }
}
