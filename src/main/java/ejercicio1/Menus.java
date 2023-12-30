package ejercicio1;

import java.util.Scanner;
import ejercicio1.GestionCategorias;
import ejercicio1.Categorias;


public class Menus {
    Scanner scanner = new Scanner(System.in);
    GestionCategorias gestionCategoria = new GestionCategorias();

    /*------------------------------MENU PRINCIPAL----------------------------------*/

    public void menuPrincipal() {
        while (true) {
            System.out.println("""
                    1 - Categorias
                    2 - Productos
                    3 - Salir
                    """);
            System.out.print("Ingresa una opcion: ");
            int op = scanner.nextInt();
            scanner.nextLine(); 

            if (op == 3) {
                scanner.close();
                break;
            }

            if (op == 1) {
                this.menuCategoria();
            }
        }
    }

    /*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/

    /*------------------------------MENU CATEGORIAS----------------------------------*/

    public void menuCategoria() {
        while (true) {
            System.out.println("""
                    1 - Agregar Categoria
                    2 - Eliminar Categoria
                    3 - Salir
                    """);
            System.out.print("Ingresa una opcion : ");
            int op = scanner.nextInt();
            scanner.nextLine(); 

                if (op == 3) {
                    System.out.println("\n has salido del menu de categorias \n");
                    break;
                }

                if (op == 1) {
                        System.out.print("Ingresa el nombre de la categoria a agregar : ");
                        String categoria = scanner.nextLine();
                        try {
                                gestionCategoria.agregar(new Categorias(categoria));
                                System.out.println("\nCategoria agregada exitosamente\n");   
                        } catch (RuntimeException e) {
                                System.out.println("\n" + e.getMessage() + "\n");
                        }
                }

                if (op == 2) {
                        System.out.print("Ingresa el nombre de la categoria a eliminar : ");
                        String categoria = scanner.nextLine();
                        try {
                                gestionCategoria.eliminar(categoria);
                                System.out.println("\nCategoria eliminada exitosamente\n");
                        } catch (RuntimeException e) {
                                System.out.println("\n" + e.getMessage() + "\n");
                        }
                }
        }
    }

    /*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/

    /*------------------------------MENU PRODUCTOS----------------------------------*/
    /*
        public String menuProductos () {
            return"""
                    1 - Agregar Producto
                    2 - Modificar Producto
                    3 - Eliminar Producto
                    4 - Buscar Producto
                    5 - Listar Producto
                     """;
        } ;
    */
    /*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
}
