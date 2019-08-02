package com.engine.dao;

import com.engine.model.ModleOrderItem;
import com.engine.model.ModleOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModleOrderItemMapper {
    /**
     *
     * @mbggenerated 2019-08-02
     */
    int countByExample(ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByExample(ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insert(ModleOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insertSelective(ModleOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModleOrderItem> selectByExampleWithBLOBs(ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModleOrderItem> selectByExample(ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    ModleOrderItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleSelective(@Param("record") ModleOrderItem record, @Param("example") ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleWithBLOBs(@Param("record") ModleOrderItem record, @Param("example") ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExample(@Param("record") ModleOrderItem record, @Param("example") ModleOrderItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeySelective(ModleOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeyWithBLOBs(ModleOrderItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKey(ModleOrderItem record);
}