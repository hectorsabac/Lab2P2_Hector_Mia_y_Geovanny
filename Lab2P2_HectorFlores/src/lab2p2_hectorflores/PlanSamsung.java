package lab2p2_hectorflores;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlanSamsung extends Plan {

    private String pin;
    private ArrayList<String> bbm;

    public PlanSamsung(int numero, String cliente, String pin) {
        super(numero, cliente);
        this.pin = pin;
        this.bbm = new ArrayList<>();
    }

    public String getPin() {
        return pin;
    }

    @Override
    public double pagoMensual(int mins, int msgs) {
        double cobraPlan = 40.0;
        int minsGratis = 200;
        int mensGratis = 300;
        
//        double mensajesAdicionales = (msgs - mensGratis) * 0.2;
//        double minutosAdicionales = (mins - minsGratis) * 0.8;

//        double minutosAdicionales = Math.max(0, mins - minsGratis);
//        double mensajesAdicionales = Math.max(0, msgs - mensGratis);

        double costoMinutoAdicional = (msgs - mensGratis) * 0.2;
        double mensajeAdicional = (mins - minsGratis) * 0.8;

        return cobraPlan + costoMinutoAdicional + mensajeAdicional;
    }

    @Override
    public void imprimir(int mins, String cliente) {
        Menu menu = new Menu();
        Plan plan = new PlanSamsung(menu.numero, menu.cliente, menu.extra);
        plan.imprimir(mins, cliente);
        
        JOptionPane.showMessageDialog(null, "Su pin es: " + menu.extra);
    }

    public void agregarPinAmigo(String pin) {
        if (!bbm.contains(pin)) {
            bbm.add(pin);
        }
    }
}