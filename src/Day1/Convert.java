import java.util.Scanner;
public class Convert{
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in celsius ");
        int TinC=sc.nextInt();
        double TinF;
        TinF=TinC*(9.0/5)+32.0;
        System.out.println("temperature in fahrenheit"+TinF);
    }
}
