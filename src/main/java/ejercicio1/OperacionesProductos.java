
package ejercicio1;


public interface OperacionesProductos {
        int buscar(String serialReferencia );
        String listar(String serialReferencia);
        void agregar(Productos p ) ;
        void modificar(String serialReferencia) ;
        void eliminar(String serialReferencia);
}
