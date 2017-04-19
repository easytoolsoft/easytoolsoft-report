package com.easytoolsoft.report.engine.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.easytoolsoft.report.engine.data.ReportParameter;
import com.easytoolsoft.report.engine.data.ReportDataSource;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Tom Deng
 * @date 2017-03-25
 * @see https://cwiki.apache.org/confluence/display/Hive/HiveServer2+Clients
 */
public class HiveQueryer extends AbstractQueryer implements Queryer {
    private final Pattern pattern = Pattern.compile("limit.*?$", Pattern.CASE_INSENSITIVE);

    public HiveQueryer(ReportDataSource dataSource, ReportParameter parameter) {
        super(dataSource, parameter);

    }

    @Override
    protected Connection getJdbcConnection() {
        try {
            Class.forName(this.dataSource.getDriverClass());
            return DriverManager.getConnection(this.dataSource.getJdbcUrl(), this.dataSource.getUser(),
                this.dataSource.getPassword());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    protected String preprocessSqlText(String sqlText) {
        sqlText = StringUtils.stripEnd(sqlText.trim(), ";");
        Matcher matcher = pattern.matcher(sqlText);
        if (matcher.find()) {
            sqlText = matcher.replaceFirst("");
        }
        return sqlText + " limit 1";
    }
}