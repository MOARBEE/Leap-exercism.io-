import java.util.Scanner;

public class Leapclass {
    Scanner scanner = new Scanner(System.in);
    private int year;

    public int getYear(){
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        return year;
    }

    public void yearStatus() {
        getYear();
        if ((year % 100 != 0 && year % 4 ==0) || (year % 400 ==0)){
            System.out.println("The year " + year + " is a leap year ");
        }

        else{
            System.out.println("The year " + year + " is not a leap year ");
        }
    }


    public static void main(String[] args) {
        Leapclass obj = new Leapclass();
        obj.yearStatus();
    }
}

