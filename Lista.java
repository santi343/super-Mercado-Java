import java.util.ArrayList;

/**
 * Lista
 */
public class Lista {

  ArrayList<Producto> lista = new ArrayList<Producto>();

  public void agregarUnProducto(Producto unProducto) {
    lista.add(unProducto);
  }

  public int tamanio() {
    return this.lista.size();
  }

  public void mostrarLista() {
    for (Producto producto : lista) {
      System.out.println(producto);
    }
  }

  public Producto mostrarMayorCosto() {
    Producto aux = lista.get(0);
    for (int i = 1; i < this.lista.size(); i++) {
      if (this.lista.get(i).compareTo(this.lista.get(i - 1)) == 1) {
        aux = lista.get(i);
      }
    }

    return aux;
  }

  public Producto mostrarMenorCosto() {
    Producto aux = lista.get(0);
    for (int i = 1; i < this.lista.size(); i++) {
      if (this.lista.get(i).compareTo(this.lista.get(i - 1)) == -1) {
        aux = lista.get(i);
      }
    }

    return aux;
  }
}
