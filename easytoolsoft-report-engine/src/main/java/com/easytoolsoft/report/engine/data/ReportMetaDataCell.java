package com.easytoolsoft.report.engine.data;

/**
 * @author Tom Deng
 * @date 2017-03-25
 */
public class ReportMetaDataCell {
    private final ReportMetaDataColumn column;
    private final String name;
    private final Object value;

    public ReportMetaDataCell(ReportMetaDataColumn column, String name, Object value) {
        this.column = column;
        this.name = name;
        this.value = value;
    }

    public ReportMetaDataColumn getColumn() {
        return this.column;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }
}
