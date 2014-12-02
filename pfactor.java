public class pfactor
{
 
  public static void main(String[] args)
  {
    int num = 20;
    primeFactorization(num);
    
  }
  
  public static boolean isPrime(int num)
  {
       for(int i = num; i > 0; i--)
       {
         if(num % i == 0)
         {
           num /= i;
           if(num != 1)
           {
             num /= i;
           }
         }      
       }
  }
  
  
  public static String primeFactorization(int num)
  { 
  }

}