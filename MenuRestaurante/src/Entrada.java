public class Entrada {

    private String nombre;
    private double calorias;
    private int precio;
    private String informacion;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalorias() {
		return this.calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getInformacion() {
		return this.informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}


    public Entrada(String nombre,String informacion, double calorias, int precio) {
    
        this.nombre=nombre;
        this.calorias=calorias;
        this.precio=precio;
        this.informacion=informacion;
    }

    @Override
    public String toString() {
        return "Entrada: " + nombre + " | Calorías: " + calorias + " kcal | Precio: $" + precio + 
               "\nDescripción: " + informacion;
    }
    
}
