public class E_handling5 {
    public static void main(String[] args) {
        try{
          Class.forName("E_handling4");
          System.out.println("class found in the java file");
        }catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println("Class not found");
        }
    }
}
