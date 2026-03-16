class DigitalMicroscopeExecutor{

public static void main(String[] args){

DigitalMicroscope d=new DigitalMicroscope("AmScope","M150C-I",100,1.5,8000,"Black",true,"Metal","China",2,true,"Manual");

System.out.println(d.brand);
System.out.println(d.model);
System.out.println(d.magnification);
System.out.println(d.weight);
System.out.println(d.price);
System.out.println(d.color);
System.out.println(d.ledIllumination);
System.out.println(d.material);
System.out.println(d.country);
System.out.println(d.warranty);
System.out.println(d.usbConnectivity);
System.out.println(d.focusType);

}

}