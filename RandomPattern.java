import java.util.Random;
/**
 * Write a program that prints the following pattern
 * using random numbers instead of the black squares
 * (Your pattern should look the same but has different number sprinted)
 */
public class RandomPattern
{
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) //outer loop, manages columns
        {
            System.out.println();
            for (int j = 0; j < 10; j++) //inner loop, manages columns
            {
                //even and odd numbers the modulus is the trick
                //this type of test allows you to test for even numbers inside the if statement

                if((i % 2 == 0 && j % 2 == 0 || (i % 2 > 0 && j % 2 > 0)))
                {
                    //"seed" helps you produce a specific random number every time
                    Random randomNumbers = new Random();//seed 56748
                    //when you put a bound
                    System.out.print(randomNumbers.nextInt(10));
                    //System.out.print(i + "," + j + " ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}
//if ((i % 2 == 0 && j % 2 == 0 || (i % 2 > 0 && j % 2 > 0))