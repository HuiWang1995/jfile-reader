package com.jonpereiradev.jfile.reader.rule.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

import java.util.List;

public class DomainShortRule extends AbstractColumnRule {

    private final List<Short> domains;

    public DomainShortRule(int position, List<Short> domains) {
        super(position);
        this.domains = domains;
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        return domains.contains(fileColumn.getShort());
    }

    @Override
    public boolean canValidate(JFileColumn fileColumn) {
        return fileColumn.getShort() != null;
    }
}
