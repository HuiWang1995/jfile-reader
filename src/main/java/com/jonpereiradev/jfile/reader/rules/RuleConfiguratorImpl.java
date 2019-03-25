package com.jonpereiradev.jfile.reader.rules;

import com.jonpereiradev.jfile.reader.rules.configurator.FileRuleConfigurator;

final class RuleConfiguratorImpl implements RuleConfigurator {

    private final RuleConfiguratorContext context;

    RuleConfiguratorImpl(RuleConfiguratorContext context) {
        this.context = context;
    }

    @Override
    public FileRuleConfigurator files() {
        return FileRuleConfigurator.defaultConfigurator(context);
    }
}
