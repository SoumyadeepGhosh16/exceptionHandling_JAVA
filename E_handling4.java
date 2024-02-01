public class E_handling4{

 public static void print(int a){
     if(a>=18){
        System.out.println("eligible for voting");
     }else{
        throw new IllegalArgumentException("not eligible for voting");
     }
    
 }   
    public static void main(String[] args) {
        E_handling4.print(19);
    }
}
