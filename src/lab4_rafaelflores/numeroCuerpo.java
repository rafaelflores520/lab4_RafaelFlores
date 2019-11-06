/*
Clase Hija Hija Asesinato
 */
package lab4_rafaelflores;



public class numeroCuerpo extends DelitoMayor{
    private String nombreArma;
    private int numeroCuerpo;

    public numeroCuerpo() {
    }

    public numeroCuerpo(String nombreArma, int numeroCuerpo, int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, String fecha) {
        super(gravedad, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.nombreArma = nombreArma;
        this.numeroCuerpo = numeroCuerpo;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public void setNombreCuerpo(int nombreCuerpo) {
        this.numeroCuerpo = nombreCuerpo;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public int getNombreCuerpo() {
        return numeroCuerpo;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20s|";
        return String.format(patron, this.getNombreCuerpo(), this.getNombreArma());
    }
    
    
}
