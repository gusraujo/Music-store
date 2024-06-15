package com.project.MusicStore.persistence.repository;

import com.project.MusicStore.persistence.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrdersRepository extends JpaRepository<Orders,Long> {

}
