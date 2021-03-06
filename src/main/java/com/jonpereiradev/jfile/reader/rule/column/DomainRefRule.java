package com.jonpereiradev.jfile.reader.rule.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;

import java.util.List;

public class DomainRefRule<T> extends AbstractRefRule {

    private final List<T> domains;
    private final Class<T> clazz;

    @SuppressWarnings("unchecked")
    public DomainRefRule(int refPosition, int position, List<T> domains) {
        super(refPosition, position);
        this.domains = domains;
        this.clazz = (Class<T>) domains.get(0).getClass();
    }

    @Override
    public boolean canValidate(JFileColumn fileColumn) {
        return domains.contains(fileColumn.getContent(clazz));
    }

}
