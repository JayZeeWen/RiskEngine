package com.engine.dao;

import com.engine.model.ModleDecisionGroup;
import com.engine.model.ModleDecisionGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModleDecisionGroupMapper {
    /**
     *
     * @mbggenerated 2019-08-02
     */
    int countByExample(ModleDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByExample(ModleDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insert(ModleDecisionGroup record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insertSelective(ModleDecisionGroup record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModleDecisionGroup> selectByExample(ModleDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    ModleDecisionGroup selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleSelective(@Param("record") ModleDecisionGroup record, @Param("example") ModleDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExample(@Param("record") ModleDecisionGroup record, @Param("example") ModleDecisionGroupExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeySelective(ModleDecisionGroup record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKey(ModleDecisionGroup record);
}