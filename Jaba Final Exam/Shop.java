import java.util.Scanner;
class Shop{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter quantity");
    int x = s.nextInt();
    if((x*100)>1000){
      System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
    }
    else{
      System.out.println("No discount");
    }
  }
}