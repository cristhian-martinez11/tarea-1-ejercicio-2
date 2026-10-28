public class Telefono {
 
    // ATRIBUTOS PRIVADOS: solo se pueden usar dentro de esta clase
    private String marca;
    private String modelo;
    private double precio;
 
    // CONSTRUCTOR
    public Telefono(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        setPrecio(precio); // usamos el setter para que valide el precio
    }
 
    // GETTERS
    public String getMarca() {
        return marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    // SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio no puede ser negativo.");
        }
    }
 
    
    public void mostrarInfo() {
        System.out.println("Marca: " + marca); // muestra la marca del telefono
        System.out.println("Modelo: " + modelo); //muestra el modelo del telefono
        System.out.println("Precio: $" + precio); //muestra su respectivo precio
    }
}