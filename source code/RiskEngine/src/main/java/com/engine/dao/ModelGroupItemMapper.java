package com.engine.dao;

import com.engine.model.ModelGroupItem;
import com.engine.model.ModelGroupItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelGroupItemMapper {
    /**
     *
     * @mbggenerated 2019-08-04
     */
    int countByExample(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int deleteByExample(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int insert(ModelGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int insertSelective(ModelGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    List<ModelGroupItem> selectByExampleWithBLOBs(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    List<ModelGroupItem> selectByExample(ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    ModelGroupItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExampleSelective(@Param("record") ModelGroupItem record, @Param("example") ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExampleWithBLOBs(@Param("record") ModelGroupItem record, @Param("example") ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByExample(@Param("record") ModelGroupItem record, @Param("example") ModelGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKeySelective(ModelGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKeyWithBLOBs(ModelGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-04
     */
    int updateByPrimaryKey(ModelGroupItem record);
}