public class MenuVegetariano implements MenuFactory {
    @Override
    public Menu crearMenu() {
        return new Menu(
            new Entrada("Ensalada fresca", "Ensalada con lechuga,tomate y burrata", 150, 18000),
            new PlatoPrincipal("Risotto de champiñones", "Arroz cremoso con champiñones salteados", 550, 35000),
            new Postre("Mousse de mango", "Postre de mango con yogur", 200, 15000),
            new Bebida("Té verde", "Té antioxidante sin azúcar", 5, 8000)
        );
    }
}