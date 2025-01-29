import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        int a = 1;
         int s = 0;
        while( a <=100){
            if(a%2 == 0){
                s = s+a;
            }
        a++;
        }
        System.out.println(s);
    }
}
