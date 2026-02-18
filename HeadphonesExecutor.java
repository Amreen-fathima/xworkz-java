class HeadphonesExecutor{
 public static void main(String[] args){

  String brand = Headphones.getBrand();
  boolean bluetooth = Headphones.getBluetooth();
  boolean noise = Headphones.getNoiseCancellation();
  int battery = Headphones.getBatteryLife();
  String color = Headphones.getColor();
  boolean mic = Headphones.getMic();
  String type = Headphones.getType();
  double price = Headphones.getPrice();
  int warranty = Headphones.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Bluetooth: "+bluetooth);
  System.out.println("Noise Cancellation: "+noise);
  System.out.println("Battery Life: "+battery+" hours");
  System.out.println("Color: "+color);
  System.out.println("Mic: "+mic);
  System.out.println("Type: "+type);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}