package CamionetaPOOURU;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsoCamioneta {

    public static void main(String[] args) {
       
        Camioneta laCamioneta = new Camioneta();
       
        laCamioneta.estableceColor(JOptionPane.showInputDialog("Introduce Color"));
        
        System.out.println(laCamioneta.dameCaracteristicasGenerales());
        
        System.out.println(laCamioneta.DimeColor());

        laCamioneta.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
       
        System.out.println(laCamioneta.dimeAsientos());
       
        laCamioneta.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
       
        System.out.println(laCamioneta.dimeClimatizador());
        
        laCamioneta.TipoDeTraccion(JOptionPane.showInputDialog("Es Automatico?"));

        System.out.println(laCamioneta.dimeTipoDeTraccion());
       
        System.out.println(laCamioneta.PesoCamioneta());
       
        System.out.println("El precio final es: " +laCamioneta.precioCamioneta());
       
    }
}
