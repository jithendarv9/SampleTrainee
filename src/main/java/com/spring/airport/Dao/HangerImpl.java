package com.spring.airport.Dao;

import com.spring.airport.POJO.AddPlanes;
import com.spring.airport.POJO.BookedDetails;
import com.spring.airport.POJO.HangerDetails;
import com.spring.airport.POJO.hangerstatus;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class HangerImpl {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String SaveHanger(HangerDetails H) {

        int R=0;
        try {
            SimpleDateFormat S = new SimpleDateFormat("yyyy-MM-dd");
            String Dt = S.format(H.getDob());
            System.out.println(Dt);
            String query = "Insert into HangerDetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            R = jdbcTemplate.update(query, H.getHangerLocation(), H.getHangerNumber(), H.getHangerCapacity(), H.getAvailableCapacity(), H.getManagerName(), H.getSocialSecurityNo(), Dt, H.getGender(), H.getMobileNo(), H.getEmail(), H.getHouseNo(), H.getAddress(), H.getCity(), H.getState(), H.getCountry(), H.getPinNo(),H.getAddressId(),H.getManagerId());

        } catch (Exception e) {
            return e.getMessage();
        }
        return R + "row Added";
    }


    public List<HangerDetails> SeachHanger1(Date dt1,Date dt2) {
        //String query = "select * from HangerDetails inner join BookedDetails on  HangerDetails.hangerNumber=BookedDetails.hangerNumber where \"dt1\" not between Fromdate and Todate and \"dt2\" not between Fromdate and Todate;";


        String query="select H.Hangernumber,  HangerCapacity,hangerCapacity-cnt as available from Hangerdetails H inner join  (select hangerNumber,count(*) cnt from Bookeddetails where  (?  between Fromdate and Todate) or\n" +
                "(?   between Fromdate and Todate) group by hangernumber ) Vw on H.HangerNumber=Vw.HangerNumber and hangercapacity>cnt\n";


        List<Map<String, Object>> LM= getJdbcTemplate().queryForList(query,dt1,dt2);
        System.out.println(LM);
        List<HangerDetails> L = new ArrayList<HangerDetails>();
        HangerDetails H= null;

        SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd");
        try {
            for (Map<String, Object> m : LM) {
                H=new HangerDetails();

                H.setHangerNumber((String)m.get("hangerNumber"));

                H.setHangerCapacity((Integer) m.get("hangerCapacity"));

                L.add(H);
                 System.out.println(L);

            }
        } catch (Exception e) {

        }
        return L;
    }

    public List<AddPlanes> getPlaneNo() {
        String query = "select planeNo from AddPlanes";

        List<Map<String, Object>> LM = getJdbcTemplate().queryForList(query);
        List<AddPlanes> L = new ArrayList<AddPlanes>();
        AddPlanes H= null;

        SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd");
        try {
            for (Map<String, Object> m : LM) {
                H=new AddPlanes();

                H.setPlaneNo((Integer) m.get("planeNo"));

                L.add(H);


            }
        } catch (Exception e) {

        }
        return L;
    }

    public String SaveBooked(int n1, int n2, Date dt, Date dt1, BookedDetails B) {
        int R=0;
        try {



            String query = "Insert into BookedDetails values(?,?,?,?,?)";
            R = jdbcTemplate.update(query,B.getHangerNumber(),dt,dt1,n1,n2);

           if(R==1)
           {
               String query1 ="update HangerDetails set availableCapacity=availableCapacity-1 where hangerNumber=?";
              int R1= jdbcTemplate.update(query1,n1);
              System.out.println(R1);

           }

        } catch (Exception e) {
            return e.getMessage();
        }
        return  "Hanger Booked Successfully";
    }
    public List<HangerDetails> gethangernumber(){
        String query = "select hangerNumber from HangerDetails";

        List<Map<String, Object>> LM = getJdbcTemplate().queryForList(query);
        List<HangerDetails> L = new ArrayList<HangerDetails>();
        HangerDetails H= null;

        SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd");
        try {
            for (Map<String, Object> m : LM) {
                H=new HangerDetails();

                H.setHangerNumber((String)m.get("hangerNumber"));

                L.add(H);


            }
        } catch (Exception e) {

        }
        return L;
    }//gethangernumber close
    public hangerstatus gethangerstatus(String hno, String fromdate, String todate) throws ParseException {
        final String hno1=hno;
        final String fromdate1=fromdate;
        final String todate1=todate;
        return jdbcTemplate.query("select BookedDetails.HangerNumber,BookedDetails.Fromdate,BookedDetails.Todate,BookedDetails.planeNo,HangerDetails.HangerLocation from BookedDetails,HangerDetails where BookedDetails.hangerNumber="+hno+" and HangerDetails.hangerNumber="+hno+" and  BookedDetails.Fromdate<="+"'"+fromdate +"'" +"and BookedDetails.Todate>="+"'"+todate+"'",new ResultSetExtractor<hangerstatus>(){

            public hangerstatus extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                hangerstatus hs=new hangerstatus();
                SimpleDateFormat F= new SimpleDateFormat("dd-MM-yyyy");

                if(rs.next()){
                    hs.setHangerNumber(rs.getString(1));
                    hs.setFromdate(F.format(rs.getDate(2)));
                    hs.setTodate(F.format(rs.getDate(3)));
                    hs.setPlaneNo(rs.getInt(4));
                    hs.setHangerLocation(rs.getString(5));
                    hs.setStatus("Booked");
                    return hs;
                }
                else{

                    String sql="select HangerLocation from HangerDetails where HangerNumber="+hno1;
                    String location= jdbcTemplate.queryForObject(sql,String.class);
                    hs.setHangerNumber(hno1);
                    hs.setFromdate(fromdate1);
                    hs.setTodate(todate1);
                    hs.setHangerLocation(location);
                    hs.setStatus("Available");

                    return hs;
                }

            }
        });
    }//hangerstatus metho


}