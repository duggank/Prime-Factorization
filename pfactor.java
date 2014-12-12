public class pfactor
{
 
  public static void main(String[] args)
  {
    int num = 2;
    
    while (num < 1000)
    {
    System.out.println(num + " = " + primeFactorization(num));
    num++;
    }
  }
  
  
  public static String primeFactorization(int num)
  {
      String out = "";

      int i = 2;
      while(num > 1)
      {
          if(num % i == 0)
          {
            if(num != i)  
          {
           
              num /= i;
              out += i + " x ";
            }
              else
              {
                num /= i;
                out += num + " x " + i;
              }

          }
          
          
              i++;
      }
      if (out.substring(out.length() - 2).indexOf("x ") >= 0)
      {
        return out.substring(0, out.length() - 2);
      }
      return out;
  }

}