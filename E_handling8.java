public class E_handling8 {
    static void fun() throws IllegalAccessException{
        System.out.println("inside fun method");
        throw new IllegalAccessException("practice");
    }
    public static void main(String[] args) {
        try{
            fun();
        }catch(IllegalAccessException e){
           e.printStackTrace();
        }
    }
}
