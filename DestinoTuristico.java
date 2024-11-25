public class DestinoTuristico {
    private String nombreDestino;
    private int costoPromedio;
    private boolean esPlaya;

    // Constructor
    public DestinoTuristico(String nombre, int costoParaIr) {
        nombreDestino = nombre; 
        costoPromedio = costoParaIr; 
        esPlaya = true; 
    }

    // Getter para nombreDestino
    public String getNombreDestino() {
        return nombreDestino; 
    }

    // Getter para costoPromedio
    public int getCostoPromedio() {
        return costoPromedio; 
    }

    // Getter para esPlaya
    public boolean getEsPlaya() {
        return esPlaya; 
    }

    // Setter para nombreDestino
    public void setNombreDestino(String nuevoNombre) {
        nombreDestino = nuevoNombre; 
    }

    // Setter para costoPromedio
    public void setCostoPromedio(int nuevoCoste) {
        costoPromedio = nuevoCoste; 
    }

    // Método para alternar el valor de esPlaya
    public void alternarPlaya() {
        if (esPlaya == false) {
            esPlaya = true;
        } else {
            esPlaya = false;
        }
    }
    
    public void imprimirEstado() {
        System.out.println("Nombre del destino turístico: " + nombreDestino + " | " + "Coste para ir a destino turístico: " 
        + costoPromedio + "€" + " | " + "Destino de playa " + (esPlaya ? "Sí" : "No"));
    }
    
    public String obtenerEstado() {
    return "Nombre del destino turístico: " + nombreDestino + " |" + "Coste para ir a destino turístico: " 
        + costoPromedio + "€" + " |" + "Destino de playa " + (esPlaya ? "Sí" : "No");
}
}
