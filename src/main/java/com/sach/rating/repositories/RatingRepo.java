package com.sach.rating.repositories;

import com.sach.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer> {

    List<Rating> findByUserID(int id);
    List<Rating> findByHotelId(int id);
}
