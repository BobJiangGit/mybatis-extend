package org.mybatis.extend.page.dialect.impl;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.extend.page.dialect.GenericDialect;
import org.mybatis.extend.page.util.StringTools;


/**
 * Created by Bob Jiang on 2017/3/6.
 */
public class MySqlGenericDialect extends GenericDialect {

    @Override
    public String getPageSql(String sql, RowBounds rowBounds) {
        return StringTools.append(sql, " limit ", rowBounds.getOffset(), " , ", rowBounds.getLimit());
    }

    @Override
    public String getCountSql(String sql) {
        return StringTools.append("select count(0) from (", sql, ") tmp_count");
    }
}
