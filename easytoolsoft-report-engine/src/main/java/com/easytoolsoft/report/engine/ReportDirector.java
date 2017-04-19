package com.easytoolsoft.report.engine;

/**
 * @author Tom Deng
 * @date 2017-03-25
 */
public class ReportDirector {
    private ReportBuilder builder;

    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        this.builder.drawTableHeaderRows();
        this.builder.drawTableBodyRows();
        this.builder.drawTableFooterRows();
    }
}
