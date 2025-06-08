package com.sach.rating.Exception;

public class RatingNotFoundException extends RuntimeException {
    public RatingNotFoundException(String s) {
        super("Rating Not Found !!");
    }

}
