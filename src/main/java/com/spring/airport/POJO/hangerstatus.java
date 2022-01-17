package com.spring.airport.POJO;




    public class hangerstatus {
        private String hangerNumber;
        private String hangerLocation;
        private String fromdate;
        private String todate;
        private int planeNo;
        private String status;

        public hangerstatus(){}

        @Override
        public String toString() {
            return "hangerstatus{" +
                    "hangerNumber='" + hangerNumber + '\'' +
                    ", hangerLocation='" + hangerLocation + '\'' +
                    ", fromdate='" + fromdate + '\'' +
                    ", todate='" + todate + '\'' +
                    ", planeNo=" + planeNo +
                    ", status='" + status + '\'' +
                    '}';
        }



        public hangerstatus(String hangerNumber, String hangerLocation, String fromdate, String todate, int planeNo, String status) {
            this.hangerNumber = hangerNumber;
            this.hangerLocation = hangerLocation;
            this.fromdate = fromdate;
            this.todate = todate;
            this.planeNo = planeNo;
            this.status = status;
        }
        public String getHangerNumber() {
            return hangerNumber;
        }

        public void setHangerNumber(String hangerNumber) {
            this.hangerNumber = hangerNumber;
        }

        public String getHangerLocation() {
            return hangerLocation;
        }

        public void setHangerLocation(String hangerLocation) {
            this.hangerLocation = hangerLocation;
        }

        public String getFromdate() {
            return fromdate;
        }

        public void setFromdate(String fromdate) {
            this.fromdate = fromdate;
        }

        public String getTodate() {
            return todate;
        }

        public void setTodate(String todate) {
            this.todate = todate;
        }

        public int getPlaneNo() {
            return planeNo;
        }

        public void setPlaneNo(int planeNo) {
            this.planeNo = planeNo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }


    }


