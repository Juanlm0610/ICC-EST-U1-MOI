import java.util.Arrays;

public class MetodoOrdenamiento {

    public int[] SortByInsercion(int[] arreglo, boolean logs) {
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;

            if (logs) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            }

            while (j >= 0 && arreglo[j] > key) {
                if (logs) {
                    System.out.println("\t\tCompramos " + key + " con " + arreglo[j]);
                }
                arreglo[j + 1] = arreglo[j];
                j--;
                if (logs) {
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }
            }
            arreglo[j + 1] = key;
            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }
        }
        return arreglo;

    }

    public void prntArregloOrdc(int[] prntArregloOrdc) {
        System.out.print("Menor a mayor = ");
        for (int elemento : prntArregloOrdc) {

            System.out.print(" " + elemento + " ");

        }
    }

}
