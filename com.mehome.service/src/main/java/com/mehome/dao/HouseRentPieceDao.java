package com.mehome.dao;

import com.mehome.domain.HouseRentPiece;
import com.mehome.requestDTO.HouseRentPieceDTO;

import java.util.List;

public interface HouseRentPieceDao {
    int delete(Long autoId);

    int insertRequired(HouseRentPiece record);

    HouseRentPiece selectById(Long autoId);

    int updateRequired(HouseRentPiece record);

    List<HouseRentPiece> listByCondition(HouseRentPieceDTO houseRentPieceDTO);

    Long countByCondition(HouseRentPieceDTO houseRentPieceDTO);

}