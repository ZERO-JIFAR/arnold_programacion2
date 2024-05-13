package ejercicio_en_clase_30_4;

public class Prueba {
    private int codigo;
    private String titulo;
    private Atleta[] atletas;

    // Constructor
    public Prueba(int codigo, String titulo, Atleta[] atletas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.atletas = atletas;
    }

    // Getter y Setter
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Atleta[] getAtletas() { return atletas; }

    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }
}
