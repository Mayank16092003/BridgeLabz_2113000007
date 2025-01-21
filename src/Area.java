import java.util.Scanner;
public class Area{
    public static final double pi= 3.14159;
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle ");
        double rad=sc.nextInt();
        double area;

        area=pi*(rad*rad);
        System.out.println("area ="+area);
    }
}
