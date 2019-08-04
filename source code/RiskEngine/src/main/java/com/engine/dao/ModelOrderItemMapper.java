package com.engine.dao;

import com.engine.model.ModelOrderItem;
import com.engine.model.ModelOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelOrderItemMapper {
    /**
     *
     * @mbggenerated 2019-08-04
     */
    int countByExample(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int deleteByExample(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int insert(ModelOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int insertSelective(ModelOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    List<ModelOrderItem> selectByExampleWithBLOBs(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    List<ModelOrderItem> selectByExample(ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    ModelOrderItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExampleSelective(@Param("record") ModelOrderItem record, @Param("example") ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExampleWithBLOBs(@Param("record") ModelOrderItem record, @Param("example") ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExample(@Param("record") ModelOrderItem record, @Param("example") ModelOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKeySelective(ModelOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKeyWithBLOBs(ModelOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKey(ModelOrderItem record);
}