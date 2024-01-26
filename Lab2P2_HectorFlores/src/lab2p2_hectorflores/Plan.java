package lab2p2_hectorflores;

import javax.swing.JOptionPane;

public abstract class Plan {
    int numero;
    String cliente;

    public Plan(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public abstract double pagoMensual(int mins, int msgs);
    
    public void imprimir (int numero, String cliente){
        JOptionPane.showMessageDialog(null, "Numero: " + numero + "\nCliente: " + cliente);
    }
}
