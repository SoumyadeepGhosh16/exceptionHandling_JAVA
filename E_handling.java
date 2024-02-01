//ArithmeticExceptions
/*public class E_handling {
    public static void main(String[] args){
        int a=5;
        int b=0;

        try{
            int c=a/b;
            System.out.println("result="  +c);
        }catch(ArithmeticException e){
            System.out.println("can't be divided");
        }
    }
}*/

public class E_handling {
    public static void main(String[] args){
        int a=5;
        int b=0;

        try{
            int c=a/b;
            System.out.println("result="  +c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());//prints only the description of the exception that has occured
        }
    }

    public static void print(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
}
