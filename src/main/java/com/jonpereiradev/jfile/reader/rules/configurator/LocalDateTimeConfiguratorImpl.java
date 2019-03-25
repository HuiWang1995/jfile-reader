package com.jonpereiradev.jfile.reader.rules.configurator;

import com.jonpereiradev.jfile.reader.rules.RuleConfiguratorContext;
import com.jonpereiradev.jfile.reader.rules.column.LocalDateTimeFutureOrPresentRule;
import com.jonpereiradev.jfile.reader.rules.column.LocalDateTimeFutureRule;
import com.jonpereiradev.jfile.reader.rules.column.LocalDateTimePastOrPresentRule;
import com.jonpereiradev.jfile.reader.rules.column.LocalDateTimePastRule;

import java.time.format.DateTimeFormatter;

final class LocalDateTimeConfiguratorImpl
    extends TypedRuleConfiguratorImpl<LocalDateTimeConfigurator> implements LocalDateTimeConfigurator {

    private final DateTimeFormatter dateTimeFormatter;

    LocalDateTimeConfiguratorImpl(int position, DateTimeFormatter dateTimeFormatter, RuleConfiguratorContext context) {
        super(position, context);
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public LocalDateTimeConfigurator future() {
        return rule(new LocalDateTimeFutureRule(position, dateTimeFormatter));
    }

    @Override
    public LocalDateTimeConfigurator futureOrPresent() {
        return rule(new LocalDateTimeFutureOrPresentRule(position, dateTimeFormatter));
    }

    @Override
    public LocalDateTimeConfigurator past() {
        return rule(new LocalDateTimePastRule(position, dateTimeFormatter));
    }

    @Override
    public LocalDateTimeConfigurator pastOrPresent() {
        return rule(new LocalDateTimePastOrPresentRule(position, dateTimeFormatter));
    }
}