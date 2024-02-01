//FileNotFoundException

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class E_handling2 {
    public static void main(String[] args){

        try{
            File file=new File("E://file.txt");
            FileReader fr=new FileReader(file);
            System.out.println("file content :");
        }catch(FileNotFoundException e){
            System.out.println("cannot be found");
        }
    }
}
