package bruteforce;
import java.util.ArrayList;

public class Clauses
{
    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    ArrayList<Integer> clause = new ArrayList<>();

    /*
        method takes an ArrayList<Integer> and parses it at every instance of a 0, creating
        a "Clause", which is then put into an ArrayList of ArrayList's
        @param ArrayList<Integer> array - The ArrayList that read the input file and has 0s.
     */
    public void createClauses(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) == 0)
            {
                //System.out.println("Adding this clause: " + clause);
                arrayLists.add(clause);
                clause = new ArrayList<Integer>();
            }
            else
            {
                clause.add(array.get(i));
            }
        }
    }

    //prints the arraylist of arraylists, then each ArrayList<Integer> within arrayLists individually
    public void printAllClauses()
    {
        System.out.println(arrayLists);

        for(int i = 0; i < arrayLists.size(); i++)
        {
            System.out.println("Clause " + i + ": " + arrayLists.get(i));
        }
    }

    public void checkClauses(boolean[] assignment)
    {
        for(int i = 0; i < arrayLists.size(); i++)
        {
            if(arrayLists.get(i).isEmpty())
            {
                System.out.println("Clause " + i + " is Satisfiable");
            }
        }
    }

    /*
        Method that checks for satisfiability against a given assignment
        @param int[] assignment - the array that is the numOfVariables long which holds 1's or 0's for true and false
     */
    public boolean isSatisfiable(int[] assignment)
    {
        for(ArrayList<Integer> clause : arrayLists)
        {
            boolean clauseSatisfied = false;
            for(int var : clause)
            {
                //System.out.println(clause);
                int variable = Math.abs(var);
                boolean value = (var > 0) ? true : false;
                if(assignment[variable-1] == (value ? 1 : 0))
                {
                    clauseSatisfied = true;
                    break;
                }
                else
                {
                    //do nothing
                }
            }
            if(!clauseSatisfied)
            {
                return false;
            }
        }
        return true;
    }

}