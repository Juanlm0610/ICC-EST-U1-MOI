
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        MetodoOrdenamiento mO = new MetodoOrdenamiento();

        Scanner leer = new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamanio del arreglo: ");
        tam = leer.nextInt();
        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el numero de la poscision "
                    + (i + 1));
            int num = leer.nextInt();
            arreglo [i] = num;
        }
       
            System.out.println("El Arreglo Ordenado es ");

            int[] arregloOrdc = mO.SortByInsercion(arreglo, true);

            mO.prntArregloOrdc(arregloOrdc);
    }
}
