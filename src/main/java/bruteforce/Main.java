package bruteforce;
import java.sql.Array;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //creating an ArrayList to store the file path to each .cnf file in my package
        ArrayList<String> inputPaths = new ArrayList<>();
        inputPaths.add("src/main/java/bruteforce/s5.cnf");
        inputPaths.add("src/main/java/bruteforce/s15.cnf");
        inputPaths.add("src/main/java/bruteforce/u15.cnf");
        inputPaths.add("src/main/java/bruteforce/s20.cnf");
        inputPaths.add("src/main/java/bruteforce/u20.cnf");
        inputPaths.add("src/main/java/bruteforce/u27.cnf");
        inputPaths.add("src/main/java/bruteforce/s28.cnf");
        inputPaths.add("src/main/java/bruteforce/u29.cnf");
        inputPaths.add("src/main/java/bruteforce/u30.cnf");
        inputPaths.add("src/main/java/bruteforce/u32.cnf");

        //starts tests for each of the above input files
        for(int i = 0; i < inputPaths.size(); i++)
        {
            System.out.println("==================================");
            long startTime = System.currentTimeMillis();
            Variables v = new Variables();
            Clauses c = new Clauses();
            Assignments a = new Assignments();

            System.out.println("Test #" + (i + 1));
            ArrayList<Integer> array = v.readInput(inputPaths.get(i));
            int numOfVariables = v.numOfVariables;
            c.createClauses(array);
            int[] assignment = a.createArray(numOfVariables);

            boolean isSatisfiable = false;
            while(true)
            {
                if(c.isSatisfiable(assignment))
                {
                    isSatisfiable = true;
                    break;
                }
                assignment = a.incrementAssignment(assignment);
                if(assignment == null)
                {
                    break;
                }
            }

            if(isSatisfiable)
            {
                System.out.println("Satisfiable: " + Arrays.toString(assignment));
            }
            else
            {
                System.out.println("Unsatisfiable");
            }
            long endTime = System.currentTimeMillis();
            long runTime = endTime - startTime;
            System.out.println("Runtime: "  + runTime);
            array = new ArrayList<>();
        }
    }
}