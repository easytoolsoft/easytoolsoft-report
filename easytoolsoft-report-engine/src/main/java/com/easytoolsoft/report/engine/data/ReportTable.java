package com.easytoolsoft.report.engine.data;

/**
 * 报表类
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public class ReportTable {
    private final String htmlText;
    private final String sqlText;
    private final int metaDataRowCount;
    private final int metaDataColumnCount;

    public ReportTable(String htmlText, String sqlText, int metaDataRowCount, int metaDataColumnCount) {
        this.htmlText = htmlText;
        this.sqlText = sqlText;
        this.metaDataRowCount = metaDataRowCount;
        this.metaDataColumnCount = metaDataColumnCount;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public String getSqlText() {
        return sqlText;
    }

    public long getMetaDataRowCount() {
        return this.metaDataRowCount;
    }

    public int getMetaDataColumnCount() {
        return metaDataColumnCount;
    }
}
