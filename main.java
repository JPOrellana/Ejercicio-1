public class main{
    public static void main(String[] args) {
        Product apple = ProductFactory.createProduct("Manzana", 0.99, "Fruta");
        Product carrot = ProductFactory.createProduct("Zanahoria", 0.49, "Verdura");
      
        System.out.println("Nombre: " + apple.getName() + ", Precio: " + apple.getPrice() + ", Tipo: " + apple.getType());
        System.out.println("Nombre: " + carrot.getName() + ", Precio: " + carrot.getPrice() + ", Tipo: " + carrot.getType());
      }
}

  