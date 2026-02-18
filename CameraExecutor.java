class CameraExecutor{
 public static void main(String[] args){

  System.out.println("Brand: "+Camera.getBrand());
  System.out.println("Megapixels: "+Camera.getMegaPixels());
  System.out.println("Sensor: "+Camera.getSensorType());
  System.out.println("WiFi: "+Camera.getWiFi());
  System.out.println("Bluetooth: "+Camera.getBluetooth());
  System.out.println("4K Recording: "+Camera.get4KRecording());
  System.out.println("Optical Zoom: "+Camera.getOpticalZoom()+"x");
  System.out.println("Image Stabilization: "+Camera.getImageStabilization());
  System.out.println("Lens Type: "+Camera.getLensType());
  System.out.println("ISO: "+Camera.getISO());
  System.out.println("Color: "+Camera.getColor());
  System.out.println("Price: "+Camera.getPrice());
  System.out.println("Warranty: "+Camera.getWarranty()+" Years");
  System.out.println("Touch Screen: "+Camera.getTouchScreen());
  System.out.println("Auto Focus: "+Camera.getAutoFocus());
 }
}