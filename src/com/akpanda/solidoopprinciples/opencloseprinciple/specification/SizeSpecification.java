package com.akpanda.solidoopprinciples.opencloseprinciple.specification;

import com.akpanda.solidoopprinciples.opencloseprinciple.Product;
import com.akpanda.solidoopprinciples.opencloseprinciple.enums.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.getSize()==this.size;
    }
}
