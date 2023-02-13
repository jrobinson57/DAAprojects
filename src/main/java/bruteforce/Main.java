package bruteforce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    String inputData;
    ArrayList<String> array = new ArrayList<String>();

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
            Scanner s = new Scanner(new File(filepath));
            boolean searching = true;

            while(s.hasNext() && searching)
            {
                if(s.next().equals("0"))
                {
                    searching = false;
                    return;
                }
                else
                {
                    array.add(s.next());
                }

            }
            s.close();
            checkIfArraySatisfies(array);

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

    public void checkIfArraySatisfies(ArrayList<String> array)
    {
        System.out.println("Checking " + array + " for satisfying assignment");
        //print every value at each index in initial arrayList
        for(int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }
        //if satisfiable, print the satisfying formula
        //if unsatisfiable, check the next line from the input file
    }
}
