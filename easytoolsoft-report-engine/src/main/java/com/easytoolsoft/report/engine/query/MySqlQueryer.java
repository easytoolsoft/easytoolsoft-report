package com.easytoolsoft.report.engine.query;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.easytoolsoft.report.engine.data.ReportParameter;
import com.easytoolsoft.report.engine.data.ReportDataSource;
import org.apache.commons.lang3.StringUtils;

/**
 * Mysql查询器实现
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public class MySqlQueryer extends AbstractQueryer implements Queryer {
    private final Pattern pattern = Pattern.compile("limit.*?$", Pattern.CASE_INSENSITIVE);

    public MySqlQueryer(ReportDataSource dataSource, ReportParameter parameter) {
        super(dataSource, parameter);
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
