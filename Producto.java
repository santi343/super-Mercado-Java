/**
 * Producto
 */
public class Producto implements Comparable<Producto> {

  private String nombre;
  private int precio;

  Producto(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getPrecio() {
    return this.precio;
  }

  @Override
  public int compareTo(Producto unProducto) {
    return getPrecio() > unProducto.getPrecio()
      ? 1
      : getPrecio() < unProducto.getPrecio() ? -1 : 0;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += "Nombre: " + this.nombre;
    return cadena;
  }
}
