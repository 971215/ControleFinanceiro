/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.controlefinanceiro.view;

import br.com.as.arquitetura.swing.singleton.DisplayManager;
import br.com.as.controlefinanceiro.view.enumerations.ViewEnum;
import java.sql.DriverManager;

/**
 *
 * @author VIBE
 */
public class ViewManagement {
        
    public static void management(ViewEnum view){   
        DisplayManager.INSTANCE.showFrame(view.getFrame());
    }
    
}
