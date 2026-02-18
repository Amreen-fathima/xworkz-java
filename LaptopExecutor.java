class LaptopExecutor{
 public static void main(String[] args){

  String brand = Laptop.getBrand();
  String processor = Laptop.getProcessor();
  int ram = Laptop.getRam();
  int storage = Laptop.getStorage();
  boolean ssd = Laptop.getSSD();
  String color = Laptop.getColor();
  boolean fingerprint = Laptop.getFingerprint();
  String graphics = Laptop.getGraphics();
  double price = Laptop.getPrice();
  int warranty = Laptop.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Processor: "+processor);
  System.out.println("RAM: "+ram+" GB");
  System.out.println("Storage: "+storage+" GB");
  System.out.println("SSD: "+ssd);
  System.out.println("Color: "+color);
  System.out.println("Fingerprint: "+fingerprint);
  System.out.println("Graphics: "+graphics);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
