package sample;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangle<T extends Number>{
    private T alas;
    private T tinggi;

    public Triangle (T alas, T tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultInt(){
        double hitungInt = 0.5 * alas.intValue() * tinggi.intValue();
        int hasilInt = (int) Math.round(hitungInt);
        return hasilInt;
    }

    public double getResultDoub(){
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }
    public static void main (String[] args){
        Main();
    }
    public static void Main(){
        Scanner type = new Scanner(System.in);
        DecimalFormat doub = new DecimalFormat("#.##");

        System.out.println("Choose Type of Data for the result");
        System.out.println("1. Result in Integer\n2. Result in Double");
        System.out.print("Choose: "); int choose = type.nextInt();

        switch (choose) {
            case 1:
                System.out.println("You chose Integer");
                System.out.print("Enter for Base   : ");
                double base1 = type.nextDouble();
                System.out.print("Enter for Height : ");
                double height1 = type.nextDouble();

                Triangle<Double> intTriangle = new Triangle<>(base1, height1);

                System.out.println("Result in Integer: " + intTriangle.getResultInt());
                break;
            case 2:
                System.out.println("You chose Double");
                System.out.print("Enter for Base   : ");
                double base2 = type.nextDouble();
                System.out.print("Enter for Height : ");
                double height2 = type.nextDouble();

                Triangle<Double> doubTriangle = new Triangle<>(base2, height2);

                System.out.println("Result in Double: " + doub.format(doubTriangle.getResultDoub()));
                break;
            default:
                System.out.println("Choice is invalid\n"); Main();
        }
        System.out.println("\nare u sure leave this program? ");
        System.out.print("1. Yeah\n2. Not yet\n");
        System.out.print("Choose: ");
        int exit = type.nextInt();


        switch (exit) {
            case 1: break;
            case 2: Main();
        }
    }
}
