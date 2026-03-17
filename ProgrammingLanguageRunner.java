class ProgrammingLanguageRunner {

    public static void main(String[] args) {

        Syntax s1 = new Syntax(1,"Variable Declaration","int a = 10;");
        ProgrammingLanguage p1 = new ProgrammingLanguage(101,"Java",s1);

        Syntax s2 = new Syntax(2,"Print Statement","System.out.println()");
        ProgrammingLanguage p2 = new ProgrammingLanguage(102,"Java",s2);

        Syntax s3 = new Syntax(3,"If Condition","if(a>10)");
        ProgrammingLanguage p3 = new ProgrammingLanguage(103,"Java",s3);

        Syntax s4 = new Syntax(4,"For Loop","for(int i=0;i<10;i++)");
        ProgrammingLanguage p4 = new ProgrammingLanguage(104,"Java",s4);

        Syntax s5 = new Syntax(5,"While Loop","while(true)");
        ProgrammingLanguage p5 = new ProgrammingLanguage(105,"Java",s5);

        Syntax s6 = new Syntax(6,"Method","void display()");
        ProgrammingLanguage p6 = new ProgrammingLanguage(106,"Java",s6);

        Syntax s7 = new Syntax(7,"Class","class Demo");
        ProgrammingLanguage p7 = new ProgrammingLanguage(107,"Java",s7);

        Syntax s8 = new Syntax(8,"Object Creation","new Demo()");
        ProgrammingLanguage p8 = new ProgrammingLanguage(108,"Java",s8);

        Syntax s9 = new Syntax(9,"Array","int[] a = new int[5]");
        ProgrammingLanguage p9 = new ProgrammingLanguage(109,"Java",s9);

        Syntax s10 = new Syntax(10,"String","String name");
        ProgrammingLanguage p10 = new ProgrammingLanguage(110,"Java",s10);

        Syntax s11 = new Syntax(11,"Switch","switch(value)");
        ProgrammingLanguage p11 = new ProgrammingLanguage(111,"Java",s11);

        Syntax s12 = new Syntax(12,"Break","break;");
        ProgrammingLanguage p12 = new ProgrammingLanguage(112,"Java",s12);

        Syntax s13 = new Syntax(13,"Continue","continue;");
        ProgrammingLanguage p13 = new ProgrammingLanguage(113,"Java",s13);

        Syntax s14 = new Syntax(14,"Return","return value;");
        ProgrammingLanguage p14 = new ProgrammingLanguage(114,"Java",s14);

        Syntax s15 = new Syntax(15,"Constructor","ClassName()");
        ProgrammingLanguage p15 = new ProgrammingLanguage(115,"Java",s15);

        Syntax s16 = new Syntax(16,"Inheritance","extends");
        ProgrammingLanguage p16 = new ProgrammingLanguage(116,"Java",s16);

        Syntax s17 = new Syntax(17,"Interface","interface Demo");
        ProgrammingLanguage p17 = new ProgrammingLanguage(117,"Java",s17);

        Syntax s18 = new Syntax(18,"Exception","try catch");
        ProgrammingLanguage p18 = new ProgrammingLanguage(118,"Java",s18);

        Syntax s19 = new Syntax(19,"Package","package com.demo");
        ProgrammingLanguage p19 = new ProgrammingLanguage(119,"Java",s19);

        Syntax s20 = new Syntax(20,"Import","import java.util.*");
        ProgrammingLanguage p20 = new ProgrammingLanguage(120,"Java",s20);

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