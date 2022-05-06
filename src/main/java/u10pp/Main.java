package u10pp;
import java.util.*;

public class Main 
{
    public static void main(String[] args) {

        // Some example test cases are given below

        // System.out.println(String.format("The %sth Fibonacci Number is: %s", 
             // 5, RecursiveMath.getFibonacciNumber(5)));

        // System.out.println(String.format("%s factorial is: %s", 
             // 5, RecursiveMath.getFactorial(5)));

        // System.out.println(String.format("%s to the %s is: %s", 
             // 4, 3, RecursiveMath.pow(4, 3)));

     //   System.out.println(String.format("Is %s a palindrome? %s.",
        //     "asdffdsa", RecursivePalindromeChecker.isPalindrome("asdffdsa")));

        // simple sudoku puzzle
        int[][] sudokuPuzzle = {
            {5, 3, 1, 2, 7, 4, 8, 9, 0},
            {6, 4, 2, 1, 9, 5, 3, 0, 7},
            {0, 9, 8, 3, 0, 0, 1, 6, 2},
            {8, 2, 9, 5, 6, 1, 4, 0, 3},
            {4, 5, 6, 8, 0, 3, 7, 2, 1},
            {7, 1, 3, 9, 2, 0, 5, 0, 6},
            {1, 6, 4, 0, 3, 7, 2, 8, 0},
            {2, 7, 0, 4, 1, 9, 6, 3, 5},
            {3, 0, 5, 6, 8, 2, 0, 7, 9}
         };
        System.out.println("\nSimple Sudoku:");
System.out.println(IOHelper.formatSudokuPuzzle(SudokuSolver.solve(sudokuPuzzle)));

         // using all the sudoku examples in sudokuPuzzles.txt
//         List<int[][]> puzzles = IOHelper.getPuzzlesFromFile("../src/main/java/u10pp/sudokuPuzzles.txt");
 //        for(int[][] puzzle : puzzles) {
             // System.out.println(IOHelper.formatSudokuPuzzle(SudokuSolver.solve(puzzle)));
      //}

        // // numbrix example
        // int[][] numbrixPuzzle = {
        //     { 1,  0,  0, 10},
        //     { 2, 13,  0,  0},
        //     { 3, 14,  0,  0},
        //     { 4,  0,  0,  7}
        // };
        // System.out.println("\nSimple Numbrix:");
        // System.out.println(IOHelper.formatNumbrixPuzzle(NumbrixSolver.solve(numbrixPuzzle)));

        // // using all the numbrix examples in numbrixPuzzles.txt
        // List<int[][]> puzzles = IOHelper.getPuzzlesFromFile("src\\main\\java\\u10pp\\numbrixPuzzlesFromREADME.txt");
        // for(int[][] puzzle : puzzles) {
        //     System.out.println(IOHelper.formatNumbrixPuzzle(NumbrixSolver.solve(puzzle)));
        //     System.out.println();
        // }
    }
}
