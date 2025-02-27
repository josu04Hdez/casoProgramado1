/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlfacturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class ControlFacturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del agente de ventas: ");
        String id = JOptionPane.showInputDialog("Digite su ID: ");
        String codigoEmpleado = JOptionPane.showInputDialog("Digite su codigo de empleado: ");
        String sucursal = JOptionPane.showInputDialog("Digite la sucursal a la que pertenece: ");
        String vehiculoPropio = JOptionPane.showInputDialog("Cuenta con vehiculo propio: ");
        boolean vehiculoPropio = vehiculo.equalsIgnoreCase("sí");

        Agente agente = new Agente(nombre, id, codigoEmpleado, sucursal, vehiculoPropio);

        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas desea registrar: "));
        Facturas[] facturas = new Facturas[cantidadFacturas];

        double totalFacturas = 0;
        double totalComision = 0;
        double totalPuntos = 0;

        for (int i = 0; i < cantidadFacturas; i++) {
            string nombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
            string id = JOptionPane.showInputDialog("Digite el ID cliente: ");
            string codigoFactura = JOptionPane.showInputDialog("Digite el codigo de la factura: ");
            string montoFactura = JOptionPane.showInputDialog("Digite el monto de la factura: ");
            int mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del mes (1 - 12); "));
            boolean productosElectrico = JOptionPane.showConfirmDialog("LLeva productos Electricos? (si/no):".equalsIgnoreCase("Si"));
            boolean productosMecanico = JOptionPane.showConfirmDialog("LLeva productos Mecanicos? (si/no):".equalsIgnoreCase("Si"));
            boolean productosContruccion = JOptionPane.showConfirmDialog("LLeva productos Contrucción? (si/no):".equalsIgnoreCase("Si"));
            String estado = JOptionPane.showInputDialog("ingrese el estado de la factura (Finalizada/Sin Cobrar): ");
            facturas[] = new factruas(nombreCliente, id, cantidadFacturas, montoFactura, mes, productosElectrico, productosMecanico, productosContruccion, estado);

            totalFacturas += facturas[i].getFacturas();
            totalComision += facturas[i].getComision();
            totalPuntos += facturas[i].getPuntos();

        }

        boolean bonoExtra = (cantidadFacturas > 3 || totalFacturas > 3000000);
        if (bonoExtra) {
            totalComision += 20000;
            totalPuntos += 0;
        }
        
        String mensaje = "El Agente \"" + agente.getNombre() + "\" código Empleado: " + agente.getyCodigoEmpleado() +
                         "\nRegistro un total de: " + totalFacturas + "" +
                         "\nObtuvo un total en comisiones de $" + totalComision +
                         "\n" + (bonoExtra ? "El Agente logró el objetivo de obtener el Bono extra." : "El agente no obtuvo el bono.") +
                         "\nPuntos obtenidos por el agente: " + totalPuntos +
                         "\nvehiculoPropio: " + (vehiculoPropio ? "Sí" : "No") +
                         "\nSucursal: " + sucursal;
        
     
    }     
       
            
}
