package tareasumamaxima;

public class TareaSumaMaxima {
    
    public static int maximaSumaConsecutiva(int[] arr) {
        int maxSuma = 0;  // La suma máxima encontrada hasta ahora
        int sumaAhora = 0; // La suma máxima terminando en la posición actual

        for (int num : arr) {
            System.out.print(num+"| ");
            sumaAhora = Math.max(0, sumaAhora + num); // Si la suma actual se vuelve negativa, reiniciamos a 0
            maxSuma = Math.max(maxSuma, sumaAhora);   // Actualizamos la suma máxima global
        }

        return maxSuma;
    }
    
    public static void main(String[] args) {
        int[] arr = {-2, 11, -4, 13, -5, 9, -3, 2, -8, 4};
        int maxSum = maximaSumaConsecutiva(arr);
        System.out.println("\nLa suma maxima de la subsecuencia es: " + maxSum);
    }
    
}
