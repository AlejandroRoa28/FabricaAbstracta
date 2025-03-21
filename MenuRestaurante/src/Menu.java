public class Menu {
   
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Postre postre;
    private Bebida bebida;

    public double getPrecioTotal() {
        return entrada.getPrecio() + platoPrincipal.getPrecio() + postre.getPrecio() + bebida.getPrecio();
    }
	public Entrada getEntrada() {
		return this.entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public PlatoPrincipal getPlatoPrincipal() {
		return this.platoPrincipal;
	}

	public void setPlatoPrincipal(PlatoPrincipal platoPrincipal) {
		this.platoPrincipal = platoPrincipal;
	}

	public Postre getPostre() {
		return this.postre;
	}

	public void setPostre(Postre postre) {
		this.postre = postre;
	}

	public Bebida getBebidas() {
		return this.bebida;
	}

	public void setBebidas(Bebida bebidas) {
		this.bebida = bebidas;
	}


    public Menu(Entrada entrada, PlatoPrincipal platoPrincipal, Postre postre, Bebida bebida) {
        this.entrada = entrada;
        this.platoPrincipal = platoPrincipal;
        this.postre = postre;
        this.bebida = bebida;
    }

    @Override
    public String toString() {
        return entrada + "\n\n" + platoPrincipal + "\n\n" + postre + "\n\n" + bebida;
    }
}
