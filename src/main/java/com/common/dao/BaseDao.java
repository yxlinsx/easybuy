/**
 * =============================================================
 ** Created: [2016年3月25日] by ZhengChen
 * =============================================================
 * 
 * Copyright 2014-2015 NetDragon Websoft Inc. All Rights Reserved
 *
 * =============================================================
 */

package com.common.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

/**
 * @author ZhengChen
 * @since 0.1.0
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * save
     * 
     * @param statement
     * @param parameter
     * @return
     */
    public int save(String statement, Object parameter);

    /**
     * save
     * 
     * @param statement
     * @return
     */
    public int save(String statement);

    /**
     * delete
     * 
     * @param statement
     * @param parameter
     * @return
     */
    public int delete(String statement, Object parameter);

    /**
     * delete
     * 
     * @param statement
     * @return
     */
    public int delete(String statement);

    /**
     * update
     * 
     * @param statement
     * @param parameter
     * @return
     */
    public int update(String statement, Object parameter);

    /**
     * update
     * 
     * @param statement
     */
    public int update(String statement);

    /**
     * selectList
     * 
     * @param statement
     * @param parameter
     * @param pageSize
     * @param pageIndex
     * @return
     */
    public List<T> getList(String statement, Object parameter, Integer pageSize, Integer pageIndex);

    /**
     * selectList
     * 
     * @param statement
     * @param parameter
     * @return
     */
    public List<T> getList(String statement, Object parameter);

    /**
     * selectList
     * 
     * @param statement
     * @return
     */
    public List<T> getList(String statement);

    /**
     * selectOne
     * 
     * @param statement
     * @param parameter
     * @return
     */
    public T get(String statement, Object parameter);

    /**
     * selectOne
     * 
     * @param statement
     * @return
     */
    public T get(String statement);

    /**
     * selectOne
     * 
     * @param statement
     * @param parameter
     * @return
     */
    public long getCount(String statement, Object parameter);

    /**
     * selectOne
     * 
     * @param statement
     * @return
     */
    public long getCount(String statement);
    
    
    
    
    ///-----------------返回整体
    /**
     * 返回泛型
     * Tuxs
     * @param statement
     * @return
     */
    public <O> O QuerySingle(String statement, Object parameter);
    /**
     * 返回泛型
     * Tuxs
     * @param statement
     * @return
     */
    public <O> List<O> QueryMany(String statement, Object parameter);
    /**
     * 返回泛型集合
     * Tuxs
     * @param statement
     * @return
     */
    public <O> List<O> QueryMany(String statement, Object parameter, Integer pageSize, Integer pageIndex);
}
