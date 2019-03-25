package com.jonpereiradev.jfile.reader.rules.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePastRule extends AbstractColumnRule {

    private final DateTimeFormatter formatter;

    public LocalDateTimePastRule(int position, DateTimeFormatter formatter) {
        super(position);
        this.formatter = formatter;
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        LocalDateTime date = fileColumn.getLocalDateTime(formatter);
        LocalDateTime current = LocalDateTime.now();

        return current.compareTo(date) > 0;
    }
}