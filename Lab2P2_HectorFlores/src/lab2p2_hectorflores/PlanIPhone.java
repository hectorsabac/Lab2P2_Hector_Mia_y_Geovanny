package lab2p2_hectorflores;

import javax.swing.JOptionPane;

public class PlanIPhone extends Plan{
    
    String email;

    public String getEmail() {
        return email;
    }
    
    public PlanIPhone (int numero, String cliente, String mail){
        super(numero, cliente);
        this.email = mail;
    }
    
    @Override
    public double pagoMensual(int minutos, int mensajitos){
        double cobro = 22 + 0.4 * minutos + 0.1 * mensajitos;
        
        return cobro;
    }
    
    @Override
    public void imprimir(int numero, String cliente){
        Menu menu = new Menu();
        Plan plan = new PlanIPhone(menu.numero, menu.cliente, menu.extra);
        plan.imprimir(numero, cliente);
        
        JOptionPane.showMessageDialog(null, "Su correo de iTunes es: " + menu.extra);
    }
}
