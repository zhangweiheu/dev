package com.online.mapper;

import com.online.model.CommodityList;
import com.online.model.CommodityListCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityListMapper {
    int countByCondition(CommodityListCondition example);

    int deleteByCondition(CommodityListCondition example);

    int deleteById(Long id);

    int insert(CommodityList record);

    int insertSelective(CommodityList record);

    List<CommodityList> selectByCondition(CommodityListCondition example);

    CommodityList selectById(Long id);

    int updateByConditionSelective(@Param("record") CommodityList record, @Param("example") CommodityListCondition example);

    int updateByCondition(@Param("record") CommodityList record, @Param("example") CommodityListCondition example);

    int updateByIdSelective(CommodityList record);

    int updateById(CommodityList record);
}