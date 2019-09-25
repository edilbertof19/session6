import java.util.Scanner;

public class NeMethodsReturn
{
    public static void main(String args[])
    {
        System.out.println("Please enter your choice for calculation: 1(circle), 2(rectangle), 3(square)");

        int selection;
        Scanner keyboard = new Scanner(System.in);
        selection = keyboard.nextInt();

        double area;

        switch(selection)
        {
            case 1://circle
                System.out.print("What is the radius of the circle:");
                double radius = keyboard.nextDouble();
                area = calculateAreaForCircle();
                break;

            case 2://rectangle
                System.out.print("What is the length:");
                double length = keyboard.nextDouble();
                System.out.print("What is the width:");
                double width = keyboard.nextDouble();
                area = calculateAreaForRectangle();
                break;

            case 3://square
                System.out.print("What is the length:");
                double s = keyboard.nextDouble();
                area = calculateAreaForSquare(();
                break;

        }

    }
        public static double calculateAreaForCircle(double a)
        {
            return Math.PI * a * a;
        }

        public static double calculateAreaForRectangle(double a, double b)
        {
            return a * b;
        }

        public static double calculateAreaForSquare(double a)
        {
            return a * a;
        }

    }
}

