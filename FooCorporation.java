import java.util.Scanner;
public class FooCorporation {
    double salary;
    double workHours;

    public static void main(String[] args) {
        Scanner getSalary = new Scanner(System.in);
        System.out.println("Kindly key in base pay \n");
        double salary = getSalary.nextDouble();
        Scanner getHours = new Scanner(System.in);
        System.out.println("Kindly type in number of hours worked \n");
        double workHours = getHours.nextDouble();
        if (workHours < 41 && salary >= 8.0) {
            double pay = workHours * salary;
            System.out.println(pay);
        } else if (workHours > 40 && workHours < 61 && salary >= 8.0) {
            double diff = workHours - 40;
            double pay = (diff * 1.5 * salary) + (40 * salary);
            System.out.println(pay);
        } else {
            System.out.println("error");
        }

    }
}