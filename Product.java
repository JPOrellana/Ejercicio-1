abstract class Product {
    private String name;
    private double price;
    private String type;
  
    public Product(String name, double price, String type) {
      this.name = name;
      this.price = price;
      this.type = type;
    }
  
    public String getName() {
      return name;
    }
  
    public double getPrice() {
      return price;
    }
  
    public String getType() {
      return type;
    }
  }
  
  class Fruit extends Product {
    public Fruit(String name, double price) {
      super(name, price, "Fruta");
    }
  }
  
  class Vegetable extends Product {
    public Vegetable(String name, double price) {
      super(name, price, "Verdura");
    }
  }
  