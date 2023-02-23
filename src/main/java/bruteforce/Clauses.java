package bruteforce;

import java.util.ArrayList;

public class Clauses
{
    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    ArrayList<Integer> clause = new ArrayList<>();

    public void createClauses(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) == 0)
            {
                System.out.println("Adding this clause: " + clause);
                arrayLists.add(clause);
                clause = new ArrayList<Integer>();
            }
            else
            {
                clause.add(array.get(i));
            }
        }
    }

    public void printAllClauses()
    {
        System.out.println(arrayLists);
        for(int i = 0; i < arrayLists.size(); i++)
        {
            System.out.println("Clause " + i + ": " + arrayLists.get(i));
        }
    }

    public boolean isSatisfiable(int[] assignment)
    {
        for(ArrayList<Integer> clause : arrayLists)
        {
            boolean clauseSatisfied = false;
            for(int var : clause)
            {
                System.out.println(var);
                int variable = Math.abs(var);
                boolean value = (var > 0) ? true : false;
                if(assignment[variable] == (value ? 1 : 0))
                {
                    System.out.println("Satisfied");
                    clauseSatisfied = true;
                    break;
                }
                else
                {
                    System.out.println("Unsatisfied");
                }
            }
            if(!clauseSatisfied)
            {
                System.out.println("False");
                changeAssignment(assignment);
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

    public int[] changeAssignment(int[] assingment)
    {
        return null;
    }
}
