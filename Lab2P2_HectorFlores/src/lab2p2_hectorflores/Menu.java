/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab2p2_hectorflores;

import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        agregarPlan = new javax.swing.JToggleButton();
        pagarPlan = new javax.swing.JButton();
        agregarAmigo = new javax.swing.JToggleButton();
        salir = new javax.swing.JButton();
        listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menu de Planes Telefónicos");

        agregarPlan.setText("Agregar Plan");
        agregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPlanActionPerformed(evt);
            }
        });

        pagarPlan.setText("Pagar Plan");
        pagarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarPlanActionPerformed(evt);
            }
        });

        agregarAmigo.setText("Agregar Amigo");
        agregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAmigoActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(agregarPlan)
                    .addComponent(pagarPlan)
                    .addComponent(agregarAmigo)
                    .addComponent(salir)
                    .addComponent(listar))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarAmigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Tigo tigo = new Tigo();
    
    private void agregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPlanActionPerformed
        cliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:");
        
        while (cliente == null){
            cliente = JOptionPane.showInputDialog(null, "Ingrese un nombre del cliente de al menos 1 caracter:");
        }
        
        numero_s = JOptionPane.showInputDialog("Ingrese su numero (8 digitos):");

        while (verificarValidez(numero_s) == false){
            numero_s = JOptionPane.showInputDialog("Ingrese un numero de 8 digitos que solo contenga numero y no otro caracter:");
            verificarValidez(numero_s);
        }

        numero = Integer.parseInt(numero_s);

        String plan_s = JOptionPane.showInputDialog("Para que celular desea su plan?\n1. Iphone\n2. Samsung");
        
        while (verificarOpcion(plan_s) == false){
            plan_s = JOptionPane.showInputDialog("Ingrese 1 o 2");
            verificarOpcion(plan_s);
        }
        
        int plan;
        
        if (plan_s == null){
            plan = -1;
        } else {
            plan = Integer.parseInt(plan_s);
        }
        
        String tipo = "";

        if (plan == -1 || plan == 1 || plan == 2){
            switch (plan){
                case -1:
                    JOptionPane.showMessageDialog(null, "Cancelado");
                    break;
                
                case 1:
                    tipo = "iPhone";
                    extra = JOptionPane.showInputDialog("Ingrese su correo");
                    tigo.agregarPlan(numero, cliente, extra, tipo);
                    JOptionPane.showMessageDialog(null, "Se agrego " + cliente + " al plan.");
                    break;
                
                case 2:
                    tipo = "Samsung";
                    extra = JOptionPane.showInputDialog("Ingrese su pin");
                    tigo.agregarPlan(numero, cliente, extra, tipo);
                    JOptionPane.showMessageDialog(null, "Se agrego " + cliente + " al plan.");
                    break;
                    
            }
        }
        
    }//GEN-LAST:event_agregarPlanActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void pagarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarPlanActionPerformed
        numero_s = JOptionPane.showInputDialog("Ingrese el numero cuyo plan desea pagar (8 digitos):");

        while (verificarValidez(numero_s) == false){
            numero_s = JOptionPane.showInputDialog("Ingrese un numero de 8 digitos que solo contenga numero y no otro caracter:");
            verificarValidez(numero_s);
        }

        numero = Integer.parseInt(numero_s);
        
        String plan_s = JOptionPane.showInputDialog("Para que celular desea su plan?\n1. Iphone\n2. Samsung");
        
        while (verificarOpcion(plan_s) == false){
            plan_s = JOptionPane.showInputDialog("Ingrese 1 o 2");
            verificarOpcion(plan_s);
        }
        
        int plan;
        
        if (plan_s == null){
            plan = -1;
        } else {
            plan = Integer.parseInt(plan_s);
        }
        
        String tipo = "";

        if (plan == -1 || plan == 1 || plan == 2){
            switch (plan){
                case 1:
                    tipo = "iPhone";
                    extra = JOptionPane.showInputDialog("Ingrese el correo que desea buscar:");
                    break;
                
                case 2:
                    tipo = "Samsung";
                    extra = JOptionPane.showInputDialog("Ingrese el pin que desea buscar:");
                    break;
                    
            }
        }
        
        String minutos_s = JOptionPane.showInputDialog("Ingrese los minutos que desea pagar:");
        
        while (minutos_s == null || Integer.parseInt(minutos_s) <= 0){
            minutos_s = JOptionPane.showInputDialog("Ingrese una cantidad de minutos mayor a 0.");
        }
        
        int minutos = Integer.parseInt(minutos_s);
        
        String mensajes_s = JOptionPane.showInputDialog("Ingrese la cantidad de mensajes que desea pagar:");
        
        while (mensajes_s == null || Integer.parseInt(mensajes_s) <= 0){
            mensajes_s = JOptionPane.showInputDialog("Ingrese una cantidad de mensajes mayor a 0.");
        }
        
        int mensajes = Integer.parseInt(mensajes_s);
        
        if (tigo.busqueda(numero, extra, tipo)){
            JOptionPane.showMessageDialog(null, "El pago mensual para este nummero es: " + tigo.pagoPlan(numero, minutos, mensajes));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el numero cuyo plan quiere pagar.");
        }
        
        
        
    }//GEN-LAST:event_pagarPlanActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        tigo.lista();
    }//GEN-LAST:event_listarActionPerformed

    private void agregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAmigoActionPerformed
        numero_s = JOptionPane.showInputDialog("Ingrese el numero cuyo plan desea adicionar un amigo:");

        while (verificarValidez(numero_s) == false){
            numero_s = JOptionPane.showInputDialog("Ingrese un numero de 8 digitos que solo contenga numero y no otro caracter:");
            verificarValidez(numero_s);
        }

        numero = Integer.parseInt(numero_s);
        
        String pin = JOptionPane.showInputDialog("Ingrese el pin cuyo plan desea adicionar un amigo:");

        while (pin == null){
            pin = JOptionPane.showInputDialog("Ingrese un pin");
        }
        
        tigo.agregarAmigo(numero, pin);
    }//GEN-LAST:event_agregarAmigoActionPerformed

    String cliente;
    String numero_s;
    int numero;
    String extra;
    
    public boolean verificarValidez(String numero){
        boolean valid = true;
        
        if (numero_s == null || numero_s.length() != 8){
            valid = false;
        } else {
            for (int i = 0; i < 8; i++) {
                if ((int)numero_s.charAt(i) < 48 || (int)numero_s.charAt(i) > 57){
                    valid = false;
                }
            }
        }
        
        return valid;
    }
    
    public boolean verificarOpcion(String opcion){
        boolean valid = true;
        
        while (true){
            if (opcion == null || (opcion.charAt(0) + "").equals("1") || (opcion.charAt(0) + "").equals("2")){
                break;
            } else {
                valid = false;
                break;
            }
        }
        
        return valid;
    }
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton agregarAmigo;
    private javax.swing.JToggleButton agregarPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listar;
    private javax.swing.JButton pagarPlan;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
