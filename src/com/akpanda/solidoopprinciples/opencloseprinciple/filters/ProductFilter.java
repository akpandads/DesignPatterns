package com.akpanda.solidoopprinciples.opencloseprinciple.filters;

import com.akpanda.solidoopprinciples.opencloseprinciple.Product;
import com.akpanda.solidoopprinciples.opencloseprinciple.enums.Color;
import com.akpanda.solidoopprinciples.opencloseprinciple.enums.Size;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
    public Stream<Product> filterByColor(List<Product> prducts, Color color){
        return prducts.stream().filter(p-> p.getColor()==color);
    }

    public Stream<Product> filterBySize(List<Product> prducts, Size size){
        return prducts.stream().filter(p-> p.getSize()==size);
    }
}
