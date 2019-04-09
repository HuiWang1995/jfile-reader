package com.jonpereiradev.jfile.reader.rule.configurator;

import com.jonpereiradev.jfile.reader.rule.RuleConfiguratorContext;
import com.jonpereiradev.jfile.reader.rule.RuleNode;
import com.jonpereiradev.jfile.reader.rule.column.ColumnRule;
import com.jonpereiradev.jfile.reader.rule.column.MaxBigIntegerRule;
import com.jonpereiradev.jfile.reader.rule.column.MinBigIntegerRule;

import java.math.BigInteger;

final class BigIntegerTypeConfiguratorImpl
    extends AbstractRuleConfigurator<BigIntegerTypeConfigurator> implements BigIntegerTypeConfigurator {

    BigIntegerTypeConfiguratorImpl(int position, RuleConfiguratorContext context, RuleNode<ColumnRule> ruleNode) {
        super(position, context, ruleNode);
    }

    @Override
    public BigIntegerTypeConfigurator min(BigInteger min) {
        return rule(position -> new MinBigIntegerRule(position, min));
    }

    @Override
    public BigIntegerTypeConfigurator max(BigInteger max) {
        return rule(position -> new MaxBigIntegerRule(position, max));
    }
}
