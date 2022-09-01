
/**
 *
 * @author abadie
 */
public class Main {

    public static void main(String[] args) {
        Almacen geant = new Almacen("San Martin 2343", "099123456", "Geant");
        int incrementoValor = 0;
        String[] parte = new String[4];
        String[] lectura = ManejadorArchivosGenerico.leerArchivo("src\\altas.txt");
        for (int i = 0; i < lectura.length; i++) {
            parte = lectura[i].split(",");
            Comparable a = parte[0];
            System.out.println(parte[1]);
            System.out.println("");
            Producto producto = new Producto(a, parte[1], Integer.parseInt(parte[2]), Integer.parseInt(parte[3]));
            incrementoValor += (producto.getPrecio()*producto.getStock());
            geant.insertarProducto(producto);

        }
        Nodo<Producto> nodoActual = geant.getListaProductos().primero;
        while (nodoActual.getSiguiente() != null) {
            System.out.println(nodoActual.getDato().getNombre());
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println("El valor total de los objetos añadidos es "+ incrementoValor);

    }

}
