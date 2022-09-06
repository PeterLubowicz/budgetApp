package com.salem.budgetApp.mappers;

import com.salem.budgetApp.repositories.entities.PropertyEntity;
import com.salem.budgetApp.repositories.entities.RoomsEntity;
import com.salem.budgetApp.repositories.entities.UserEntity;
import com.salem.budgetApp.services.dtos.PropertyDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertyMapper {

    PropertyDto fromEntityToDto(PropertyEntity entity);

    @Mapping(source = "dto.id", target = "id")
    @Mapping(target = "sold", expression = "java(false)")
    PropertyEntity fromDtoToEntity(PropertyDto dto,
                                   UserEntity user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "rooms", source = "rooms")
    void updateEntityByDto(@MappingTarget PropertyEntity entity,
                           PropertyDto dto,
                           List<RoomsEntity> rooms);


}
