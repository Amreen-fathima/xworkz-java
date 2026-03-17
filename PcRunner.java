class PcRunner {

    public static void main(String[] args) {

        Hardware h1 = new Hardware(1,"Processor","Intel");
        Pc p1 = new Pc(101,"Dell",h1);

        Hardware h2 = new Hardware(2,"RAM","Corsair");
        Pc p2 = new Pc(102,"HP",h2);

        Hardware h3 = new Hardware(3,"Motherboard","Asus");
        Pc p3 = new Pc(103,"Lenovo",h3);

        Hardware h4 = new Hardware(4,"SSD","Samsung");
        Pc p4 = new Pc(104,"Acer",h4);

        Hardware h5 = new Hardware(5,"GraphicsCard","Nvidia");
        Pc p5 = new Pc(105,"MSI",h5);

        Hardware h6 = new Hardware(6,"PowerSupply","CoolerMaster");
        Pc p6 = new Pc(106,"Asus",h6);

        Hardware h7 = new Hardware(7,"Cabinet","Zebronics");
        Pc p7 = new Pc(107,"Dell",h7);

        Hardware h8 = new Hardware(8,"Keyboard","Logitech");
        Pc p8 = new Pc(108,"HP",h8);

        Hardware h9 = new Hardware(9,"Mouse","HP");
        Pc p9 = new Pc(109,"Lenovo",h9);

        Hardware h10 = new Hardware(10,"Monitor","LG");
        Pc p10 = new Pc(110,"Acer",h10);

        Hardware h11 = new Hardware(11,"Processor","AMD");
        Pc p11 = new Pc(111,"Dell",h11);

        Hardware h12 = new Hardware(12,"RAM","Kingston");
        Pc p12 = new Pc(112,"HP",h12);

        Hardware h13 = new Hardware(13,"Motherboard","Gigabyte");
        Pc p13 = new Pc(113,"Lenovo",h13);

        Hardware h14 = new Hardware(14,"SSD","WD");
        Pc p14 = new Pc(114,"Acer",h14);

        Hardware h15 = new Hardware(15,"GraphicsCard","AMD");
        Pc p15 = new Pc(115,"MSI",h15);

        Hardware h16 = new Hardware(16,"PowerSupply","Antec");
        Pc p16 = new Pc(116,"Asus",h16);

        Hardware h17 = new Hardware(17,"Cabinet","AntEsports");
        Pc p17 = new Pc(117,"Dell",h17);

        Hardware h18 = new Hardware(18,"Keyboard","Dell");
        Pc p18 = new Pc(118,"HP",h18);

        Hardware h19 = new Hardware(19,"Mouse","Logitech");
        Pc p19 = new Pc(119,"Lenovo",h19);

        Hardware h20 = new Hardware(20,"Monitor","Samsung");
        Pc p20 = new Pc(120,"Acer",h20);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
        p5.displayDetails();
        p6.displayDetails();
        p7.displayDetails();
        p8.displayDetails();
        p9.displayDetails();
        p10.displayDetails();
        p11.displayDetails();
        p12.displayDetails();
        p13.displayDetails();
        p14.displayDetails();
        p15.displayDetails();
        p16.displayDetails();
        p17.displayDetails();
        p18.displayDetails();
        p19.displayDetails();
        p20.displayDetails();

    }
}