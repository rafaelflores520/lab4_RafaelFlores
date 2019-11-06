/*
Clase Hija Hija Asesinato
 */
package lab4_rafaelflores;

import java.util.Date;

public class Asesinato extends DelitoMayor{
    private String nombreArma, nombreCuerpo;

    public Asesinato() {
    }

    public Asesinato(String nombreArma, String nombreCuerpo, int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        super(gravedad, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.nombreArma = nombreArma;
        this.nombreCuerpo = nombreCuerpo;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public void setNombreCuerpo(String nombreCuerpo) {
        this.nombreCuerpo = nombreCuerpo;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public String getNombreCuerpo() {
        return nombreCuerpo;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20s|";
        return String.format(patron, this.getNombreCuerpo(), this.getNombreArma());
    }
    
    
}
