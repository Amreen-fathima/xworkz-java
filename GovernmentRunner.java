class GovernmentRunner {

    public static void main(String[] args) {

        Policy p1 = new Policy(1,"EducationPolicy","Education");
        Government g1 = new Government(101,"India",p1);

        Policy p2 = new Policy(2,"HealthPolicy","Health");
        Government g2 = new Government(102,"India",p2);

        Policy p3 = new Policy(3,"AgriculturePolicy","Agriculture");
        Government g3 = new Government(103,"India",p3);

        Policy p4 = new Policy(4,"DefencePolicy","Defence");
        Government g4 = new Government(104,"India",p4);

        Policy p5 = new Policy(5,"TransportPolicy","Transport");
        Government g5 = new Government(105,"India",p5);

        Policy p6 = new Policy(6,"EnergyPolicy","Energy");
        Government g6 = new Government(106,"India",p6);

        Policy p7 = new Policy(7,"WaterPolicy","WaterResources");
        Government g7 = new Government(107,"India",p7);

        Policy p8 = new Policy(8,"EnvironmentPolicy","Environment");
        Government g8 = new Government(108,"India",p8);

        Policy p9 = new Policy(9,"DigitalPolicy","IT");
        Government g9 = new Government(109,"India",p9);

        Policy p10 = new Policy(10,"IndustrialPolicy","Industry");
        Government g10 = new Government(110,"India",p10);

        Policy p11 = new Policy(11,"HousingPolicy","Housing");
        Government g11 = new Government(111,"India",p11);

        Policy p12 = new Policy(12,"EmploymentPolicy","Labour");
        Government g12 = new Government(112,"India",p12);

        Policy p13 = new Policy(13,"TourismPolicy","Tourism");
        Government g13 = new Government(113,"India",p13);

        Policy p14 = new Policy(14,"SciencePolicy","ScienceTech");
        Government g14 = new Government(114,"India",p14);

        Policy p15 = new Policy(15,"TradePolicy","Commerce");
        Government g15 = new Government(115,"India",p15);

        Policy p16 = new Policy(16,"BankingPolicy","Finance");
        Government g16 = new Government(116,"India",p16);

        Policy p17 = new Policy(17,"CyberSecurityPolicy","ITSecurity");
        Government g17 = new Government(117,"India",p17);

        Policy p18 = new Policy(18,"WomenEmpowermentPolicy","WomenChild");
        Government g18 = new Government(118,"India",p18);

        Policy p19 = new Policy(19,"SkillDevelopmentPolicy","SkillDev");
        Government g19 = new Government(119,"India",p19);

        Policy p20 = new Policy(20,"StartupPolicy","StartupIndia");
        Government g20 = new Government(120,"India",p20);

        g1.displayDetails();
        g2.displayDetails();
        g3.displayDetails();
        g4.displayDetails();
        g5.displayDetails();
        g6.displayDetails();
        g7.displayDetails();
        g8.displayDetails();
        g9.displayDetails();
        g10.displayDetails();
        g11.displayDetails();
        g12.displayDetails();
        g13.displayDetails();
        g14.displayDetails();
        g15.displayDetails();
        g16.displayDetails();
        g17.displayDetails();
        g18.displayDetails();
        g19.displayDetails();
        g20.displayDetails();
    }
}