/**
 * Test
 */
public class Test {

  public static void main(String[] args) {
    System.out.println("Super Mercado");
    Lista lista1 = new Lista();
    Gaseosa g1 = new Gaseosa("Coca-Cola Zero", 1.5, 20);
    Gaseosa g2 = new Gaseosa("Coca-Cola", 1.5, 18);
    Limpieza l1 = new Limpieza("Shampoo Sedal", 500, 19);
    Fruta f1 = new Fruta("Frutillas", 64);

    lista1.agregarUnProducto(g1);
    lista1.agregarUnProducto(g2);
    lista1.agregarUnProducto(l1);
    lista1.agregarUnProducto(f1);
    lista1.mostrarLista();
    System.out.println("=============================");
    if (lista1.tamanio() > 0) {
      System.out.println(
        "Producto más caro: " + lista1.mostrarMayorCosto().getNombre()
      );
      System.out.println(
        "Producto más barato: " + lista1.mostrarMenorCosto().getNombre()
      );
    }
  }
}
