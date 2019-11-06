/*
Clase Hija Secuestrador
 */
package lab4_rafaelflores;

public class Secuestrador extends Criminal implements Agente{
    private String nombreVictima;
    private double cantidadRescate;

    public Secuestrador() {
    }

    public Secuestrador(String nombreVictima, double cantidadRescate, String nombre, String genero, String paisResidencia, String descripcionFisica, int edad, boolean encarcelado) {
        super(nombre, genero, paisResidencia, descripcionFisica, edad, encarcelado);
        this.nombreVictima = nombreVictima;
        this.cantidadRescate = cantidadRescate;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public void setCantidadRescate(double cantidadRescate) {
        this.cantidadRescate = cantidadRescate;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public double getCantidadRescate() {
        return cantidadRescate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void Delito() {
        System.out.println("El cliente solicito un secuestro contra: " + this.getNombreVictima() + ", dando a conocer el valor del Rescate"
                + "\nupor: L." +this.getCantidadRescate()+". Resultando en el correcto aislamiento y tortura del objetivo..."
                + "\n"
                + "\nGracias por usar nuestro servicios. Atentamente, agente: "+super.getNombre()+" Secustrador");
    }
    
    
}
