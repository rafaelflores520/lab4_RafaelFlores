/*
Clase Hija Asesino
 */
package lab4_rafaelflores;

public class Asesino extends Criminal implements Agente{
    private String nombreVictima, arma;

    public Asesino() {
    }

    public Asesino(String nombreVictima, String arma, String nombre, String genero, String paisResidencia, String descripcionFisica, int edad, boolean encarcelado) {
        super(nombre, genero, paisResidencia, descripcionFisica, edad, encarcelado);
        this.nombreVictima = nombreVictima;
        this.arma = arma;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20s|";
        return String.format(patron, this.getNombreVictima(), this.getArma());
    }
    
    @Override
    public void Delito() {
        System.out.println("El cliente solicito un asesinato contra: " + this.getNombreVictima() + ", especificamente utilizando"
                + "\nun arma de tipo: " +this.getArma()+". Resultando en la eliminacion del objetivo..."
                + "\n"
                + "\nGracias por usar nuestro servicios. Atentamente, agente: "+super.getNombre()+" Asesino");
    }
}
