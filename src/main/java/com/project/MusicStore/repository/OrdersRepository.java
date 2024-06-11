package com.project.MusicStore.repository;

import com.project.MusicStore.repository.utils.GenericRepository;
import org.springframework.stereotype.Repository;
import com.project.MusicStore.model.Orders;

@Repository
interface OrdersRepository extends GenericRepository<Orders,Long> {

}
