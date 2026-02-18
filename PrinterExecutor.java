class PrinterExecutor{
 public static void main(String[] args){

  System.out.println("Brand: "+Printer.getBrand());
  System.out.println("Type: "+Printer.getType());
  System.out.println("Color Print: "+Printer.getColorPrint());
  System.out.println("Duplex Print: "+Printer.getDuplexPrint());
  System.out.println("WiFi: "+Printer.getWiFi());
  System.out.println("Bluetooth: "+Printer.getBluetooth());
  System.out.println("Print Speed: "+Printer.getPrintSpeed()+" ppm");
  System.out.println("Paper Capacity: "+Printer.getPaperCapacity());
  System.out.println("Scanner: "+Printer.getScanner());
  System.out.println("Copier: "+Printer.getCopier());
  System.out.println("Color: "+Printer.getColor());
  System.out.println("Price: "+Printer.getPrice());
  System.out.println("Warranty: "+Printer.getWarranty()+" Year");
  System.out.println("Fax: "+Printer.getFax());
  System.out.println("Mobile Printing: "+Printer.getMobilePrinting());
 }
}