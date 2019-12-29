import java.util.Scanner;

// This code doesnt do what it was intended to do, properyly
public class leap {
    Scanner scanner = new Scanner(System.in);
    private int year;

    public int getYear(){
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        return year;
    }

    public void yearStatus() {
        getYear();
        if (year % 4 == 0) {
            System.out.println("The year " + year + " is a leap year");
        }

        else if (year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is not a leap year");
        }

        else{
            System.out.println("The year " + year + " is a leap year");
        }

    }


    public static void main(String[] args) {
        leap obj = new leap();
        obj.yearStatus();
    }
}
