class SmartMirrorExecutor{

public static void main(String[] args){

SmartMirror s=new SmartMirror("GlamTech",120,60,4,18000,"LCD",true,"Black",12,"WiFi","USA",2);

System.out.println(s.brand);
System.out.println(s.height);
System.out.println(s.width);
System.out.println(s.depth);
System.out.println(s.price);
System.out.println(s.displayType);
System.out.println(s.touchEnabled);
System.out.println(s.color);
System.out.println(s.weight);
System.out.println(s.connectivity);
System.out.println(s.country);
System.out.println(s.warranty);

}

}