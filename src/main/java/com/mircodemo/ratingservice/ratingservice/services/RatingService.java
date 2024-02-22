package com.mircodemo.ratingservice.ratingservice.services;

import com.mircodemo.ratingservice.ratingservice.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);
    List<Rating> getRatings();
    List<Rating> getRatingsByHotelId(String hotelId);
    List<Rating> getRatingsByUserId(String userId);

}
