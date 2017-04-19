package com.easytoolsoft.report.engine.util;

import java.util.Map;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import com.googlecode.aviator.exception.ExpressionRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 报表计算列表达式求值工具类
 *
 * @author Tom Deng
 * @date 2017-03-25
 */
public class AviatorExprUtils {
    private static final Logger logger = LoggerFactory.getLogger(AviatorExprUtils.class);

    public static Object execute(String expression, Map<String, Object> context) {
        Object value = null;

        try {
            Expression compiledExp = AviatorEvaluator.compile(expression, true);
            value = compiledExp.execute(context);
        } catch (ExpressionRuntimeException ex) {
            logger.error(ex.getMessage());
        }

        return value;
    }
}
