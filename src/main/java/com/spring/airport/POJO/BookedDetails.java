package com.spring.airport.POJO;

import java.util.Date;

public class BookedDetails {

    int bookNo;
   Date Fromdate;
   Date Todate;
    int hangerNumber;
public BookedDetails(){}
    public BookedDetails(int bookNo, Date fromdate, Date todate, int hangerNumber) {
        this.bookNo = bookNo;
        Fromdate = fromdate;
        Todate = todate;
        this.hangerNumber = hangerNumber;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public Date getFromdate() {
        return Fromdate;
    }

    public void setFromdate(Date fromdate) {
        Fromdate = fromdate;
    }

    public Date getTodate() {
        return Todate;
    }

    public void setTodate(Date todate) {
        Todate = todate;
    }

    public int getHangerNumber() {
        return hangerNumber;
    }

    public void setHangerNumber(int hangerNumber) {
        this.hangerNumber = hangerNumber;
    }
}
