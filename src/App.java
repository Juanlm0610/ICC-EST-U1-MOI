public class App {
    public static void main(String[] args) throws Exception {
        
        MetodoOrdenamiento mO = new MetodoOrdenamiento();

        int[] arreglo = {23,542,42,3,52,5,4};

        System.out.println("El Arreglo Ordenado es ");

        int[] arregloOrdc = mO.SortByInsercion(arreglo);

        mO.prntArregloOrdc(arregloOrdc);

    }
}
