class MobileExecutor{
 public static void main(String[] args){

  String brand = Mobile.getBrand();
  String processor = Mobile.getProcessor();
  int ram = Mobile.getRam();
  int storage = Mobile.getStorage();
  boolean fiveG = Mobile.get5G();
  boolean fingerprint = Mobile.getFingerprint();
  int camera = Mobile.getCameraMP();
  String color = Mobile.getColor();
  double price = Mobile.getPrice();
  int warranty = Mobile.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Processor: "+processor);
  System.out.println("RAM: "+ram+" GB");
  System.out.println("Storage: "+storage+" GB");
  System.out.println("5G Support: "+fiveG);
  System.out.println("Fingerprint: "+fingerprint);
  System.out.println("Camera: "+camera+" MP");
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
