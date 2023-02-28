===================================================
VERSION 2.27.23
@author James Robinson
===================================================
Quick Summary: Given a boolean formula, this program
computes any satisfying assignment for it, if one exists.
If no satisfying assignment exits, it will report that
the formula is unsatisfiable. The program will read a
formula from a file, then create the necessary components
to compute a satisfying formula.
===================================================
Pre-requisites: The input file must be in DIMACS format
with the cnf extension in order to work properly.
====================================================
Project Summary:
This package will take a .cnf input file in DIMACS
format and derive the number of variables and number
of clauses from the first data line marked with "p".
From there, the Variable class will read the rest of
the input file and create an ArrayList of all the ints
provided INCLUDING the 0's. The Clauses class will take
that ArrayList of ints and create an ArrayList of
ArrayList<Integer>'s where each ArrayList<Integer> is
made up of every int until it comes across a 0 which
indicates the end of the clause. The Assignments class
will create an Array of ints based on the number of
variables it found earlier. To start, it will set every
value to 0, which in this case means FALSE. From here,
we put the input into a brute force algorithm where
the program checks various versions of the assignment
to see if there is ever a time when all parts are
satisfied and the equation is true. If there is an
instance where the equation is true, the console will
print out "Satisfiable: " followed by the combination
of 1's and 0's (or true & false's) that satisfy the
given equation. If there is never an instance of
satisfiability, the console will print "Unsatisfiable".
The console will ALWAYS print the test number followed
by the number of variables, number of clauses, SAT and
runtime.