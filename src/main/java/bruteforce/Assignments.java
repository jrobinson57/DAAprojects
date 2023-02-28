package bruteforce;

import java.util.Arrays;

public class Assignments
{
    /*
        Method to create an array of ints that is the numOfVariables long, holds 1's for true and 0's for false
        @param int numOfVariables - The number of variables that was taken from the input file
        @return int[] - returns the array that was created
     */
    public int[] createArray(int numOfVariables)
    {
        int[] assignment = new int[numOfVariables];
        Arrays.fill(assignment, 0);

        //Only needed these for testing purposes
        //System.out.println("Created Array of size: " + numOfVariables);
        /*

        for(int i = 0; i < assignment.length; i++)
        {
            System.out.println("Position: " + i + ": " + assignment[i]);
        }
         */
        return assignment;
    }

    /*
        Method to increment the assignment until all possibilities have been given
        @param int[] assignment - The initial array of 1's and 0's that was already created above
        @return int[] - returns the new assignment
        @return null - returns null if all assignments were tried
     */
    public int[] incrementAssignment(int[] assignment)
    {
        int i = assignment.length - 1;
        while(i >= 0)
        {
            if(assignment[i] == 0)
            {
                assignment[i] = 1;
                return assignment;
            }
            else
            {
                assignment[i] = 0;
                i--;
            }
        }
        return null; //at this point, all assignments were tried
    }
}
