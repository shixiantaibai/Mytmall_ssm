package com.service;

import com.pojo.Property;

import java.util.List;

public interface PropertyService {
    void add(Property p);
    void delete(int id);
    void update(Property p);
    Property get(int id);
    List list(int cid);
}
