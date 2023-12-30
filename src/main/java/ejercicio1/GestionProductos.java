package ejercicio1;

import java.util.ArrayList;

public class GestionProductos implements OperacionesProductos{
        private ArrayList<Productos> datosProducto  = new ArrayList<>();
        
        
        @Override
        public int buscar(String serialReferencia) {
                 for (int i = 0; i <datosProducto.size(); i++) {
                String serialReferenciaExist = datosProducto.get(i).getSerialReferencia();
                if (serialReferencia.toLowerCase().equals(serialReferenciaExist.toLowerCase())) {
                    return i;  // Devuelve la posición si encuentra la categoría
                }
            }
            return -1; // Devuelve -1 si no se encuentra la categoría
        }

        @Override
        public String listar(String serialReferencia) {
                int metodoBuscar = this.buscar(serialReferencia);
                
                if(metodoBuscar <= -1) {
                        throw new RuntimeException("no se puede listar un producto que no se encuentra  !!");
                }
                return datosProducto.get(metodoBuscar).toString();
        }

        @Override
        public void agregar(Productos p) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void modificar(String serialReferencia) {
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void eliminar(String serialReferencia) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
}
