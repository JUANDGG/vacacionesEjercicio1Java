
package ejercicio1;

public class Productos {
        
        /*----------------------------------------ATRIBUTOS------------------------------------------------*/
        private String serialReferencia ;
        private String nombre  ;
        private Float precio;
        private String categoria ;
        
        
        /*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
        /*----------------------------------------CONSTRUCTORES------------------------------------------------*/
        public Productos( String serialReferencia ,  String nombre ,Float precio ,  String categoria) {
                this.setNumeroReferencia(serialReferencia);
                this.setNombre(nombre);
                this.setPrecio(precio);
                this.setCategoria(categoria);
        }
        
        /*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
        /*----------------------------------------METODOS SETTERS--------------------------------------------*/
        public void setNumeroReferencia(String serialReferencia) {
                this.serialReferencia = serialReferencia;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public void setPrecio(Float precio) {
                this.precio = precio;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
        
        /*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
        /*----------------------------------------METODOS GETTERS--------------------------------------------*/       

        public String getSerialReferencia() {
                return this.serialReferencia;
        }

        public String getNombre() {
                 return this.nombre;
        }

        public Float getPrecio() {
                return this.precio;
        }

      
        public String getCategoria() {
                return this.categoria;
        }
        
        
        /*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
         /*----------------------------------------METODO TO STRING()--------------------------------------------*/       
        @Override
        public String toString() {
            return 
                    "serial del producto : " + serialReferencia  + "\n"+ 
                    "nombre del producto : " + nombre + "\n" + 
                    " precio del producto :" + precio +"\n"+
                    "categoria del producto" + categoria + "\n";
        }
        
        /*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
}
