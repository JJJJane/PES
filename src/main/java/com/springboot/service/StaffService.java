package com.springboot.service;
import com.springboot.mapper.StaffMapper;
import com.springboot.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StaffService implements StaffMapper{

    private StaffMapper staffMapper;
    @Autowired
    public StaffService(StaffMapper staffMapper) {
        this.staffMapper = staffMapper;
    }

    @Override
    public Staff staffLogin(String username,String password) {
        return staffMapper.staffLogin(username,password);
    }
}
