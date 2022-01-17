package com.spring.airport.Dao;
import com.spring.airport.POJO.AddPlanes;

import org.springframework.jdbc.core.JdbcTemplate;
public class AddPlanesImpl {
    JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
    public String SavePlanes(AddPlanes AP) {
        String query = "Insert into AddPlanes values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(query, AP.getMfgName(), AP.getRegNo(), AP.getModelNo(), AP.getPlaneNo(), AP.getPlaneName(), AP.getCapacity(), AP.getEmail(), AP.getHouseNo(), AP.getAddress(), AP.getCity(), AP.getState(), AP.getCountry(), AP.getPinNo());
        return "1 row inserted";
    }

}
