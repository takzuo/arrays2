public class Main {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Crear el arreglo de 10

        int sumaPares = 0;
        int sumaImpares = 0;

        // Sumar los valores de las posiciones pares e impares
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 2 == 0) { //verificamos si i es par
                sumaPares += arreglo[i];
            } else {
                sumaImpares += arreglo[i];
            }
        }

        // Mostrar los resultados
        System.out.println("La suma de las posiciones pares es: " + sumaPares);
        System.out.println("La suma de las posiciones impares es: " + sumaImpares);
    }
}