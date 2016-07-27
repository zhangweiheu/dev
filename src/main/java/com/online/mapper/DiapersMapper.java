package com.online.mapper;

import com.online.model.Diapers;
import com.online.model.DiapersCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiapersMapper {
    int countByCondition(DiapersCondition example);

    int deleteByCondition(DiapersCondition example);

    int deleteById(Long id);

    int insert(Diapers record);

    int insertSelective(Diapers record);

    List<Diapers> selectByConditionWithBLOBs(DiapersCondition example);

    List<Diapers> selectByCondition(DiapersCondition example);

    Diapers selectById(Long id);

    int updateByConditionSelective(@Param("record") Diapers record, @Param("example") DiapersCondition example);

    int updateByConditionWithBLOBs(@Param("record") Diapers record, @Param("example") DiapersCondition example);

    int updateByCondition(@Param("record") Diapers record, @Param("example") DiapersCondition example);

    int updateByIdSelective(Diapers record);

    int updateByIdWithBLOBs(Diapers record);

    int updateById(Diapers record);
}