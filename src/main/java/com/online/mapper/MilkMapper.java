package com.online.mapper;

import com.online.model.Milk;
import com.online.model.MilkCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MilkMapper {
    int countByCondition(MilkCondition example);

    int deleteByCondition(MilkCondition example);

    int deleteById(Long id);

    int insert(Milk record);

    int insertSelective(Milk record);

    List<Milk> selectByConditionWithBLOBs(MilkCondition example);

    List<Milk> selectByCondition(MilkCondition example);

    Milk selectById(Long id);

    int updateByConditionSelective(@Param("record") Milk record, @Param("example") MilkCondition example);

    int updateByConditionWithBLOBs(@Param("record") Milk record, @Param("example") MilkCondition example);

    int updateByCondition(@Param("record") Milk record, @Param("example") MilkCondition example);

    int updateByIdSelective(Milk record);

    int updateByIdWithBLOBs(Milk record);

    int updateById(Milk record);
}