
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
        
        int inicio;
        int parada;       
       
        System.out.println("Digite Numero do inicio da seguencia");       
        inicio = input.nextInt();               

        System.out.println("Digite o Numero a ser procurado nesta seguencia");       
        parada = input.nextInt();
        
       
        
        if(Fibonacci(inicio, parada) == parada){
            System.out.println("Numero encontrado na seguencia!");
        
        }else{
            System.out.println("Numero nao encontrado na seguencia!");
        } 
        
        input.close();
       
      
    }


    public static int Fibonacci(int Numero, int Parada){
        int Soma =0;
        int GuardaValor;
        do {
            System.out.println(Numero);
            GuardaValor = Numero;
            Numero = GuardaValor + Soma;
            Soma = GuardaValor;
        }while (Numero <= Parada);
      
        return GuardaValor;
    }


}
