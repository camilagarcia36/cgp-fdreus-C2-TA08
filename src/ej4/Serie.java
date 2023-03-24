package ej4;

public class Serie {
	
 	private String titulo;
    private double numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    public Serie() {
        this.titulo = "";
        this.numTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }
    
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }
    
    public Serie(String titulo, double numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
}