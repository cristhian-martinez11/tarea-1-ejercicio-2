public class App {
    public static void main(String[] args) {
 
        // Crear el objeto (llama al constructor)
        Telefono miTelefono = new Telefono("Samsung", "Galaxy S24", 800);
 
        System.out.println("--- Informacion inicial ---");
        miTelefono.mostrarInfo();
 
        // Cambiar datos usando setters
        miTelefono.setMarca("Apple");
        miTelefono.setModelo("iPhone 15");
        miTelefono.setPrecio(950);
 
        System.out.println("\n--- Despues de modificar con setters ---");
        miTelefono.mostrarInfo();
 
        // Probar la validacion: precio negativo
        System.out.println("\n--- Probando un precio negativo ---");
        miTelefono.setPrecio(-100);
 
        // Usar un getter para leer un dato
        System.out.println("\nEl precio actual es: $" + miTelefono.getPrecio());
    }
}