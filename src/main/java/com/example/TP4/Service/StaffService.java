package com.example.TP4.Service;

import com.example.TP4.Entity.Staff;

import java.util.List;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);

}
