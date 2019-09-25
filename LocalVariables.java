public class LocalVariables
{
    public static void main(String args[])
    {
        double myfirstone = 5.0;

        {//Block 1

            double var1 = 0.0;
            double var2;
            {//Block 1.1
                //double var 1 = 3.0; // Error! declaration not allowed
                var2 = 4.0;
                double var3 = 8.0;
                var1 = 34; // access to variable in block above
            }
            {//Block 1.2
                double var4 = 5; //declaration allowed here var2 = 4.0; //access var 2 from block 1.2 var3 = 5.0; // Error ! no var 3 in blcok 1.2

                System.out.println(var2);

            }
        }
    }
}
