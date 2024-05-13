package ejercicio_en_clase_30_4;

public class Instalacion {
    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;

    // Constructor
    public Instalacion(String categoria, String localizacion, String nombre, String tipo) {
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getter y Setter
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getLocalizacion() { return localizacion; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    // Metodo para obtener el nombre del tercer atleta de la segunda prueba
    public String obtenerNombreTercerAtleta(Prueba prueba) {
        Atleta[] atletas = prueba.getAtletas();
        if (atletas.length >= 3) {
            return atletas[2].nombre;
        } else {
            return "No hay suficientes atletas en la prueba.";
        }
    }

    // Metodo para obtener el codigo de la segunda prueba
    public int obtenerCodigoSegundaPrueba(Prueba prueba) {
        return prueba.getCodigo();
    }
}
