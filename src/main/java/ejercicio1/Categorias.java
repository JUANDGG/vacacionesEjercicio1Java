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
                String regex = "^[a-zA-Z]+$";
                if(!nombre.matches(regex)){
                        throw new RuntimeException("no se puedo agregar un nombre de categoria que tenga numeros !!");
                }
                this.nombre = nombre;
        }
        /*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
}