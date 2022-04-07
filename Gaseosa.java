/**
 * Gaseosa
 */
public class Gaseosa extends Producto {

  private double cantidad;

  Gaseosa(String nombre, double cantidad, int precio) {
    super(nombre, precio);
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += super.toString();
    cadena += " ///  Litros: " + this.cantidad;
    cadena += " ///  Precio: $" + getPrecio();
    return cadena;
  }
}
