class BluetoothSpeakerExecutor{
 public static void main(String[] args){

  String brand = BluetoothSpeaker.getBrand();
  int battery = BluetoothSpeaker.getBatteryLife();
  boolean water = BluetoothSpeaker.getWaterResistant();
  boolean bluetooth = BluetoothSpeaker.getBluetooth();
  String color = BluetoothSpeaker.getColor();
  int watt = BluetoothSpeaker.getWattOutput();
  double price = BluetoothSpeaker.getPrice();
  int warranty = BluetoothSpeaker.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Battery Life: "+battery+" hours");
  System.out.println("Water Resistant: "+water);
  System.out.println("Bluetooth: "+bluetooth);
  System.out.println("Color: "+color);
  System.out.println("Output: "+watt+"W");
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}