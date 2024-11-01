package com.minggu10prak.Employee;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee employee = new PermanentEmployee("Dedik", 500);
        InternshipEmployee employee2 = new InternshipEmployee("Sunarto", 5);
        ElectricityBill electricityBill = new ElectricityBill(5, "A-1");
        Employee e;
        Payable p;
        e = employee;
        e = employee2;
        p = employee;
        p = electricityBill;

        System.out.println(e.getEmployeeInfo());
        System.out.println(p.getPaymentAmount());
    }
}
