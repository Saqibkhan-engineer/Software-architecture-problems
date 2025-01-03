/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saqib Khan
 */
public class RefactoredApp {
    
    public static void main(String[] args) {
        
        ProductData productData = new ProductData();
        String product = productData.getProduct();
        double price = productData.getPrice();

       
        DiscountService discountService = new DiscountService();
        double discountRate = 0.1; // 10% discount
        double discountedPrice = discountService.calculateDiscountedPrice(price, discountRate);

        
        ProductDisplay productDisplay = new ProductDisplay();
        productDisplay.displayProductInfo(product, price, discountedPrice);
    }
    
}
