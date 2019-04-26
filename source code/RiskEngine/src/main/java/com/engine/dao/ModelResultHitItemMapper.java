package com.engine.dao;

import com.engine.model.ModelResultHitItem;
import com.engine.model.ModelResultHitItemExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ModelResultHitItemMapper {
    /**
     *
     * @mbggenerated 2019-04-26
     */
    int countByExample(ModelResultHitItemExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int deleteByExample(ModelResultHitItemExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int insert(ModelResultHitItem record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int insertSelective(ModelResultHitItem record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    List<ModelResultHitItem> selectByExample(ModelResultHitItemExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    ModelResultHitItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByExampleSelective(@Param("record") ModelResultHitItem record, @Param("example") ModelResultHitItemExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByExample(@Param("record") ModelResultHitItem record, @Param("example") ModelResultHitItemExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByPrimaryKeySelective(ModelResultHitItem record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByPrimaryKey(ModelResultHitItem record);
}