/*
Clase Hija Hija Terrorismo
 */
package lab4_rafaelflores;

import java.util.Date;

public class Terrorismo extends DelitoMayor{
    private String nombreArtefacto;
    private int numeroVictimas;

    public Terrorismo() {
    }

    public Terrorismo(String nombreArtefacto, int numeroVictimas, int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        super(gravedad, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.nombreArtefacto = nombreArtefacto;
        this.numeroVictimas = numeroVictimas;
    }

    public void setNombreArtefacto(String nombreArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
    }

    public void setNumeroVictimas(int numeroVictimas) {
        this.numeroVictimas = numeroVictimas;
    }

    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public int getNumeroVictimas() {
        return numeroVictimas;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20d|";
        return String.format(patron, this.getNombreArtefacto(), this.getNumeroVictimas());
    }
    
    
}
