package com.common.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "baseDao")
public class BaseDaoImpl<T, PK extends Serializable> extends SqlSessionDaoSupport implements BaseDao<T, PK> {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public int save(String statement, Object parameter) {

        int affectedRowsNumber = 0;

        affectedRowsNumber = super.getSqlSession().insert(statement, parameter);

        return affectedRowsNumber;
    }

    public int save(String statement) {
        int affectedRowsNumber = 0;
        affectedRowsNumber = super.getSqlSession().insert(statement);

        return affectedRowsNumber;
    }

    public int delete(String statement, Object parameter) {
        int affectedRowsNumber = 0;

        affectedRowsNumber = super.getSqlSession().delete(statement, parameter);

        return affectedRowsNumber;
    }

    public int delete(String statement) {
        int affectedRowsNumber = 0;

        affectedRowsNumber = super.getSqlSession().delete(statement);

        return affectedRowsNumber;
    }

    public int update(String statement, Object parameter) {
        int affectedRowsNumber = 0;
        affectedRowsNumber = super.getSqlSession().update(statement, parameter);

        return affectedRowsNumber;
    }

    public int update(String statement) {
        int affectedRowsNumber = 0;

        affectedRowsNumber = super.getSqlSession().update(statement);

        return affectedRowsNumber;
    }

    public List<T> getList(String statement, Object parameter, Integer pageSize, Integer pageIndex) {
        List<T> list = new ArrayList<T>();

        RowBounds rowBounds = new RowBounds((pageIndex - 1) * pageSize, pageSize);

        list = super.getSqlSession().selectList(statement, parameter, rowBounds);

        return list;
    }

    public List<T> getList(String statement) {
        List<T> list = new ArrayList<T>();

        list = super.getSqlSession().selectList(statement);

        return list;
    }

    public List<T> getList(String statement, Object parameter) {
        List<T> list = new ArrayList<T>();

        list = super.getSqlSession().selectList(statement, parameter);

        return list;
    }

    public T get(String statement, Object parameter) {
        T object = null;

        object = super.getSqlSession().selectOne(statement, parameter);

        return object;
    }

    public T get(String statement) {
        T object = null;

        object = super.getSqlSession().selectOne(statement);

        return object;
    }

    public long getCount(String statement, Object parameter) {

        long cnt = super.getSqlSession().selectOne(statement, parameter);

        return cnt;
    }

    public long getCount(String statement) {

        long cnt = super.getSqlSession().selectOne(statement);

        return cnt;
    }

    // /-----------------返回整体
    /**
     * 返回泛型 Tuxs
     * 
     * @param statement
     * @return
     */
    public <O> O QuerySingle(String statement, Object parameter) {
        O object = null;
        object = super.getSqlSession().selectOne(statement, parameter);
        return object;
    }

    /**
     * 返回泛型 Tuxs
     * 
     * @param statement
     * @return
     */
    public <O> List<O> QueryMany(String statement, Object parameter) {
        List<O> list = new ArrayList<O>();
        list = super.getSqlSession().selectList(statement, parameter);
        return list;
    }

    /**
     * 返回泛型集合 Tuxs
     * 
     * @param statement
     * @return
     */
    public <O> List<O> QueryMany(String statement, Object parameter, Integer pageSize, Integer pageIndex) {
        List<O> list = new ArrayList<O>();

        RowBounds rowBounds = new RowBounds((pageIndex - 1) * pageSize, pageSize);

        list = super.getSqlSession().selectList(statement, parameter, rowBounds);

        return list;
    }

}
