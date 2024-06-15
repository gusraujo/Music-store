package com.project.MusicStore.persistence.repository;

import com.project.MusicStore.persistence.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CartRepository extends JpaRepository<Cart,Long> {

}
