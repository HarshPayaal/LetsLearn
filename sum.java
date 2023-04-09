import java.util.*;
public class sum{

    public static void oddOReven ( int ans){
     int bitmask = 1 ;
     if ((ans &bitmask) == 0){
        System.out.println("even");

     }
     else{
        System.out.println("odd");
     }
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int ans = sc.nextInt();
        oddOReven(ans);
    }
}