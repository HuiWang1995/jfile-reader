package com.jonpereiradev.jfile.reader.rules.configurator;

public interface RefRuleConfigurator<T> {

    T filled();

    T when(Object... value);

}