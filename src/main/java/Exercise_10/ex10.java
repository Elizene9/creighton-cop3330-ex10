/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Create a simple self-checkout system. Prompt for the prices and quantities of three items.
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total,
and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate.
Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */
package Exercise_10;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        double price[] = new double[3];
        double quantity[] = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.printf("Enter the price of item %d: ", i + 1);

            price[i] = input.nextInt();

            System.out.printf("Enter the quantity of item %d: ", i + 1);

            quantity[i] = input.nextInt();

            sum += quantity[i] * price[i];

        }

        double tax = sum * .055;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", sum, tax, sum + tax);

    }
}
