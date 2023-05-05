/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.controlefinanceiro.view.enumerations;

import br.com.as.controlefinanceiro.view.ViewEntrada;
import br.com.as.controlefinanceiro.view.ViewPrincipal;
import javax.swing.JFrame;

public enum ViewEnum {
    VIEW_PRINCIPAL(1, new ViewPrincipal()),
    VIEW_ENTRADA(2, new ViewEntrada());

    private Integer codigo;
    private final JFrame frame;

    private ViewEnum(Integer codigo, JFrame frame) {
        this.codigo = codigo;
        this.frame = frame;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public JFrame getFrame() {
        return frame;
    }

}
