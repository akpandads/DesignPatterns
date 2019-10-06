package com.akpanda.solidoopprinciples.opencloseprinciple.filters;

import com.akpanda.solidoopprinciples.opencloseprinciple.Product;
import com.akpanda.solidoopprinciples.opencloseprinciple.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public class EnhancedProductFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(p-> specification.isSatisfied(p));
    }
}
