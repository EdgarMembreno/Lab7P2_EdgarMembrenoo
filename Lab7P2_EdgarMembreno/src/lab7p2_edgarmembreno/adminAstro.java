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
public class adminAstro {

    private ArrayList<astronautas> listaAstro = new ArrayList();
    private File archivo = null;

    public adminAstro(String path) {
        archivo = new File(path);
    }

    public ArrayList<astronautas> getListaAstro() {
        return listaAstro;
    }

    public void setListaAstro(ArrayList<astronautas> listaAstro) {
        this.listaAstro = listaAstro;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaAstro;
    }

    public void setAstro(astronautas p) {
        this.listaAstro.add(p);
    }

    public void cargarArchivo() {
        try {
            listaAstro = new ArrayList();
            astronautas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (astronautas) objeto.readObject()) != null) {
                        listaAstro.add(temp);
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
            for (astronautas t : listaAstro) {
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
