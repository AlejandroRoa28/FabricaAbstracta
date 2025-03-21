public class MenuGourmet implements MenuFactory {
    @Override
    public Menu crearMenu() {
        return new Menu(
            new Entrada("Carpaccio de res", "Láminas de res con alcaparras y queso parmesano", 180, 18000),
            new PlatoPrincipal("Filete mignon", "Filete de res con salsa de vino tinto", 700, 40000),
            new Postre("Soufflé de chocolate", "Postre de chocolate con centro derretido", 400,18000),
            new Bebida("Vino tinto", "Copa de vino tinto reserva especial", 150, 15000)
        );
    }
}