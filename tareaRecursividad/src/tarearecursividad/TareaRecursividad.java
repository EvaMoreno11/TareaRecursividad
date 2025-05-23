package tarearecursividad;
import java.util.Scanner;


public class TareaRecursividad {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int v1=0, v2=0;
            do{
            System.out.println("Ingrese la primer variable: ");
            v1=sc.nextInt();
            System.out.println("Ingrese la segunda variable: ");
            v2=sc.nextInt();
            }while(v1<0 || v2<0);
            
            int resultado = fAckermanPeter(v1,v2);
            System.out.println("A("+v1+", "+v2+") = "+resultado);
            
        }
        
        public static int fAckermanPeter(int m, int n){
            
            // Simulación de pila con un arreglo
            int[] pila = new int[1000];  
            int cima = 0;  

            while (true) {
                if (m == 0) {
                    n = n + 1;
                    if (cima == 0) {
                        break;
                    }
                    // Simula retorno de llamada
                    m = pila[--cima];
                } else if (n == 0) {
                    m = m - 1;
                    n = 1;
                } else {
                    // Simula A(m - 1, A(m, n - 1))
                    // se guarda m - 1 y resolvemos A(m, n - 1)
                    pila[cima++] = (m - 1);
                    n = n - 1;
                }
            }
            return n;
        }
}
