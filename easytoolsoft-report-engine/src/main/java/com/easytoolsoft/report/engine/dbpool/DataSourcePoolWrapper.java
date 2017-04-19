package com.easytoolsoft.report.engine.dbpool;

import javax.sql.DataSource;

import com.easytoolsoft.report.engine.data.ReportDataSource;

/**
 * 数据源连接包装器
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public interface DataSourcePoolWrapper {
    DataSource wrap(ReportDataSource rptDs);
}
