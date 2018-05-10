package com.github.thanglequoc.java8.lambdaExpression.functionalInterface;

import java.util.Comparator;

import com.github.thanglequoc.java8.common.model.Fruit;

@FunctionalInterface
public interface FruitComparator extends Comparator<Fruit> {
    public int compare(Fruit a, Fruit b);
}