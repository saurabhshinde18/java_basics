import java.util.*;
public class addition{
    public static void main(String[] args){
        int a,b,sum;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number ");
        a = sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();
        sum = a+b;
        System.out.print("sum is ");
        System.out.print(sum);
    }
}