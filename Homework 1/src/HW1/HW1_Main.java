package HW1;
import java.util.Scanner;

public class HW1_Main  {
    public static void main (String[] args){
        PerimeterandArea();
        MonthsDays();
        StringsShow ();
    }

    //задача 1
    public static void PerimeterandArea() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Task 1");
        System.out.println();

        System.out.println("Input a length for side a: ");
        double sideA = UserInput.nextDouble();

        System.out.println("Input a length for side b: ");
        double sideB = UserInput.nextDouble();


        double perim = (2*sideA)+(2*sideB);
        System.out.println("The perimeter of the rectangle is: "+perim);

        double area = sideA*sideB;
        System.out.println("The area of the rectangle is: "+area);

        System.out.println();
        System.out.println("End of task 1");
        System.out.println();
    }

    //задача 2
    public static void MonthsDays(){
        System.out.println();
        System.out.println("Task 2");
        System.out.println();

        Scanner UserInput = new Scanner(System.in);
        System.out.println("Input a number, corresponding to your desired month: ");
        int monthNumber = UserInput.nextInt();

        if (monthNumber<1 || monthNumber>12){
            System.out.println("Invalid month number!");
        } else {
            if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8
                    || monthNumber == 10 || monthNumber == 12) {
                System.out.println("The month you've chosen has 31 days");
            } else if (monthNumber == 2) {
                System.out.println("The month you've chosen has 28 days (29 for leap years)");
            } else {
                System.out.println("The month you've chosen has 30 days");
            }
        }

        System.out.println();
        System.out.println("End of task 2");
        System.out.println();
    }

    //задача 3
        public static void StringsShow () {
            Scanner UserInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Task 3");
        System.out.println();

        System.out.print("Press Enter to begin falling to your inevitable death: ");
        UserInput.nextLine();
        int floorCount=0;
        for (floorCount = 0; floorCount<10; floorCount++) {
            switch (floorCount) {
                case 1:
                    System.out.println("Hello Petya!");
                    break;
                case 2:
                    System.out.println("Hello Cecke!");
                    break;
                case 3:
                    System.out.println("Hello Valya!");
                    break;
                case 4:
                    System.out.println("Hello Tanya!");
                    break;
                case 5:
                    System.out.println("Hello Mimi!");
                    break;
                case 6:
                    System.out.println("Hello Mimi's mom!");
                    break;
                case 7:
                    System.out.println("Hello Desi!");
                    break;
                case 8:
                    System.out.println("Hello grumpy old lady from the first floor!");
                    break;
                case 9:
                    System.out.println("Ouch!");
                    break;
            }
        }
        System.out.println();
        System.out.println("End of task 3");
        System.out.println();
    }

}



