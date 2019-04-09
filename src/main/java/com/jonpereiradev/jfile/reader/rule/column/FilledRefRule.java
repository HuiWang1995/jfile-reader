package com.jonpereiradev.jfile.reader.rule.column;

import com.jonpereiradev.jfile.reader.file.JFileColumn;
import com.jonpereiradev.jfile.reader.rule.RuleNode;

public class FilledRefRule extends AbstractRefRule {

    public FilledRefRule(int refPosition, int position, RuleNode<ColumnRule> rootNode) {
        super(refPosition, position, rootNode);
    }

    @Override
    public boolean isValid(JFileColumn fileColumn) {
        return new NotEmptyRule(fileColumn.getPosition()).isValid(fileColumn);
    }

}
