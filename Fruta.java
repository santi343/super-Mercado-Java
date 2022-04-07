/**
 * Fruta
 */
public class Fruta extends Producto {

  Fruta(String nombre, int precio) {
    super(nombre, precio);
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += super.toString();
    cadena += " ///  Precio: $" + getPrecio();
    cadena += " ///  Unidad de venta: kilo";
    return cadena;
  }
}
