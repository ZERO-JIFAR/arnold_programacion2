package ejercicio_en_clase_30_4;

public class Sede {
    private int fase;
    private String fecha;
    private String hora;
    private Prueba prubas;
    private Instalacion instalaciones;

    // Constructor
    public Sede(int fase, String fecha, String hora,Prueba prubas, Instalacion instalaciones) {
        this.fase = fase;
        this.fecha = fecha;
        this.hora = hora;
        this.prubas = prubas;
        this.instalaciones = instalaciones;
    }


    // Getter y Setter
    public int getFase() {
        return fase;
    }
    public void setFase(int fase) {
        this.fase = fase;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public Prueba getPrubas() {
        return prubas;
    }

    public void setPrubas(Prueba prubas) {
        this.prubas = prubas;
    }

    public Instalacion getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(Instalacion instalaciones) {
        this.instalaciones = instalaciones;
    }
}
