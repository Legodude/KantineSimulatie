public class TeWeinigGeldException extends Exception
{
   String message;
   public TeWeinigGeldException()
   {
       
   }
   public TeWeinigGeldException(Exception e)
   {
       
   }
   public TeWeinigGeldException(String message)
   {
       this.message = message;
   }
   public String toString()
   {
       return message;
   }
}