package com.engine.dao;

import com.engine.model.ModleGroupItem;
import com.engine.model.ModleGroupItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModleGroupItemMapper {
    /**
     *
     * @mbggenerated 2019-08-02
     */
    int countByExample(ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByExample(ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insert(ModleGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insertSelective(ModleGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModleGroupItem> selectByExampleWithBLOBs(ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModleGroupItem> selectByExample(ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    ModleGroupItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleSelective(@Param("record") ModleGroupItem record, @Param("example") ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleWithBLOBs(@Param("record") ModleGroupItem record, @Param("example") ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExample(@Param("record") ModleGroupItem record, @Param("example") ModleGroupItemExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeySelective(ModleGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeyWithBLOBs(ModleGroupItem record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKey(ModleGroupItem record);
}