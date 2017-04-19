package com.easytoolsoft.report.engine.query;

import com.easytoolsoft.report.engine.data.ReportDataSource;
import com.easytoolsoft.report.engine.data.ReportParameter;

/**
 * MS SQLServer 数据库查询器类。
 * 在使用该查询器时,请先参考:https://msdn.microsoft.com/library/mt484311.aspx
 * 获取sqlserver jdbc driver,然后把相关jdbc driver的jar包加入该系统的类路径下(如WEB-INF/lib)
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public class SqlServerQueryer extends AbstractQueryer implements Queryer {
    public SqlServerQueryer(ReportDataSource dataSource, ReportParameter parameter) {
        super(dataSource, parameter);
    }
}
