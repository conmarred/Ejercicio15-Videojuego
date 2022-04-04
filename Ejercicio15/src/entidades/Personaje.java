package entidades;

public abstract class Personaje {
	public String nombre;
	public Arma arma;
	public Integer puntosVida;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Integer getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}
	public Personaje(String nombre, Arma arma, Integer puntosVida) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.puntosVida = puntosVida;
	}
	public Personaje() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma + ", puntosVida=" + puntosVida + "]";
	}
	
	
	public abstract void atacar(Arma arma, Personaje personaje);
	
}
