import java.util.Scanner;
public class QuitarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido nombre completo al usuario
        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();
        // Vocales que quiero eliminar (incluye mayúsculas, minúsculas y acentuadas)
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        // Variable donde se hace el resultado sin vocales
        String resultado = "";

        // Recorro el nombre carácter por carácter
        for (int i = 0; i < nombre.length(); i++) {
            char z = nombre.charAt(i);
            // indexOf devuelve -1 si el carácter NO está en la lista de vocales
            if (vocales.indexOf(z) == -1) {
                resultado += z;
            }
        }
        // Se muestra el resultado final sin vocales
        System.out.println("Sin vocales: " + resultado);
        sc.close();
    }
}
