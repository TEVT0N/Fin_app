public class DinnerAdvisor {

    void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("Today is better to eat at home!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("OK, it's time for burgers!");
            } else {
                System.out.println("Today is better to eat at home!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Not bad! It's time to buy some dollars and go to a cool place for dinner. :)");
            } else {
                System.out.println("OK, it's time for burgers!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Great! Let's order oysters!");
            } else {
                System.out.println("Not bad! It's time to buy some dollars and go to a cool place for dinner. :)");
            }
        }
    }
}