/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arsw.arepproyect.controlador;

/**
 *
 * @author jgarc
 */

import java.awt.image.BufferedImage;
import javax.swing.border.Border;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import co.edu.escuelaing.arsw.arepproyect.vista.VistaPrincipal;
import java.awt.event.ActionListener;

public class ControlPrincipal implements ActionListener
{
    VistaPrincipal vista;
    File fileImagen;
    String imagen1;
    String imagen2;
    
    public ControlPrincipal(final VistaPrincipal v) {
        this.vista = v;
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getActionCommand().equals("Buscar Imagen 1")) {
            final int showOpenDialog;
            final int returnVal = showOpenDialog = this.vista.jfcExaminarEntrada.showOpenDialog(this.vista);
            final JFileChooser jfcExaminarEntrada = this.vista.jfcExaminarEntrada;
            if (showOpenDialog == 0) {
                this.fileImagen = this.vista.jfcExaminarEntrada.getSelectedFile();
                this.vista.txt_url_left.setText(this.fileImagen.toString());
                this.imagen1 = this.fileImagen.toString();
            }
        }
        if (e.getActionCommand().equals("Cargar Imagen 1") && this.fileImagen != null) {
            this.cargarImagen(this.vista.jDesktopPane1, this.fileImagen);
        }
        if (e.getActionCommand().equals("Buscar Imagen 2")) {
            final int showOpenDialog2;
            final int returnVal = showOpenDialog2 = this.vista.jfcExaminarEntrada.showOpenDialog(this.vista);
            final JFileChooser jfcExaminarEntrada2 = this.vista.jfcExaminarEntrada;
            if (showOpenDialog2 == 0) {
                this.fileImagen = this.vista.jfcExaminarEntrada.getSelectedFile();
                this.vista.txt_url_right.setText(this.fileImagen.toString());
                this.imagen2 = this.fileImagen.toString();
            }
        }
        if (e.getActionCommand().equals("Cargar Imagen 2") && this.fileImagen != null) {
            this.cargarImagen(this.vista.jDesktopPane2, this.fileImagen);
        }
        
        if (e.getActionCommand().equals("COMPARAR IMAGENES")) {
            try {
                boolean found = false;
                final FileReader fr1 = new FileReader(this.getImagen1());
                final FileReader fr2 = new FileReader(this.getImagen2());
                int valorParcial = 0 , valorTotal = 0; 
                while (true) {
                    final int pix1 = fr1.read();
                    final int pix2 = fr2.read();
                    if (pix1 == pix2) {
                        valorParcial ++;  
                    }
                    valorTotal ++; 
                    if (pix1 == -1) {
                        break;
                    }
                    System.out.println(" - "); 
                    System.out.println(fr1.read());
                    System.out.println(fr2.read());
                    
                }
                System.out.println(valorParcial);
                System.out.println(valorTotal);
                
                String message = "El procentaje de simulitud es de = "  + ((valorParcial/valorTotal) * 100 ) + "%"; 
                JOptionPane.showMessageDialog(this.vista, message);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public String getImagen1() {
        return this.imagen1;
    }
    
    public String getImagen2() {
        return this.imagen2;
    }
    
    public void cargarImagen(final JDesktopPane jDeskp, final File fileImagen) {
        try {
            final BufferedImage image = ImageIO.read(fileImagen);
            jDeskp.setBorder(new PintaImagen(image));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(jDeskp, "no se pudo cargar la imagen");
        }
    }
}
