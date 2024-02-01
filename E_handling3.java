public class E_handling3
{

    public static void main (String[] args) 
    {
         
        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[5];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch(NullPointerException e){
            System.out.println("wrong exception format");
        }
       /*  catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in Catch block");
        }*/
        finally{
            System.out.println("exception format should be ArrayIndexOutOfBoundsException");
        }
         
        // rest program will be executed if only exception format is alright
        System.out.println("Outside try-catch clause");
    }
}
