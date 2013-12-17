// TODO: Auto-generated Javadoc
/**
 * The Class TeWeinigGeldException.
 */
public class TeWeinigGeldException extends Exception
{
   
   /** The message. */
   String message;
   
   /**
    * constructor voor exception.
    */
   public TeWeinigGeldException()
   {
       
   }
   
   /**
    * constructor voor exception.
    *
    * @param e the e
    */
   public TeWeinigGeldException(Exception e)
   {
       
   }
   
   /**
    * constructor voor exception.
    *
    * @param message the message
    */
   public TeWeinigGeldException(String message)
   {
       this.message = message;
   }
   
   /**
    * toString methode.
    *
    * @return the string
    */
   public String toString()
   {
       return message;
   }
}