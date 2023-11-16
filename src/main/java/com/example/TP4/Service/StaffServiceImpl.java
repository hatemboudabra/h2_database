package com.example.TP4.Service;

import com.example.TP4.Entity.Staff;
import com.example.TP4.Repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    StaffRepo staffRepo;

    @Override
    public void save(Staff staff) {
        if (staff.getId() == null) {
            staffRepo.save(staff);
        } else {
            Staff staffUpdate =
                    staffRepo.findById(staff.getId()).get();
            staffUpdate.setName(staff.getName());
            staffUpdate.setDesgn(staff.getDesgn());
            staffUpdate.setEmailId(staff.getEmailId());
            staffRepo.save(staffUpdate);
        }
    }
    @Override
    public List<Staff> getAll() {
        return staffRepo.findAll();
    }

    @Override
    public Staff getById(Integer id) {
        return staffRepo.findById(id).get();
    }

    @Override
    public void delete(Staff staff) {
        staffRepo.delete(staff);
    }
}
