import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr =  sc.nextLine().split(" ");
        int hour = Integer.parseInt(strArr[0]);
        int minute = Integer.parseInt(strArr[1]);
        if(minute < 45){
            if (hour == 0)hour = 23;
            else hour-=1;
            minute += 15;
        }else {
            minute -=45;
        }
        System.out.println(hour + " " + minute);
    }
}
