package String;

import java.util.Scanner;
  
public class 큰수출력하기 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String  input1 = in.nextLine();
      String[] str = in.nextLine().split( " ");
	System.out.print(str[0]+" ");
    for(int i = 1; i < str.length; i++) {
      if(Integer.parseInt(str[i]) > Integer.parseInt(str[i-1])) {
          if(i != str.length-1)
            System.out.print(str[i]+" ");
          else
              System.out.print(str[i]);
      }

    }
    
  }
}