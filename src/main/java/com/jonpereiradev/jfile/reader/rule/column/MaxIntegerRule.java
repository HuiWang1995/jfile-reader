package com.jonpereiradev.jfile.reader.rule.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

public class MaxIntegerRule extends AbstractColumnRule {

    private final int max;

    public MaxIntegerRule(int position, int max) {
        super(position);
        this.max = max;
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        return fileColumn.getInt() <= max;
    }

    @Override
    public boolean canValidate(JFileColumn fileColumn) {
        return fileColumn.getInt() != null;
    }
}
