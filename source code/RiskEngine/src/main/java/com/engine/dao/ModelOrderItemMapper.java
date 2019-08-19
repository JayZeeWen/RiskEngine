package com.engine.dao;

import com.engine.model.ModelOrderItem;
import com.engine.model.ModelOrderItemExample;
import com.engine.model.ModelOrderItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelOrderItemMapper {
    /**
     *
     * @mbggenerated 2019-08-15
     */
    int countByExample(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int deleteByExample(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int insert(ModelOrderItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int insertSelective(ModelOrderItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    List<ModelOrderItemWithBLOBs> selectByExampleWithBLOBs(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    List<ModelOrderItem> selectByExample(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    ModelOrderItemWithBLOBs selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByExampleSelective(@Param("record") ModelOrderItemWithBLOBs record, @Param("example") ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByExampleWithBLOBs(@Param("record") ModelOrderItemWithBLOBs record, @Param("example") ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByExample(@Param("record") ModelOrderItem record, @Param("example") ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByPrimaryKeySelective(ModelOrderItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByPrimaryKeyWithBLOBs(ModelOrderItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByPrimaryKey(ModelOrderItem record);
}