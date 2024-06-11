package com.project.MusicStore.repository;

import com.project.MusicStore.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrdersRepository extends JpaRepository<Orders,Long> {

}
