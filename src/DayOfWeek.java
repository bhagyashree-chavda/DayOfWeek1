import java.util.Scanner;

public class DayOfWeek {
    public void  start()
        {
            System.out.println("enter the day of the week");
            Scanner sc=new Scanner(System.in);
            int day=sc.nextInt();
            switch(day)
                {
                case 1-> System.out.println("its a monday");
                case 2-> System.out.println("its a tuesday");
                case 3-> System.out.println("its a wednesday");
                case 4-> System.out.println("its a thursday");
                case 5-> System.out.println("its a friday");
                case 6-> System.out.println("its a saturday");
                case 7-> System.out.println("its a sunday");
                    default ->  System.out.println("invalid day");

                }
                sc.close();
        }



}
