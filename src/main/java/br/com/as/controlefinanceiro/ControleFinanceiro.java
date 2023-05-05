/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.as.controlefinanceiro;

import br.com.as.controlefinanceiro.view.ViewManagement;
import br.com.as.controlefinanceiro.view.enumerations.ViewEnum;

public class ControleFinanceiro {

    public static void main(String[] args) {
        
       // JFrameRenderer.getInstance().render(ViewEnum.VIEW_PRINCIPAL);
        //DisplayManager.INSTANCE.showFrame(ViewEnum.VIEW_PRINCIPAL);
        ViewManagement.management(ViewEnum.VIEW_PRINCIPAL);
    }
}
