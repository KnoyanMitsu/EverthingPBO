package com.minggu10prak.AIC;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(1000, "R-1");
        ow.pay(eBill);
        System.out.println("------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 525);
        ow.pay(pEmp);
        System.out.println("------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("------------------------");
        ow.showMyEmployee(iEmp);
    }
}
