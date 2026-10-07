package control_flow.class_problems.assignment_problems.Week_6;

class PayrollAccount {

    private double basicSalary;
    private double bonus;

    PayrollAccount(double salary) {

        if (salary < 0) {
            System.out.println("Invalid salary");
            basicSalary = 0;
        }
        else {
            basicSalary = salary;
        }
    }

    void creditBonus(double amount) {

        if (amount <= 0)
            System.out.println("Invalid bonus");
        else {
            bonus = bonus + amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    void deductTax(double percent) {

        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax");
        }
        else {
            basicSalary = basicSalary -
                          (basicSalary * percent / 100);

            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class PayrollAccountApp {

    public static void main(String[] args) {

        PayrollAccount p = new PayrollAccount(50000);

        p.creditBonus(5000);
        p.deductTax(10);

        System.out.println("Net salary: Rs " +
                           p.getNetSalary());
    }
}