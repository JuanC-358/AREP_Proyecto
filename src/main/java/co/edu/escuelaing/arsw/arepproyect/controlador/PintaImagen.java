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

import java.awt.Insets;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.image.BufferedImage;
import javax.swing.border.Border;

public class PintaImagen implements Border
{
    private BufferedImage image;
    
    public PintaImagen(final BufferedImage image) {
        this.image = image;
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        final int x2 = x + (width - this.image.getWidth()) / 2;
        final int y2 = y + (height - this.image.getHeight()) / 2;
        g.drawImage(this.image, x2, y2, null);
    }
    
    @Override
    public Insets getBorderInsets(final Component c) {
        return new Insets(0, 0, 0, 0);
    }
    
    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
