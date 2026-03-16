class Printer3DExecutor{

public static void main(String[] args){

Printer3D p=new Printer3D("Creality","Ender5",220,300,7.5,"Metal",25000,"PLA","Black",true,"China",2);

System.out.println(p.brand);
System.out.println(p.model);
System.out.println(p.buildVolume);
System.out.println(p.power);
System.out.println(p.weight);
System.out.println(p.material);
System.out.println(p.price);
System.out.println(p.filamentType);
System.out.println(p.color);
System.out.println(p.wifiEnabled);
System.out.println(p.country);
System.out.println(p.warranty);

}

}