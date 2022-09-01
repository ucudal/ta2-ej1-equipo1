
/**
 *
 * @author abadie
 */
public class Main {

    public static void main(String[] args) {
        Almacen geant = new Almacen("San Martin 2343", "099123456", "Geant");
        String[] parte = new String[4];
        String[] lectura = ManejadorArchivosGenerico.leerArchivo("src\\altas.txt");
        for (int i = 0; i < lectura.length; i++) {
            parte = lectura[i].split(",");
            Producto producto = new Producto(parte[0], parte[1], Integer.parseInt(parte[2]), Integer.parseInt(parte[3]))
            geant.insertarProducto();

        }

    }

}
