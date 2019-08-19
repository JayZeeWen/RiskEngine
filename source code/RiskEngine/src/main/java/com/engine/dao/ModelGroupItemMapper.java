package com.engine.dao;

import com.engine.model.ModelGroupItem;
import com.engine.model.ModelGroupItemExample;
import com.engine.model.ModelGroupItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelGroupItemMapper {
    /**
     *
     * @mbggenerated 2019-08-15
     */
    int countByExample(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int deleteByExample(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int insert(ModelGroupItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int insertSelective(ModelGroupItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    List<ModelGroupItemWithBLOBs> selectByExampleWithBLOBs(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    List<ModelGroupItem> selectByExample(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    ModelGroupItemWithBLOBs selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByExampleSelective(@Param("record") ModelGroupItemWithBLOBs record, @Param("example") ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByExampleWithBLOBs(@Param("record") ModelGroupItemWithBLOBs record, @Param("example") ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByExample(@Param("record") ModelGroupItem record, @Param("example") ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByPrimaryKeySelective(ModelGroupItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByPrimaryKeyWithBLOBs(ModelGroupItemWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-15
     */
    int updateByPrimaryKey(ModelGroupItem record);
}