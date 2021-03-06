package com.jonpereiradev.jfile.reader.rule.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

public class MaxShortRule extends AbstractColumnRule {

    private final short max;

    public MaxShortRule(int position, short max) {
        super(position);
        this.max = max;
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        return fileColumn.getShort() <= max;
    }

    @Override
    public boolean canValidate(JFileColumn fileColumn) {
        return fileColumn.getShort() != null;
    }
}
