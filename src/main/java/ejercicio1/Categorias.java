package ejercicio1;

public class Categorias {
        /*----------------------------------------ATRIBUTOS------------------------------------------------*/
        private String  nombre ;
        
        /*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
        /*----------------------------------------CONSTRUCTORES----------------------------------------*/
        public Categorias (String nombre) {
                this.setNombre(nombre);
        }
        /*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
        /*----------------------------------------METODOS GETTERS--------------------------------------*/    
        public String getNombre() {
                return nombre;
        }
        /*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        
        /*----------------------------------------METODOS SETTERS----------------------------------------*/
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }
        /*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
}
