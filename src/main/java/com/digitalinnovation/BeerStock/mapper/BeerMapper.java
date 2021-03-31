package com.digitalinnovation.BeerStock.mapper;

import com.digitalinnovation.BeerStock.DTO.BeerDTO;
import com.digitalinnovation.BeerStock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}