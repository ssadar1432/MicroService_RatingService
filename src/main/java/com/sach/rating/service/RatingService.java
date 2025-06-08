package com.sach.rating.service;

import com.sach.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //Create rating

    public Rating addRating(Rating rate);

    public Rating getRating(int id);

    public List<Rating> getAllRating();

    public List<Rating> getRatingByHotelID(int hotelId);

    Rating deleteRating(int id);

    Rating updateRating(Rating rating);

    List<Rating> getRatingByUserID(int userId);
}
