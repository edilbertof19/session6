import java.io.File;
import java.util.Scanner;

public class SimpleFileReader
{
    public static void main(String[] args) throws Exception
    {
        //pass the path to the file as a parameter
        File file = new File("numbers");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
            int number = sc.nextInt();
            number = number + 3;
            System.out.println(number);
            //System.out.println(sc.nextLine());
            //file.close();

        }
    }
}
