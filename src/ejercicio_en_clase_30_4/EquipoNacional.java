package ejercicio_en_clase_30_4;

public class EquipoNacional {
    private String color;
    private String pais;
    private Atleta[] atletas;

    // Constructor
    public EquipoNacional(String color, String pais, Atleta[] atletas) {
        this.color = color;
        this.pais = pais;
        this.atletas = atletas;
    }

    // Getter y Setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Atleta[] getAtletas() {
        return atletas;
    }
    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }

    // Metodo para obtener la altura de todos los atletas del equipo
    public double[] obtenerAlturas() {
        double[] alturas = new double[atletas.length];
        for (int i = 0; i < atletas.length; i++) {
            alturas[i] = atletas[i].getAltura();
        }
        return alturas;
    }

    // Metodo para obtener el peso extra de cada atleta del equipo
    public boolean[] obtenerPesosExtra() {
        boolean[] pesosExtra = new boolean[atletas.length];
        for (int i = 0; i < atletas.length; i++) {
            pesosExtra[i] = atletas[i].hayPesoExtra(25.0);
        }
        return pesosExtra;
    }
}
