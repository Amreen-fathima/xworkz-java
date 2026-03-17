class FactoryRunner {

    public static void main(String[] args) {

        Machine m1 = new Machine(1,"Lathe","Cutting");
        Factory f1 = new Factory(101,"TataFactory",m1);

        Machine m2 = new Machine(2,"Drill","Drilling");
        Factory f2 = new Factory(102,"BirlaFactory",m2);

        Machine m3 = new Machine(3,"Milling","Shaping");
        Factory f3 = new Factory(103,"RelianceFactory",m3);

        Machine m4 = new Machine(4,"CNC","Automatic");
        Factory f4 = new Factory(104,"MahindraFactory",m4);

        Machine m5 = new Machine(5,"Press","Pressing");
        Factory f5 = new Factory(105,"L&TFactory",m5);

        Machine m6 = new Machine(6,"Grinding","Finishing");
        Factory f6 = new Factory(106,"AdaniFactory",m6);

        Machine m7 = new Machine(7,"Lathe","Cutting");
        Factory f7 = new Factory(107,"JSWFactory",m7);

        Machine m8 = new Machine(8,"Drill","Drilling");
        Factory f8 = new Factory(108,"VedantaFactory",m8);

        Machine m9 = new Machine(9,"Milling","Shaping");
        Factory f9 = new Factory(109,"HeroFactory",m9);

        Machine m10 = new Machine(10,"CNC","Automatic");
        Factory f10 = new Factory(110,"HondaFactory",m10);

        Machine m11 = new Machine(11,"Press","Pressing");
        Factory f11 = new Factory(111,"ToyotaFactory",m11);

        Machine m12 = new Machine(12,"Grinding","Finishing");
        Factory f12 = new Factory(112,"HyundaiFactory",m12);

        Machine m13 = new Machine(13,"Lathe","Cutting");
        Factory f13 = new Factory(113,"BajajFactory",m13);

        Machine m14 = new Machine(14,"Drill","Drilling");
        Factory f14 = new Factory(114,"TVSFactory",m14);

        Machine m15 = new Machine(15,"Milling","Shaping");
        Factory f15 = new Factory(115,"AshokLeylandFactory",m15);

        Machine m16 = new Machine(16,"CNC","Automatic");
        Factory f16 = new Factory(116,"BoschFactory",m16);

        Machine m17 = new Machine(17,"Press","Pressing");
        Factory f17 = new Factory(117,"VolvoFactory",m17);

        Machine m18 = new Machine(18,"Grinding","Finishing");
        Factory f18 = new Factory(118,"FordFactory",m18);

        Machine m19 = new Machine(19,"Lathe","Cutting");
        Factory f19 = new Factory(119,"SuzukiFactory",m19);

        Machine m20 = new Machine(20,"Drill","Drilling");
        Factory f20 = new Factory(120,"NissanFactory",m20);

        f1.displayDetails();
        f2.displayDetails();
        f3.displayDetails();
        f4.displayDetails();
        f5.displayDetails();
        f6.displayDetails();
        f7.displayDetails();
        f8.displayDetails();
        f9.displayDetails();
        f10.displayDetails();
        f11.displayDetails();
        f12.displayDetails();
        f13.displayDetails();
        f14.displayDetails();
        f15.displayDetails();
        f16.displayDetails();
        f17.displayDetails();
        f18.displayDetails();
        f19.displayDetails();
        f20.displayDetails();

    }
}