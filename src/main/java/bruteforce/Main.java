package bruteforce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String filepath = "";

        System.out.println("Enter the filepath of the input.");
        filepath = sc.nextLine();
        m.readInput(filepath);
    }

    public void readInput(String filepath)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
