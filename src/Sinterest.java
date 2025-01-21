import java.util.Scanner;
public class Sinterest{
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal, rate and time of interest");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int interest;
        interest=(p*r*t)/100;
        System.out.println("interest ="+interest);
    }
}
