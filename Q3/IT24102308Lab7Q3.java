import java.util.Scanner;

public class IT24102308Lab7Q3 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter the total bill amount: ");
            double totalBill = input.nextDouble();

            System.out.print("Enter payment mode (C for Cash, O for Other): ");
            char paymentMode = input.next().charAt(0);

            double discount = 0.0;
            double amountToPay = totalBill;

            switch (paymentMode) {
                case 'C':
                    discount = totalBill * 0.05;
                    amountToPay -= discount;
                    break;

                case 'O':
                    break;

                default:
                    System.out.println("Payment Mode is Not Valid");
                   
            }

            System.out.println("Discount is:"+discount);
            System.out.println("Amount to be paid: "+amountToPay);
           
    }
    }
}
