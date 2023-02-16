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
    ArrayList<Integer> array = new ArrayList<Integer>();
    ArrayList<Integer> combinedArray = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String filepath = "";

        System.out.println("Enter the filepath of the input.");
        filepath = sc.nextLine();
        sc.close();
        m.readInput(filepath);
    }

    //reads file input and attempts to store it in an arrayList
    // string filepath - source of input file
    public void readInput(String filepath)
    {
        try
        {
            Scanner s = new Scanner(new File(filepath));

            while(s.hasNext())
            {
                if(s.hasNextInt())
                {
                    array.add(s.nextInt());
                }
                else
                {
                    s.next();
                }
            }
            s.close();
            //gets rid of the first row of the input file, which shouldn't be part of the main data
            for(int i = 0; i < 4; i++)
            {
                array.remove(0);
            }
            System.out.println(array);
            splitIntoSmallerArray(array);
        }
        catch(IOException e)
        {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    ArrayList<Integer> smallArray = new ArrayList<Integer>();
    public void splitIntoSmallerArray(ArrayList<Integer> array)
    {
        boolean addingToArray = true;
        while(addingToArray)
        {
            for(int i = 0; i < array.size(); i++)
            {
                if(array.get(i) == 0)
                {
                    addingToArray = false;
                    //return;
                }
                else if(addingToArray)
                {
                    smallArray.add(array.get(i));
                }
                else
                {
                    //do nothing
                }
            }
        }
        System.out.println("Created Sub-Array of size: " + smallArray.size());
        for(int i = 0; i < smallArray.size(); i++)
        {
            System.out.println(smallArray.get(i));
        }
        combineTheArrays(smallArray);
        System.out.println(combinedArray);
        //checkIfArraySatisfies(smallArray);
    }

    public void combineTheArrays(ArrayList<Integer> smallArray)
    {
        for(int i = 0; i < smallArray.size(); i++)
        {
            System.out.println("Added " + smallArray.get(i) + " to the combined array");
            combinedArray.add(smallArray.get(i));
        }
    }

    public void checkIfArraySatisfies(ArrayList<Integer> array)
    {
        System.out.println("Checking " + array + " for satisfying assignment");

        //if satisfiable, print the satisfying formula
        //if unsatisfiable, check the next line from the input file
    }
}
