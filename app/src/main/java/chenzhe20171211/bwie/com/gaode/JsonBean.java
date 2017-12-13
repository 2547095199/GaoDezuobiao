package chenzhe20171211.bwie.com.gaode;

import java.util.List;

/**
 * Created by peng on 2017/12/13.
 */

public class JsonBean {

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 230
         * site_name : 陶强——服务中心
         * address : 陶强——服务中心
         * lat : 30.649
         * lng : 110.5117
         * merchantId : 1
         * isNightReturnCar : 0
         * isNightGetCar : 0
         * startTimeForWork : 06:00
         * endTimeForWork : 23:59
         * allow : 0
         * distance : 11971824
         * useable : 1
         * chargeNum : 0
         * parkingNum : 0
         */

        private int id;
        private String site_name;
        private String address;
        private double lat;
        private double lng;
        private int merchantId;
        private int isNightReturnCar;
        private int isNightGetCar;
        private String startTimeForWork;
        private String endTimeForWork;
        private int allow;
        private int distance;
        private int useable;
        private int chargeNum;
        private int parkingNum;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSite_name() {
            return site_name;
        }

        public void setSite_name(String site_name) {
            this.site_name = site_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public int getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(int merchantId) {
            this.merchantId = merchantId;
        }

        public int getIsNightReturnCar() {
            return isNightReturnCar;
        }

        public void setIsNightReturnCar(int isNightReturnCar) {
            this.isNightReturnCar = isNightReturnCar;
        }

        public int getIsNightGetCar() {
            return isNightGetCar;
        }

        public void setIsNightGetCar(int isNightGetCar) {
            this.isNightGetCar = isNightGetCar;
        }

        public String getStartTimeForWork() {
            return startTimeForWork;
        }

        public void setStartTimeForWork(String startTimeForWork) {
            this.startTimeForWork = startTimeForWork;
        }

        public String getEndTimeForWork() {
            return endTimeForWork;
        }

        public void setEndTimeForWork(String endTimeForWork) {
            this.endTimeForWork = endTimeForWork;
        }

        public int getAllow() {
            return allow;
        }

        public void setAllow(int allow) {
            this.allow = allow;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getUseable() {
            return useable;
        }

        public void setUseable(int useable) {
            this.useable = useable;
        }

        public int getChargeNum() {
            return chargeNum;
        }

        public void setChargeNum(int chargeNum) {
            this.chargeNum = chargeNum;
        }

        public int getParkingNum() {
            return parkingNum;
        }

        public void setParkingNum(int parkingNum) {
            this.parkingNum = parkingNum;
        }
    }
}
