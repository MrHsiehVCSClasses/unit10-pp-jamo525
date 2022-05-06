package u10pp;

public class RecursivePalindromeChecker
{
  /*
  @preconditions no capitals/numbers/symbols/whitespace
  @param String that will be tested for being a palindrome.
  @return true if String is a palindrome. When printed backwards it will print the same thing as if printed forwards
  */
  public static boolean isPalindrome (String s)
  {
    if (s.length() == 1)
      return true;
    else if (s.length() == 2 && s.charAt(0) == s.charAt(s.length() - 1))
      return true;
    else if (s.charAt(0) == s.charAt(s.length() - 1))
      return true && isPalindrome(s.substring(1,s.length() - 1));
    else
      return false;
     
  }
}

