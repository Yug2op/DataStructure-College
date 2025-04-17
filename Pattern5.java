public class Pattern5 {
    public static void main(String[] args) {



  int n = 5;
  for (int row = 1; row <= n; row++)        // rows from 1-5
    {

      for (int col = 1; col <= row; col++)    // Increasing Triangle
        System.out.print("* ");

      for (int col = row; col < n; col++)    // Decreasing triangle 
      System.out.print ("  ");    // printing spaces

      for (int col = row; col < n; col++)    // Decreasing triangle 
      System.out.print ("  ");    // printing spaces

      for (int col = 1; col <= row; col++)    // Increasing Triangle
      System.out.print ("* ");

      System.out.print ("\n");
    }
  for (int row = 1; row <= n - 1; row++)    // rows from 6-9  
    {
      for (int col = row; col < n; col++)    // Decreasing triangle 
      System.out.print ("* ");        

      for (int col = 1; col <= row; col++)    // Increasing Triangle
      System.out.print ("  ");

      for (int col = 1; col <= row; col++)    // Increasing Triangle
      System.out.print ("  ");

      for (int col = row; col < n; col++)    // Decreasing triangle 
      System.out.print ("* ");        


      System.out.print ("\n");
    
}
    }
}
