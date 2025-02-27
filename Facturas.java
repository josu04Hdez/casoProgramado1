/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */
public class Facturas {
    private String nombreCliente;
    private String id;
    private String codigoFactura;
    private String montoFactura;
    private boolean productosElectrico;
    private boolean productosMecanico;
    private boolean productosContruccion;
    

    public Facturas(String nombreCliente, String id, String codigoFactura, String montoFactura, boolean productosElectrico, boolean productosMecanico, boolean productosContruccion) {
        this.nombreCliente = nombreCliente;
        this.id = id;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.productosElectrico = productosElectrico;
        this.productosMecanico = productosMecanico;
        this.productosContruccion = productosContruccion;
    }
    
    public double calcularComision(){
       double montoBase = calcularMontoBase();
       double bono = 0; 
       if (productosElectrico + productosMecanico + productosContruccion ) bono  += montoFacturas * 0.10;
       if (productosElectrico >= 3) bono  += montoFacturas * 0.04;
       if (productosMecanico >= 4) bono  += montoFacturas * 0.04;
       if (productosContruccion) bono  += montoFacturas * 0.08;
       if (montoFactura < 50000) bono  += montoFacturas * 0.05;
       return monto base + bono;
   }

   public int calcularPunto(){
       int puntos = 0; 
       if (sumaProductos)puntos += 3;
       if (productosElectrico)puntos += 1;
       if (productosMecanico)puntos += 1;
       if (productosContruccion)puntos += 2;
       return puntos;
    }
    
    public double getFacturas () { return factura; }
    
}
