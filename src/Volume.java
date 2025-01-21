import java.util.Scanner;
public class Volume{
    public static final double pi= 3.14159;
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius and height of cylinder");
        double rad=sc.nextInt();
        Double height=sc.nextDouble();
        double volume;
        volume=pi*(rad*rad)*height;
        System.out.println("volume  ="+volume);
    }
}
