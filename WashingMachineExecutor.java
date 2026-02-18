class WashingMachineExecutor{
 public static void main(String[] args){

  System.out.println("Brand: "+WashingMachine.getBrand());
  System.out.println("Type: "+WashingMachine.getType());
  System.out.println("Capacity: "+WashingMachine.getCapacity()+" KG");
  System.out.println("Spin Speed: "+WashingMachine.getSpinSpeed()+" RPM");
  System.out.println("Inverter Motor: "+WashingMachine.getInverterMotor());
  System.out.println("Heater: "+WashingMachine.getHeater());
  System.out.println("Child Lock: "+WashingMachine.getChildLock());
  System.out.println("Wash Programs: "+WashingMachine.getWashPrograms());
  System.out.println("Quick Wash: "+WashingMachine.getQuickWash());
  System.out.println("Smart Control: "+WashingMachine.getSmartControl());
  System.out.println("Color: "+WashingMachine.getColor());
  System.out.println("Price: "+WashingMachine.getPrice());
  System.out.println("Warranty: "+WashingMachine.getWarranty()+" Years");
  System.out.println("Delay Start: "+WashingMachine.getDelayStart());
  System.out.println("Auto Restart: "+WashingMachine.getAutoRestart());
 }
}