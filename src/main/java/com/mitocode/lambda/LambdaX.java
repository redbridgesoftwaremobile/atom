//package com.mitocode.lambda;

import java.util.ArrayList; 
import java.util.List; 

public class LambdaX {
    
    public static void main(String[] args) {
        System.out.println("Exsmple001-foreach");
        
        List products = new ArrayList(); 		
        products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1")); 		
        products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1")); 		
        products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2")); 		
        products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2")); 		
        products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2")); 		
        System.out.println("Product List"); 		
        
        products.forEach(product -> { 
            System.out.println(product.toString()); 			         
            System.out.println("======================Example001-foreach"); 		
        });
    }
    
}
