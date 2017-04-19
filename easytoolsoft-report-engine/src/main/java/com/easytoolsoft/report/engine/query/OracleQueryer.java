package com.easytoolsoft.report.engine.query;

import com.easytoolsoft.report.engine.data.ReportDataSource;
import com.easytoolsoft.report.engine.data.ReportParameter;

/**
 * Oracle数据库查询器类。
 * 在使用该查询器时,请先参考:http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html
 * 获取与相应版本的Oracle jdbc driver,然后把相关jdbc driver的jar包加入该系统的类路径下(如WEB-INF/lib)
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public class OracleQueryer extends AbstractQueryer implements Queryer {
    public OracleQueryer(ReportDataSource dataSource, ReportParameter parameter) {
        super(dataSource, parameter);
    }
}
