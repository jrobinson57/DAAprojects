package bruteforce;

import java.util.Arrays;

public class Assignments
{
    public int[] createArray(int numOfVariables)
    {
        int[] assignment = new int[numOfVariables];
        Arrays.fill(assignment, 0);
        System.out.println("Created Array of size: " + numOfVariables);
        for(int i = 0; i < assignment.length; i++)
        {
            System.out.println("Position: " + i + ": " + assignment[i]);
        }
        return assignment;
    }
}
