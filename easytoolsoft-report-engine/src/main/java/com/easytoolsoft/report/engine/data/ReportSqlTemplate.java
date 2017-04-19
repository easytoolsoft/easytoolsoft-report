package com.easytoolsoft.report.engine.data;

import java.util.Map;

import com.easytoolsoft.report.engine.util.VelocityUtils;

/**
 * @author Tom Deng
 * @date 2017-03-25
 */
public class ReportSqlTemplate {

    private String sqlTemplate;
    private Map<String, Object> parameters;

    public ReportSqlTemplate(String sqlTemplate, Map<String, Object> parameters) {
        this.sqlTemplate = sqlTemplate;
        this.parameters = parameters;
    }

    public String execute() {
        return VelocityUtils.parse(this.sqlTemplate, this.parameters);
    }
}
