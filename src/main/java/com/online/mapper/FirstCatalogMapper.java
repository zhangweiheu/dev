package com.online.mapper;

import com.online.model.FirstCatalog;
import com.online.model.FirstCatalogCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstCatalogMapper {
    int countByCondition(FirstCatalogCondition example);

    int deleteByCondition(FirstCatalogCondition example);

    int deleteById(Integer id);

    int insert(FirstCatalog record);

    int insertSelective(FirstCatalog record);

    List<FirstCatalog> selectByCondition(FirstCatalogCondition example);

    FirstCatalog selectById(Integer id);

    int updateByConditionSelective(@Param("record") FirstCatalog record, @Param("example") FirstCatalogCondition example);

    int updateByCondition(@Param("record") FirstCatalog record, @Param("example") FirstCatalogCondition example);

    int updateByIdSelective(FirstCatalog record);

    int updateById(FirstCatalog record);
}