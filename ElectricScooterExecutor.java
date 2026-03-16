class ElectricScooterExecutor{

public static void main(String[] args){

ElectricScooter e=new ElectricScooter("Segway","Ninebot",36,25,12,60000,"Red",true,"HubMotor","China",2,true);

System.out.println(e.brand);
System.out.println(e.model);
System.out.println(e.batteryCapacity);
System.out.println(e.maxSpeed);
System.out.println(e.weight);
System.out.println(e.price);
System.out.println(e.color);
System.out.println(e.bluetooth);
System.out.println(e.motorType);
System.out.println(e.country);
System.out.println(e.warranty);
System.out.println(e.foldable);

}

}