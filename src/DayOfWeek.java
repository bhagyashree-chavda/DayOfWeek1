import java.util.Scanner;

public class DayOfWeek
{
    public void start()
    {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        System.out.println("Enter the day of the week beetween 1 to 7");
        while (true)
        {
            System.out.print("your number is ");
            if (sc.hasNextInt())
            {
                day = sc.nextInt();
                break;
            }
            else
            {
                System.out.println("enter a valid number between 1 and 7");
                sc.next();
            }
        }

        String result = getDay(day);

        System.out.println("The day of the week is: " + result);
        sc.close();
    }

    public String getDay(int day)
    {
        String dayString = "";
        switch (day) {
            case 1 -> dayString = "Sunday";
            case 2 -> dayString = "Monday";
            case 3 -> dayString = "Tuesday";
            case 4 -> dayString = "Wednesday";
            case 5 -> dayString = "Thursday";
            case 6 -> dayString = "Friday";
            case 7 -> dayString = "Saturday";
            default -> dayString = "Invalid day";

        }
        return dayString;
    }

}


