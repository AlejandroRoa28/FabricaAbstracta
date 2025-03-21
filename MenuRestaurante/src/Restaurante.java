import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            MenuFactory menuFactory = null;
            
            while (menuFactory == null) { // Repetir hasta que el usuario ingrese un menú válido
                System.out.print("Ingrese el tipo de menú (Vegetariano, Gourmet, Saludable): ");
                String tipoMenu = scanner.nextLine().trim().toLowerCase();
                
                switch (tipoMenu) {
                    case "vegetariano" -> menuFactory = new MenuVegetariano();
                    case "gourmet" -> menuFactory = new MenuGourmet();
                    case "saludable" -> menuFactory = new MenuSaludable();
                    default -> System.out.println("❌ Tipo de menú no disponible. Inténtelo de nuevo.");
                }
            }
            
            Menu menu = menuFactory.crearMenu();
            System.out.println("\n✅ Menú generado:");
            System.out.println(menu);
            
            // Mostrar el precio total sin conversión
            System.out.println("\n💰 Precio total del menú: $" + (double) menu.getPrecioTotal());
        }
    }
}
