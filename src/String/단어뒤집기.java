package String;

import java.util.Scanner;
  
public class 단어뒤집기 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    in.nextLine();
    for (int i = 0; i <input1 ; i++) {
      String input = in.nextLine();
      System.out.println(new StringBuffer(input).reverse());
    }
  }
}