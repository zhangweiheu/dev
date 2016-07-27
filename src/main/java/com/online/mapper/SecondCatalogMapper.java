package com.online.mapper;

import com.online.model.SecondCatalog;
import com.online.model.SecondCatalogCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondCatalogMapper {
    int countByCondition(SecondCatalogCondition example);

    int deleteByCondition(SecondCatalogCondition example);

    int deleteById(Integer id);

    int insert(SecondCatalog record);

    int insertSelective(SecondCatalog record);

    List<SecondCatalog> selectByCondition(SecondCatalogCondition example);

    SecondCatalog selectById(Integer id);

    int updateByConditionSelective(@Param("record") SecondCatalog record, @Param("example") SecondCatalogCondition example);

    int updateByCondition(@Param("record") SecondCatalog record, @Param("example") SecondCatalogCondition example);

    int updateByIdSelective(SecondCatalog record);

    int updateById(SecondCatalog record);
}