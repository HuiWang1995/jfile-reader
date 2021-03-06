package com.jonpereiradev.jfile.reader.rule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RuleNodeImpl<T extends Rule<?>> implements RuleNode<T> {

    private final Class<?> type;
    private final RuleNode<T> parentNode;
    private final List<T> rules = new ArrayList<>();

    public RuleNodeImpl(Class<?> type, RuleNode<T> parentNode) {
        this.type = type;
        this.parentNode = parentNode;
    }

    @Override
    public void add(T rule) {
        this.rules.add(rule);
    }

    @Override
    public Class<?> getType() {
        return type;
    }

    @Override
    public Iterator<T> iterator() {
        return rules.iterator();
    }

    @Override
    public RuleNode<T> getParentNode() {
        return parentNode;
    }

    @Override
    public List<T> getChildrens() {
        return Collections.unmodifiableList(rules);
    }
}
