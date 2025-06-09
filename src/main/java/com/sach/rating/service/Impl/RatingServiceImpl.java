package com.sach.rating.service.Impl;

import com.sach.rating.Exception.RatingNotFoundException;
import com.sach.rating.entities.Rating;
import com.sach.rating.repositories.RatingRepo;
import com.sach.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
   private RatingRepo ratingRepo;
    @Override
    public Rating addRating(Rating rate) {

        return   ratingRepo.save(rate);
    }

    @Override
    public Rating getRating(int id) {


     return ratingRepo.findById(id).orElseThrow(()->new RatingNotFoundException("Rating is not Present With Given ID"));
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByHotelID(int hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }

    @Override
    public Rating deleteRating(int id) {
        return null;
    }

    @Override
    public Rating updateRating(Rating rating) {
        return null;
    }

    @Override
    public List<Rating> getRatingByUserID(int userId) {
        return ratingRepo.findByUserId(userId);
    }
}
