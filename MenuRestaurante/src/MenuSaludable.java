public class MenuSaludable implements MenuFactory {
    @Override
    public Menu crearMenu() {
        return new Menu(
            new Entrada("Crema de ahuyama", "Sopa cremosa de ahuyama con cilantro", 100, 16000),
            new PlatoPrincipal("Pechuga a la plancha", "Pechuga de pollo con quinoa y vegetales", 450, 32000),
            new Postre("Yogur con frutas", "Yogur natural con fresas y arándanos", 180, 15000),
            new Bebida("Jugo de lulo", "Jugo de lulo en agua", 33, 8000)
        );
    }
}
