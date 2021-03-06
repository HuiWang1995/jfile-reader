package com.jonpereiradev.jfile.reader.rule.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFutureRule extends AbstractColumnRule {

    private final DateFormat dateFormat;

    public DateFutureRule(int position, DateFormat dateFormat) {
        super(position);
        this.dateFormat = dateFormat;
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        Date date = fileColumn.getDate(dateFormat);
        Date current = Calendar.getInstance().getTime();

        return current.before(date);
    }

    @Override
    public boolean canValidate(JFileColumn fileColumn) {
        return fileColumn.getDate(dateFormat) != null;
    }
}
