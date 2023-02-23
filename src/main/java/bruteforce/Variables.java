package bruteforce;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Variables
{
    ArrayList<Integer> array = new ArrayList<>();
    int numOfVariables = 0;
    int numOfClauses = 0;
    public ArrayList<Integer> readInput(String filepath)
    {
        try {
            Scanner s = new Scanner(new File(filepath));
            while (s.hasNext()) {
                if (s.hasNextInt()) {
                    array.add(s.nextInt());
                } else {
                    s.next();
                }
            }
            s.close();
            numOfVariables = array.get(0);
            numOfClauses = array.get(1);
            System.out.println("Number of Variables: " + numOfVariables);
            System.out.println("Number of Clauses: " + numOfClauses);
            deleteFirst2(array); //calls method to delete ints from comment line
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
        return array;
    }

        public void deleteFirst2(ArrayList<Integer> array)
        {
            for(int i = 0; i < 2; i++)
            {
                array.remove(0);
            }
        }
}

