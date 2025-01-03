/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saqib Khan
 */
public class MonolithicApp {
    public static void main(String[] args) {
        // Data Layer (hardcoded data)
        String product = "Laptop";
        double price = 50000;

        // Application Layer (business logic)
        double discount = 0.1; // 10% discount
        double discountedPrice = price - (price * discount);

        // Presentation Layer (output)
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
