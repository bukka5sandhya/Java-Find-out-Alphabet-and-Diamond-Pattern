import java.util.Scanner;
public class FindOutAlphabetAndDiamond {
// Java program to print alphabet A pattern
  void display(int n){
  for(int i=0;i<=n;i++){
    for(int j=0;j<=n/2;j++){
        if((j==0 || j==n/2 )&& i != 0  || i == 0   && j != n/2 || i == n/2)
        System.out.print("*");
        else
        System.out.print(" ");
    }
    System.out.println();
  }
}
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    FindOutAlphabetAndDiamond a = new FindOutAlphabetAndDiamond();
    a.display(7);
  }
}
