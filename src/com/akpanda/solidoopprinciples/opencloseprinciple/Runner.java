package com.akpanda.solidoopprinciples.opencloseprinciple;

import com.akpanda.solidoopprinciples.opencloseprinciple.enums.Color;
import com.akpanda.solidoopprinciples.opencloseprinciple.enums.Size;
import com.akpanda.solidoopprinciples.opencloseprinciple.specification.AndSpecification;
import com.akpanda.solidoopprinciples.opencloseprinciple.specification.ColorSpecification;
import com.akpanda.solidoopprinciples.opencloseprinciple.filters.EnhancedProductFilter;
import com.akpanda.solidoopprinciples.opencloseprinciple.filters.ProductFilter;
import com.akpanda.solidoopprinciples.opencloseprinciple.specification.SizeSpecification;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree",Color.GREEN,Size.LARGE);
        Product tshirt = new Product("Tshirt",Color.BLUE,Size.MEDIUM);

        List<Product> products = List.of(apple,tree,tshirt);

        ProductFilter pf = new ProductFilter();
        System.out.println("Old system of filtering");
        pf.filterByColor(products,Color.GREEN).forEach(p-> System.out.println(p.getName() +" is green"));
        pf.filterBySize(products,Size.MEDIUM).forEach(p-> System.out.println(p.getName() +" is medium"));

        System.out.println("New system of filtering");
        EnhancedProductFilter enhancedProductFilter = new EnhancedProductFilter();
        enhancedProductFilter.filter(products, new ColorSpecification(Color.GREEN)).forEach(p-> System.out.println(p.getName() +" is green"));
        enhancedProductFilter.filter(products, new SizeSpecification(Size.MEDIUM)).forEach(p-> System.out.println(p.getName() +" is medium"));

        System.out.println("Find all LARGE and GREEN Item");
        enhancedProductFilter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.LARGE)
        )).forEach(p-> System.out.println(p.getName() +"is green and large"));
    }
}
