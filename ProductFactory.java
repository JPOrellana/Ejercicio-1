class ProductFactory {
    public static Product createProduct(String name, double price, String type) {
      if (type.equals("Fruta")) {
        return new Fruit(name, price);
      } else if (type.equals("Verdura")) {
        return new Vegetable(name, price);
      }
      return null;
    }
  }
  