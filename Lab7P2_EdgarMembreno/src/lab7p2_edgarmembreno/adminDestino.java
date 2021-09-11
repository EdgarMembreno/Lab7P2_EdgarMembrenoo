/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_edgarmembreno;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author edgarmembreno
 */
public class adminDestino {

    private ArrayList<destino> listaDestinos = new ArrayList();
    private File archivo = null;

    public adminDestino(String path) {
        archivo = new File(path);
    }

    public ArrayList<destino> getListaDestinos() {
        return listaDestinos;
    }

    public void setListaDestinos(ArrayList<destino> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaDestinos;
    }

    public void setDestino(destino p) {
        this.listaDestinos.add(p);
    }

    public void cargarArchivo() {
        try {
            listaDestinos = new ArrayList();
            destino temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (destino) objeto.readObject()) != null) {
                        listaDestinos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (destino t : listaDestinos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
