package u10pp;
import java.util.*;

public class SudokuSolver
{

  public static int[][] solve(int[][] puzzle)
  {
    recursiveTest(puzzle);
    return puzzle;
  }
  /*
  @param sudoku board and row being checked
  @return true if row has all different values
  */
  public static boolean checkRow (int[][] puzzle, int r)
  {
    for (int i = 0; i < puzzle.length; i ++)
    {
      for (int j = i + 1; j < puzzle.length; j++)
      {
        if (puzzle[r][i] == puzzle[r][j] && puzzle[r][j] != 0)
            return false;
      }
    }
    return true;
  }
  /*
  @param sudoku board and column being checked
  @return true if column has all different values
  */
  public static boolean checkCol (int[][] puzzle, int c)
  {
    for (int i = 0; i < puzzle[0].length; i ++)
    {
      for (int j = i + 1; j < puzzle[0].length; j ++)
      {
        if (puzzle[i][c] == puzzle[j][c] && puzzle[j][c] != 0)
            return false;
      }  
    }
    return true;
  }

  /*
  @param sudoku board and row and column of top left index of box being checked
  @return true if box has all different values
  ERROR top left index doesn't work, it has to be 
  every index
  */
  public static boolean checkBox (int[][] puzzle, int r, int c)
  {
    int l = (int) Math.sqrt(puzzle.length);
    r = (int) r - (r % l);
    c = (int) c - (c % l);
    for (int i = r; i < r + l; i ++)
    {
      for (int j = c; j < c + l; j ++)
      {
        for (int k = r; k < l + r; k ++)
        {
          for (int m = c; m < l + c; m ++)
          {
            if (!(k == i && m == j) && puzzle[i][j] == puzzle[k][m] && puzzle[k][m] != 0)
              return false;
          }
        }
      }
    }
    return true;
  }

  /*
  @param sudoku board and the row and column of square being solved
  @return true if square value fits in board, will change value so that it fits
  */
  public static void recursiveTest(int[][] puzzle)
  {
System.out.println();    System.out.println(IOHelper.formatSudokuPuzzle(puzzle));
    for (int r = 0; r < puzzle.length; r ++)
    {
      for (int c = 0; c < puzzle[r].length; c ++)
      {
        while (!(checkRow(puzzle, r)) || !(checkCol(puzzle, c)) || !(checkBox(puzzle, r, c)) || puzzle[r][c] == 0)
        {
          puzzle[r][c] ++;
          if (puzzle[r][c] > puzzle.length)
            puzzle[r][c] = 0;
          recursiveTest(puzzle);
        }
      }
    }
  }


// Crap Code
/*  if (checkRow(puzzle, r) && checkCol(puzzle, c) && checkBox(puzzle, r, c) && puzzle[r][c] != 0)
    {
      return true;
    }
    else if (puzzle[r][c] >= puzzle.length)
    {
      puzzle[r][c] = 0;
      if (r > 0 && c > 0)
        puzzle[r][c - 1] ++;
        recursiveTest(puzzle, r, c - 1);
        return recursiveTest(puzzle, r, c);
      else if (r > 0)
        return recursiveTest(puzzle, r - 1, puzzle.length - 1);
      else
        return false;
    }
    else
    {
      puzzle[r][c] ++;
      return recursiveTest(puzzle, r, c);
    }

// // Crap Code 2
for (int r = 0; r < puzzle.length; r ++)
    {
      for (int c = 0; c < puzzle[r].length; c ++)
      {
        while (!(checkRow(puzzle, r) && checkCol(puzzle, c) && checkBox(puzzle, r, c) && puzzle[r][c] != 0))
        {
          puzzle[r][c] ++;
          if (puzzle[r][c] > puzzle.length)
          {
            puzzle[r][c] = 0;
            if (r > 0 && c > 0)
              return recursiveTest(puzzle, r, c - 1);
            else if (r > 0)
              return recursiveTest(puzzle, r - 1, puzzle.length - 1);
            else
              return false;
          }
        }
      }
    }
    return true;
*/
}