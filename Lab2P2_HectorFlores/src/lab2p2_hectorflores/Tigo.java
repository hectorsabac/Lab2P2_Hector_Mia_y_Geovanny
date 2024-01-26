package lab2p2_hectorflores;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tigo {
   private ArrayList<Plan> planes;

    public Tigo() {
        this.planes = new ArrayList<>();
    }

    public void agregarPlan(int numeroTel, String nombre, String extra, String tipo) {
        
        if (!busqueda(numeroTel, extra, tipo)) {
            Plan nuevoPlan;
            if (tipo.equalsIgnoreCase("IPHONE")) {
                nuevoPlan = new PlanIPhone(numeroTel, nombre, extra);
            } else if (tipo.equalsIgnoreCase("SAMSUNG")) {
                nuevoPlan = new PlanIPhone(numeroTel, nombre, extra);
            } else {
                System.out.println("Tipo de plan no válido");
                return;
            }
            
            planes.add(nuevoPlan);
            System.out.println("Plan agregado exitosamente.");
        } else {
            System.out.println("El número telefónico o el dato extra ya existen.");
        }
    }

    // Función de búsqueda
    public boolean busqueda(int numeroTel, String datoExtra, String tipo) {
        for (Plan plan : planes) {
            if (plan.getNumero() == numeroTel) {
                return true; 
            }
            if (plan instanceof PlanSamsung && tipo.equals("Samsung")) {
                PlanSamsung planSamsung = (PlanSamsung) plan;
                if (planSamsung.getPin().equals(datoExtra)) {
                    return true;
                }
            }
            if (plan instanceof PlanIPhone && tipo.equalsIgnoreCase("iPhone")) {
                PlanIPhone planIPhone = (PlanIPhone) plan;
                if (planIPhone.getEmail().equals(datoExtra)) {
                    return true; 
                }
            }
        }
        return false; 
    }

    
    public double pagoPlan(int numeroTel, int mins, int msgs) {
        for (Plan plan : planes) {
            if (plan.getNumero() == numeroTel) {
                return plan.pagoMensual(mins, msgs); 
            }
        }
        return -1; 
    }

   
    public void agregarAmigo(int numeroTel, String pin) {
        for (Plan plan : planes) {
            if (plan.getNumero() == numeroTel && plan instanceof PlanSamsung) {
                PlanSamsung planSamsung = (PlanSamsung) plan;
                planSamsung.agregarPinAmigo(pin); 
                JOptionPane.showMessageDialog(null, plan);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un plan Samsung con ese número telefónico.");
        System.out.println("No se encontró un plan Samsung con ese número telefónico.");
    }

    
    public void lista() {
        int contadorSamsung = 0;
        int contadorIPhone = 0;
        
        System.out.println(planes.size());

        for (Plan plan : planes) {
            plan.imprimir(plan.getNumero(), plan.getCliente());

            if (plan instanceof PlanSamsung) {
                contadorSamsung++;
            } else if (plan instanceof PlanIPhone) {
                contadorIPhone++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Total de planes Samsung: " + contadorSamsung + "\nTotal de planes iPhone: " + contadorIPhone);
    } 
}
