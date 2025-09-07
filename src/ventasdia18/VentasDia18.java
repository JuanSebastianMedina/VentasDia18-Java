/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventasdia18;
/**
 * @author juanse
 * Fecha creación: domingo 07 de septiembre de 2025
 * Requerimientos: Lee los valores de las ventas de una tienda hasta que se ingrese -1. 
 * Con while, calcula: cantidad de ventas,total vendido, venta mayor y menor.
 */
import javax.swing.JOptionPane;
public class VentasDia18 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO
        int valor = 0;
        int cantidadVentas = -1;
        int totalVendido = 1;
        int ventaMayor = valor;
        int ventaMenor = valor;
        while (valor != -1) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la venta"));
            cantidadVentas ++;
            totalVendido = totalVendido + valor;
            if (valor>ventaMayor){
                ventaMayor=valor;
            }
            if (valor < ventaMenor && valor != -1) {
                ventaMenor=valor;
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de ventas: " + cantidadVentas + "\n Total ventas: " + totalVendido + "\n Venta mayor: " + ventaMayor + "\n Venta menor: " + ventaMenor);
    }
}
