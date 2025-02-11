public class DestinoTuristico {
    private String nombreDestino;
    private int costoPromedio;
    private boolean esPlaya;

    
    public DestinoTuristico(String nombre, int costoParaIr) {
        nombreDestino = nombre; 
        costoPromedio = costoParaIr; 
        esPlaya = true; 
    }

    
    public String getNombreDestino() {
        return nombreDestino; 
    }

    
    public int getCostoPromedio() {
        return costoPromedio; 
    }

    
    public boolean getEsPlaya() {
        return esPlaya; 
    }

    
    public void setNombreDestino(String nuevoNombre) {
        nombreDestino = nuevoNombre; 
    }

    
    public void setCostoPromedio(int nuevoCoste) {
        costoPromedio = nuevoCoste; 
    }

    
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
    
    public void modificarCostoPromedio(int cantidad) {
        costoPromedio = costoPromedio + cantidad;
    }
}
