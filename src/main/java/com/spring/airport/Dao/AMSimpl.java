package com.spring.airport.Dao;


import com.spring.airport.POJO.AMSystem;
import com.spring.airport.POJO.LoginPage;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AMSimpl {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public String SaveEmp(AMSystem E) {
        String query = "Insert into  AirportMSystem values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int R = jdbcTemplate.update(query, E.getPilotName(), E.getLicense(), E.getSSN(), E.getDob(),
                E.getGender(), E.getMobileNo(), E.getEmail(), E.getAddress(), E.getAddressLine1(),
                E.getCity(), E.getState(), E.getCountry(), E.getPinNo(), E.getUID(),E.getAdreesId());
        return R + "row inserted";
    }

    /*public List<LoginPage> dologin(String username) {
        String query = "Select * from login where username=?, password=?, usertype=?";
        List<Map<String, Object>> LM = getJdbcTemplate().queryForList(query, new Object[]{username});
        List<LoginPage> L = new ArrayList<LoginPage>();
        LoginPage E = null;
        for (Map<String, Object> m : LM) {
            E = new LoginPage();
            E.setUsername((String) m.get("username"));
            E.setPassword((String) m.get("password"));
            E.setUsertype((String) m.get("usertype"));
        }
        return L;


    }*/
    public List<LoginPage> validateUser(LoginPage login) {

        String sql = "select * from login where username= ? and password=? ";

       /* List<LoginPage> users = jdbcTemplate.query(sql, new UserMapper());

        return users.size() > 0 ? users.get(0) : null;*/
        List<Map<String, Object>> LM= getJdbcTemplate().queryForList(sql,login.getUsername(),login.getPassword());
        List<LoginPage> L = new ArrayList<LoginPage>();
        LoginPage H= null;
        // System.out.println(LM);
        try {
            for (Map<String, Object> m : LM) {
                H=new LoginPage();
                H.setUsername((String)m.get("username"));
                H.setPassword((String) m.get("password"));
                H.setUsertype((String) m.get("usertype"));
                L.add(H);
                System.out.println(L.get(0).getUsertype());
            }
        } catch (Exception e) {

        }
        return L;
    }


}