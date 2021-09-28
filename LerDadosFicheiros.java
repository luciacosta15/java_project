import java.util.Scanner;              // para usar classe Scanner
import java.io.File;                   // para usar classe File
import FileNotFoundException;

public class LerDadosFicheiros{
   public static void main(String[] args) {
      try{
           File ficheiro = new File("in.txt");
           Scanner in = new Scanner(ficheiro); 
           while(in.hasNextLine()){  
               System.out.println(in.nextLine());
           }
           in.close(); 
      }catch(FileNotFoundException ex){
           System.out.println("O ficheiro não existe.");     
      }
   }
}