class SolarPanelExecutor{

public static void main(String[] args){

SolarPanel s=new SolarPanel("Tata",350,"Monocrystalline",20,18000,165,99,18,"Black","India",5,true);

System.out.println(s.brand);
System.out.println(s.capacity);
System.out.println(s.panelType);
System.out.println(s.efficiency);
System.out.println(s.price);
System.out.println(s.length);
System.out.println(s.width);
System.out.println(s.weight);
System.out.println(s.color);
System.out.println(s.country);
System.out.println(s.warranty);
System.out.println(s.portable);

}

}