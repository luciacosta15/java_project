import java.util.Scanner;        
import java.util.Arrays;

public class RemoveDuplicadosNumArray 
{
    public static void main(String[] args) 
    {
        
        //declarar variáveis
        Scanner input = new Scanner(System.in);
        int tamanhoArray;
        System.out.println(" Introduza o tamanho do Array: ");
        tamanhoArray = input.nextInt();

        //System.out.println(tamanhoArray);
        
        //declarado o array de Integer 
        Integer[] duplicados = new Integer[tamanhoArray];
        //System.out.println(duplicados);
        
       System.out.println(" Introduza os valores no array ");
        for(int i = 0; i < duplicados.length; i++){
            duplicados[i] = input.nextInt();
        }
       
         ImprimirArrays(duplicados);
        
        for(int j = 0; j< duplicados.length; j++){
            for(int k = j + 1; k < duplicados.length; k++){ 
                if(duplicados[j] == duplicados[k]){
                    duplicados[k] = null;
                }
            }
        }
        ImprimirArrays(duplicados);


    }

    public static void ImprimirArrays(Integer[] x) {

        System.out.println(Arrays.toString(x));
    
    }    
}

