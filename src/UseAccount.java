package src;

import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Барри";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Джейн";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;

        myAccount.display();
        out.print(" плюс $");
        out.printf("$%4.2f", myAccount.getInterest(5.00));
        out.println(" дохода");

        yourAccount.display();
        double yourInterestRate = 7.00;
        out.print(" плюс $");
        double yourInerestAmount = yourAccount.getInterest(yourInterestRate);
        out.printf("$%4.2f", yourInerestAmount);
        out.print(" дохода");
    }
}
