/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arsw.arepproyect.vista;

/**
 *
 * @author jgarc
 */

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import co.edu.escuelaing.arsw.arepproyect.controlador.ControlPrincipal;
import javax.swing.JFrame;

public class VistaPrincipal extends JFrame
{
    ControlPrincipal control;
    public JFileChooser jfcExaminarEntrada;
    private JButton btn_cargar_left;
    private JButton btn_cargar_right;
    private JButton btn_comparar;
    private JButton btn_exa_left;
    private JButton btn_exa_right;
    public JDesktopPane jDesktopPane1;
    public JDesktopPane jDesktopPane2;
    private JPanel pnl_left;
    private JPanel pnl_left1;
    public JTextField txt_url_left;
    public JTextField txt_url_right;
    
    public VistaPrincipal() {
        this.initComponents();
        this.jfcExaminarEntrada = new JFileChooser();
        this.control = new ControlPrincipal(this);
        this.btn_cargar_left.addActionListener(this.control);
        this.btn_cargar_right.addActionListener(this.control);
        this.btn_exa_left.addActionListener(this.control);
        this.btn_exa_right.addActionListener(this.control);
        this.btn_comparar.addActionListener(this.control);
    }
    
    private void initComponents() {
        this.pnl_left = new JPanel();
        this.txt_url_left = new JTextField();
        this.btn_exa_left = new JButton();
        this.btn_cargar_left = new JButton();
        this.jDesktopPane1 = new JDesktopPane();
        this.pnl_left1 = new JPanel();
        this.txt_url_right = new JTextField();
        this.btn_cargar_right = new JButton();
        this.btn_exa_right = new JButton();
        this.jDesktopPane2 = new JDesktopPane();
        this.btn_comparar = new JButton();
        this.setDefaultCloseOperation(3);
        this.setTitle(" -- AREP -- ");
        this.setBackground(new Color(233, 236, 236));
        this.pnl_left.setBackground(new Color(143, 207, 212));
        this.btn_exa_left.setText("Buscar Imagen 1");
        this.btn_cargar_left.setText("Cargar Imagen 1");
        final GroupLayout pnl_leftLayout = new GroupLayout(this.pnl_left);
        this.pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(pnl_leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnl_leftLayout.createSequentialGroup().addGroup(pnl_leftLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnl_leftLayout.createSequentialGroup().addContainerGap().addComponent(this.txt_url_left)).addGroup(pnl_leftLayout.createSequentialGroup().addGap(61, 61, 61).addComponent(this.btn_exa_left, -2, 186, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, 32767).addComponent(this.btn_cargar_left, -2, 185, -2))).addContainerGap()));
        pnl_leftLayout.setVerticalGroup(pnl_leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnl_leftLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.txt_url_left, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnl_leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btn_exa_left).addComponent(this.btn_cargar_left)).addContainerGap(13, 32767)));
        this.pnl_left1.setBackground(new Color(143, 207, 212));
        this.btn_cargar_right.setText("Cargar Imagen 2");
        this.btn_exa_right.setText("Buscar Imagen 2");
        final GroupLayout pnl_left1Layout = new GroupLayout(this.pnl_left1);
        this.pnl_left1.setLayout(pnl_left1Layout);
        pnl_left1Layout.setHorizontalGroup(pnl_left1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnl_left1Layout.createSequentialGroup().addContainerGap().addGroup(pnl_left1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.txt_url_right, -1, 446, 32767).addGroup(GroupLayout.Alignment.TRAILING, pnl_left1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.btn_exa_right, -2, 186, -2).addGap(18, 18, 18).addComponent(this.btn_cargar_right, -2, 185, -2))).addContainerGap()));
        pnl_left1Layout.setVerticalGroup(pnl_left1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnl_left1Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.txt_url_right, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, 32767).addGroup(pnl_left1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btn_exa_right).addComponent(this.btn_cargar_right)).addContainerGap()));
        this.btn_comparar.setText("COMPARAR IMAGENES");
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(53, 53, 53).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.btn_comparar, -2, 266, -2).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jDesktopPane1).addComponent(this.pnl_left, -2, -1, -2)).addGap(62, 62, 62).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jDesktopPane2).addComponent(this.pnl_left1, -2, -1, -2)))).addContainerGap(69, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(29, 29, 29).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.pnl_left1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jDesktopPane2, -2, 370, -2)).addGroup(layout.createSequentialGroup().addComponent(this.pnl_left, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jDesktopPane1, -2, 370, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, 32767).addComponent(this.btn_comparar).addContainerGap()));
        this.pack();
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
}
