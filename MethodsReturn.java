public class MethodsReturn
{
    public static void main (String args[])
    {
        double d1 = 0.1;
        double myDouble = 0.01;

        double area = calculateAreaWithReturn(d1, myDouble);
        System.out.println("The area is: " + area);
    }

/*    public static double calculateAreaWithReturn()
    {
        double d1 = 0.1;
        double myDouble = 0.01;

        double area = d1 * myDouble;

        return area;
    }*/
    public static double calculateAreaWithReturn(double d1, double myDouble)
    {
         d1 = 0.1;
         myDouble = 0.01;

        double area = d1 * myDouble;

        return area;
    }

}
