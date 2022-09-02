
/**
 *
 * @author abadie
 */
public class Main {

    public static void main(String[] args) {
        Almacen geant = new Almacen("San Martin 2343", "099123456", "Geant");
        int incrementoValor = 0;
        String[] lineaLeidaSeparada = new String[4];
        String[] lectura = ManejadorArchivosGenerico.leerArchivo("src\\altas.txt");
        for (int i = 0; i < lectura.length; i++) {
            lineaLeidaSeparada = lectura[i].split(",");
            System.out.println(lineaLeidaSeparada[1]);
            System.out.println("");
            Producto producto = new Producto(lineaLeidaSeparada[0], lineaLeidaSeparada[1], Integer.parseInt(lineaLeidaSeparada[2]), Integer.parseInt(lineaLeidaSeparada[3]));
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
