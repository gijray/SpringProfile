package com.profiles.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

	@Autowired
    private String value;

    public String getValue() {
        return this.value;
    }
}