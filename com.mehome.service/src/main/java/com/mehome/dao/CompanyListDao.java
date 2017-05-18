package com.mehome.dao;

import com.mehome.domain.CompanyList;
import com.mehome.requestDTO.CompanyDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyListDao {
    int delete(Integer companyId);

    int insert(CompanyList record);

    int insertRequired(CompanyList record);

    CompanyList selectById(Integer companyId);

    int updateRequired(CompanyList record);

    int update(CompanyList record);

    List<String> listIdsByName(@Param("name") String name);

    List<CompanyList> listByCondition(CompanyDTO companyDTO);

    Long countByCondition(CompanyDTO companyDTO);
}