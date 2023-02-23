package bruteforce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Variables v = new Variables();
        Clauses c = new Clauses();
        Assignments a = new Assignments();

        c.createClauses(v.readInput("C:\\Users\\18566\\Desktop\\DAA Projects\\daaprojects\\src\\main\\java\\bruteforce\\s5.cnf"));
        c.printAllClauses();
        c.isSatisfiable(a.createArray(v.numOfVariables));
    }
}
