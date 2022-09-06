package com.salem.budgetApp.repositories;

import com.salem.budgetApp.repositories.entities.PropertyEntity;
import com.salem.budgetApp.repositories.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PropertyRepository extends JpaRepository<PropertyEntity, UUID> {
    @Query("SELECT e FROM PropertyEntity  e WHERE e.user = :user AND e.sold = :isSold")
    List<PropertyEntity> findAllByUser(UserEntity user, boolean isSold);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE PropertyEntity e SET e.sold=true WHERE e.user = :user AND e.id = :id")
    void setSoldProperty(UserEntity user, UUID id);

}
