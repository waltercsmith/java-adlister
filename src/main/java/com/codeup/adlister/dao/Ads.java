package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);

    Long update(Ad ad); //<--- update an existing ad
    void destroy(Ad ad); //<--- remove an ad

    void delete(Long id);
}
