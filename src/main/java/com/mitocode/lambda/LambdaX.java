//package com.mitocode.lambda;

import java.util.ArrayList; 
import java.util.List; 

public class LambdaX {
    
    public static void main(String[] args) {
        System.out.println("Exsmple001-foreach");
        
        List<Product> products = new ArrayList<Product>(); 		
        products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1")); 		
        products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1")); 		
        products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2")); 		
        products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2")); 		
        products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2")); 		
        
        System.out.println("Product List"); 		
        
        products.forEach(p -> { 
            System.out.println(p.toString()); 			         
            System.out.println("======================Example001-foreach"); 		
        });
        
        System.out.println("Exsmple002-filter");
        
        System.out.println("Or Condition");
        
        products.stream()
        .filter(p -> p.getId().equalsIgnoreCase("p1")
               || p.getId().equalsIgnoreCase("p3"))
        .forEach(p->{
               System.out.println(p.toString()); 				         
               System.out.println("======================"); 			
        }); 		
        /*
        System.out.println("And Condition"); 		
        
        products.stream().filter(p -> p.getPrice() > 700 && p.getPrice() < 7000) 			
        .forEach(p -> {
            System.out.println(p.toString()); 				         
            System.out.println("======================"); 			
        }); 

        */
    }
    
    
    
    
}
