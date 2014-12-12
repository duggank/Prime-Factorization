public class pfactor
{
 
  public static void main(String[] args)
  {
    int num = 140;
    System.out.print(primeFactorization(num));
    
  }
  
  
  public static String primeFactorization(int num)
  {
      String out = "";
      int thing;

      int i = 2;
      while(num > 1)
      {
          if(num % i == 0)
          {
              num /= i;
              out += i + " x ";

          }
          else
              i++;
      }
      return out;

  }

}