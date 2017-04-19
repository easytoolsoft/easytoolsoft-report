package com.easytoolsoft.report.engine.query;

import com.easytoolsoft.report.engine.data.ReportParameter;
import com.easytoolsoft.report.engine.data.ReportDataSource;

/**
 * SQLite3数据库查询器类。
 * 在使用该查询器时,请先参考:https://bitbucket.org/xerial/sqlite-jdbc
 * 获取jdbc driver,然后把相关jdbc driver的jar包加入该系统的类路径下(如WEB-INF/lib)
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public class SQLiteQueryer extends AbstractQueryer implements Queryer {
    public SQLiteQueryer(ReportDataSource dataSource, ReportParameter parameter) {
        super(dataSource, parameter);
    }
}
