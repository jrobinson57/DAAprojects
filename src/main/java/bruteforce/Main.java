package bruteforce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    String inputData;
    ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String filepath = "";

        System.out.println("Enter the filepath of the input.");
        filepath = sc.nextLine();
        m.readInput(filepath);
    }

    //reads file input and attempts to store it in an arrayList
    // string filepath - source of input file
    public void readInput(String filepath)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while((reader.ready()))
            {
                for(int i = 0; i < 1; i++)
                {
                    array.add(reader.read());
                }
            }
            System.out.println(array);
        }
        catch(IOException e)
        {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    //prints file input
    //@string filepath - source of input file
    public void printInput(String filepath)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println();
            }
        }
        catch(IOException e)
        {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    public void parseInput(String inputData)
    {
        //while()
    }
}
