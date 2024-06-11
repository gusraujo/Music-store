package com.project.MusicStore.repository;

import com.project.MusicStore.model.Cart;
import com.project.MusicStore.repository.utils.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CartRepository extends GenericRepository<Cart,Long> {

}
