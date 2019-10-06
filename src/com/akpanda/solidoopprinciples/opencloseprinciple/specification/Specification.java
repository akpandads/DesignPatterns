package com.akpanda.solidoopprinciples.opencloseprinciple.specification;

public interface Specification<T> {
    boolean isSatisfied(T t);
}
