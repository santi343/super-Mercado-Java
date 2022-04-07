/**
 * Limpieza
 */
public class Limpieza extends Producto {

  private double cantidad;

  Limpieza(String nombre, double cantidad, int precio) {
    super(nombre, precio);
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += super.toString();
    cadena += " ///  Contenido: " + (int) this.cantidad + "ml";
    cadena += " ///  Precio: $" + getPrecio();
    return cadena;
  }
}
