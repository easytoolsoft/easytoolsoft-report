package com.easytoolsoft.report.engine.query;

import java.util.List;

import com.easytoolsoft.report.engine.data.ReportMetaDataColumn;
import com.easytoolsoft.report.engine.data.ReportQueryParamItem;
import com.easytoolsoft.report.engine.data.ReportMetaDataRow;

/**
 * 报表查询器接口
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public interface Queryer {
    /**
     * 从sql语句中解析出报表元数据列集合
     *
     * @param sqlText sql语句
     * @return List[ReportMetaDataColumn]
     */
    List<ReportMetaDataColumn> parseMetaDataColumns(String sqlText);

    /**
     * 从sql语句中解析出报表查询参数(如下拉列表参数）的列表项集合
     *
     * @param sqlText sql语句
     * @return List[ReportQueryParamItem]
     */
    List<ReportQueryParamItem> parseQueryParamItems(String sqlText);

    /**
     * 获取报表原始数据行集合
     *
     * @return List[ReportMetaDataRow]
     */
    List<ReportMetaDataRow> getMetaDataRows();

    /**
     * 获取报表原始数据列集合
     *
     * @return List[ReportMetaDataColumn]
     */
    List<ReportMetaDataColumn> getMetaDataColumns();
}
