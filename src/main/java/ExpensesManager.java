public class ExpensesManager {
    double[] expenses = new double[7];

    double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("The value is saved! Your current balance in rubles: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("You don't have much left in your account. It's time to start saving!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Day " + (i + 1) + ". Spent " + expenses[i] + " rubles");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}