package com.engine.dao;

import com.engine.model.ModelItem;
import com.engine.model.ModelItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelItemMapper {
    /**
     *
     * @mbggenerated 2019-08-02
     */
    int countByExample(ModelItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByExample(ModelItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insert(ModelItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insertSelective(ModelItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModelItem> selectByExample(ModelItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    ModelItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleSelective(@Param("record") ModelItem record, @Param("example") ModelItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExample(@Param("record") ModelItem record, @Param("example") ModelItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeySelective(ModelItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKey(ModelItem record);
}