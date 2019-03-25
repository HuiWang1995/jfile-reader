package com.jonpereiradev.jfile.reader.rules.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MaxBigDecimalRule extends AbstractColumnRule {

    private final BigDecimal max;
    private final DecimalFormat decimalFormat;

    public MaxBigDecimalRule(int position, BigDecimal max, DecimalFormat decimalFormat) {
        super(position);
        this.max = max;
        this.decimalFormat = decimalFormat;
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        return fileColumn.getBigDecimal(decimalFormat).compareTo(max) <= 0;
    }
}
