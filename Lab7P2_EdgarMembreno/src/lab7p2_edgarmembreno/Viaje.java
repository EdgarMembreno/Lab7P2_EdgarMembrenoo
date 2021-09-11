/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_edgarmembreno;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author edgarmembreno
 */
public class Viaje extends Thread {

    private JProgressBar progBar;
    private naves nave;
    private int po;
    private boolean avanzar;
    private boolean vive;

    public Viaje(JProgressBar progBar, naves nave, int po, boolean avanzar, boolean vive) {
        this.progBar = progBar;
        this.nave = nave;
        this.po = po;
        this.avanzar = avanzar;
        this.vive = vive;
    }

    Viaje(JProgressBar progress_Distancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public void setNave(naves nave) {
        this.nave = nave;
    }

    public void setPo(int po) {
        this.po = po;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        adminNaves ad = new adminNaves("./Naves.cbm");
        ad.cargarArchivo();
        while (vive) {
            if (avanzar) {

                int velocidad = ad.getListaNaves().get(po).getVelocidad();
                int distancia = ad.getListaNaves().get(po).getDestino().get(po).getDistancia();
                int litros = ad.getListaNaves().get(po).getCombustible();

                progBar.setValue(Math.round(velocidad * (velocidad / 60)));

                int gasolina = litros - progBar.getValue();

                if (gasolina == 0) {
                    JOptionPane.showMessageDialog(null, "Desea seguir e; viaje");

                }

                progBar.setString(Integer.toString(progBar.getValue()) + "KM");

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }

        }
    }
}
