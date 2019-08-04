package com.engine.dao;

import com.engine.model.ModelDecisionGroup;
import com.engine.model.ModelDecisionGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelDecisionGroupMapper {
    /**
     *
     * @mbggenerated 2019-08-04
     */
    int countByExample(ModelDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int deleteByExample(ModelDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int insert(ModelDecisionGroup record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int insertSelective(ModelDecisionGroup record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    List<ModelDecisionGroup> selectByExample(ModelDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    ModelDecisionGroup selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExampleSelective(@Param("record") ModelDecisionGroup record, @Param("example") ModelDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExample(@Param("record") ModelDecisionGroup record, @Param("example") ModelDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKeySelective(ModelDecisionGroup record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKey(ModelDecisionGroup record);
}