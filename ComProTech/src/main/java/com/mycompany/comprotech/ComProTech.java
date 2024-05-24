/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comprotech;

import com.mycompany.comprotech.telas.ViewLogin;

/**
 *
 * @author lucas
 */
public class ComProTech {

    public static void main(String[] args) {
        
        // Código para definir o look and feel padrão (opcional)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Crie e exiba a tela
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });                
    }
}
