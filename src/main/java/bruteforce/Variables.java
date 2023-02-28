package bruteforce;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Variables
{

    ArrayList<Integer> array = new ArrayList<>();
    public int numOfVariables = 0;
    int numOfClauses = 0;

    /*
      Pre-Req: Must be .cnf file with DIMACS format
      method to read the given input file and extract the
      number of variables, number of clauses and puts all
      other ints including the 0's into an ArrayList<Integer>
      @param filepath - the .cnf file that is to be turned into an ArrayList
      @returns ArrayList<Integer> - the full ArrayList of all ints from the file (including 0's)
      @throws IOexception - If an incorrect filepath is provided
     */
    public ArrayList<Integer> readInput(String filepath)
    {
        try
        {
            Scanner s = new Scanner(new File(filepath));

            while(s.hasNextLine())
            {
                String line = s.nextLine();
                if(line.startsWith("c"))
                {
                    continue;
                }

                String[] parts = line.split("\\s+");
                for(String part : parts)
                {
                    try
                    {
                        if(part.equals("p") || part.equals("cnf") || part.equals(""))
                        {
                            continue;
                        }
                        int num = Integer.parseInt(part);
                        array.add(num);
                    }
                    catch(NumberFormatException e)
                    {
                        e.printStackTrace();
                    }
                }
            }

            /*
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
             */
            s.close();
            numOfVariables = array.get(0);
            numOfClauses = array.get(1);
            System.out.println("Variables: " + numOfVariables);
            System.out.println("Clauses: " + numOfClauses);
            deleteFirst2(array); //calls on method to delete ints from comment line
        }
        catch(IOException e)
        {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
        return array;
    }

    // helper method to remove the first 2 ints from the comment line
    // array - the array that was created from the input file
    public void deleteFirst2(ArrayList<Integer> array)
    {
        for(int i = 0; i < 2; i++)
        {
            array.remove(0);
        }
    }

    //prints the contents of the array created
    public void printArray()
    {
        System.out.println(array);
    }

}