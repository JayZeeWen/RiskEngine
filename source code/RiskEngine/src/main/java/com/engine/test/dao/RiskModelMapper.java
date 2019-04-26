package com.engine.test.dao;

import com.engine.test.model.RiskModel;
import com.engine.test.model.RiskModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskModelMapper {
    /**
     *
     * @mbggenerated 2019-04-26
     */
    int countByExample(RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int deleteByExample(RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int insert(RiskModel record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int insertSelective(RiskModel record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    List<RiskModel> selectByExampleWithBLOBs(RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    List<RiskModel> selectByExample(RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    RiskModel selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByExampleSelective(@Param("record") RiskModel record, @Param("example") RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByExampleWithBLOBs(@Param("record") RiskModel record, @Param("example") RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByExample(@Param("record") RiskModel record, @Param("example") RiskModelExample example);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByPrimaryKeySelective(RiskModel record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByPrimaryKeyWithBLOBs(RiskModel record);

    /**
     *
     * @mbggenerated 2019-04-26
     */
    int updateByPrimaryKey(RiskModel record);
}