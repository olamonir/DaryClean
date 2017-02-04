package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/20/2017.
 */

public class UserInfo  {

    /**
     * success : 1
     * data : {"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50","addresses":[{"id":3,"user_id":34,"address":"Block3 St.5, Building 10 Flat 32","province_id":1,"area_id":1,"block":"5","street":"5","gada":"5","qasima":"5","building":"5","floor":"5","flat_house":"5","notes":"sgsdgsg","created_at":"2017-01-09 07:30:00","updated_at":"2017-01-09 07:30:00"},{"id":4,"user_id":34,"address":"Ay 7aga","province_id":1,"area_id":4,"block":"3","street":"5","gada":"","qasima":"","building":"10","floor":"5","flat_house":"22","notes":"3nd 3m Mahmoud","created_at":"2017-01-17 21:22:01","updated_at":"2017-01-17 21:22:01"}],"payments":[],"notifications":[],"my_favs":[{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"open","minimum_charges":1.5,"delivery_cost":0.4,"delivery_time":24,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sdgsdg","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"5.0000","shop_id":2}],"faved":true,"link":"http://ghasala.nasmedia.net/shop/view/2","pivot":{"user_id":34,"shop_id":2}}]}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int success;
        /**
         * id : 34
         * avatar :
         * name :
         * username : jjj
         * email : email@example.com
         * phone : 66991985
         * country_id : 120
         * isAdmin : 0
         * role_id : 1
         * remember_token :
         * active : 1
         * created_at : 2016-12-04 16:13:23
         * updated_at : 2016-12-04 16:19:50
         * addresses : [{"id":3,"user_id":34,"address":"Block3 St.5, Building 10 Flat 32","province_id":1,"area_id":1,"block":"5","street":"5","gada":"5","qasima":"5","building":"5","floor":"5","flat_house":"5","notes":"sgsdgsg","created_at":"2017-01-09 07:30:00","updated_at":"2017-01-09 07:30:00"},{"id":4,"user_id":34,"address":"Ay 7aga","province_id":1,"area_id":4,"block":"3","street":"5","gada":"","qasima":"","building":"10","floor":"5","flat_house":"22","notes":"3nd 3m Mahmoud","created_at":"2017-01-17 21:22:01","updated_at":"2017-01-17 21:22:01"}]
         * payments : []
         * notifications : []
         * my_favs : [{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"open","minimum_charges":1.5,"delivery_cost":0.4,"delivery_time":24,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sdgsdg","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"5.0000","shop_id":2}],"faved":true,"link":"http://ghasala.nasmedia.net/shop/view/2","pivot":{"user_id":34,"shop_id":2}}]
         */

        private DataBean data;

        public int getSuccess() {
            return success;
        }

        public void setSuccess(int success) {
            this.success = success;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            private int id;
            private String avatar;
            private String name;
            private String username;
            private String email;
            private String phone;
            private int country_id;
            private int isAdmin;
            private int role_id;
            private String remember_token;
            private int active;
            private String created_at;
            private String updated_at;
            /**
             * id : 3
             * user_id : 34
             * address : Block3 St.5, Building 10 Flat 32
             * province_id : 1
             * area_id : 1
             * block : 5
             * street : 5
             * gada : 5
             * qasima : 5
             * building : 5
             * floor : 5
             * flat_house : 5
             * notes : sgsdgsg
             * created_at : 2017-01-09 07:30:00
             * updated_at : 2017-01-09 07:30:00
             */

            private List<AddressesBean> addresses;
            private List<?> payments;
            private List<?> notifications;
            /**
             * id : 2
             * logo : 2017-01-09-08-39-01-b2410.jpeg
             * titleAr : مصبغة
             * titleEn : Lundry
             * detailsAr : اتلات
             * detailsEn : sgsg
             * status : open
             * minimum_charges : 1.5
             * delivery_cost : 0.4
             * delivery_time : 24
             * open_at : 07:00:00
             * close_at : 20:00:00
             * user_id : 22
             * province_id : 1
             * area_id : 1
             * block : 3
             * notes : sdgsdg
             * created_at : 2017-01-09 08:40:01
             * updated_at : 2017-01-09 08:40:01
             * avg_rating : [{"aggregate":"5.0000","shop_id":2}]
             * faved : true
             * link : http://ghasala.nasmedia.net/shop/view/2
             * pivot : {"user_id":34,"shop_id":2}
             */

            private List<MyFavsBean> my_favs;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getCountry_id() {
                return country_id;
            }

            public void setCountry_id(int country_id) {
                this.country_id = country_id;
            }

            public int getIsAdmin() {
                return isAdmin;
            }

            public void setIsAdmin(int isAdmin) {
                this.isAdmin = isAdmin;
            }

            public int getRole_id() {
                return role_id;
            }

            public void setRole_id(int role_id) {
                this.role_id = role_id;
            }

            public String getRemember_token() {
                return remember_token;
            }

            public void setRemember_token(String remember_token) {
                this.remember_token = remember_token;
            }

            public int getActive() {
                return active;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public List<AddressesBean> getAddresses() {
                return addresses;
            }

            public void setAddresses(List<AddressesBean> addresses) {
                this.addresses = addresses;
            }

            public List<?> getPayments() {
                return payments;
            }

            public void setPayments(List<?> payments) {
                this.payments = payments;
            }

            public List<?> getNotifications() {
                return notifications;
            }

            public void setNotifications(List<?> notifications) {
                this.notifications = notifications;
            }

            public List<MyFavsBean> getMy_favs() {
                return my_favs;
            }

            public void setMy_favs(List<MyFavsBean> my_favs) {
                this.my_favs = my_favs;
            }

            public static class AddressesBean {
                private int id;
                private int user_id;
                private String address;
                private int province_id;
                private int area_id;
                private String block;
                private String street;
                private String gada;
                private String qasima;
                private String building;
                private String floor;
                private String flat_house;
                private String notes;
                private String created_at;
                private String updated_at;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public int getProvince_id() {
                    return province_id;
                }

                public void setProvince_id(int province_id) {
                    this.province_id = province_id;
                }

                public int getArea_id() {
                    return area_id;
                }

                public void setArea_id(int area_id) {
                    this.area_id = area_id;
                }

                public String getBlock() {
                    return block;
                }

                public void setBlock(String block) {
                    this.block = block;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getGada() {
                    return gada;
                }

                public void setGada(String gada) {
                    this.gada = gada;
                }

                public String getQasima() {
                    return qasima;
                }

                public void setQasima(String qasima) {
                    this.qasima = qasima;
                }

                public String getBuilding() {
                    return building;
                }

                public void setBuilding(String building) {
                    this.building = building;
                }

                public String getFloor() {
                    return floor;
                }

                public void setFloor(String floor) {
                    this.floor = floor;
                }

                public String getFlat_house() {
                    return flat_house;
                }

                public void setFlat_house(String flat_house) {
                    this.flat_house = flat_house;
                }

                public String getNotes() {
                    return notes;
                }

                public void setNotes(String notes) {
                    this.notes = notes;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }
            }

            public static class MyFavsBean {
                private int id;
                private String logo;
                private String titleAr;
                private String titleEn;
                private String detailsAr;
                private String detailsEn;
                private String status;
                private String getStatusAr;
                private double minimum_charges;
                private double delivery_cost;
                private int delivery_time;
                private String open_at;
                private String close_at;
                private int user_id;
                private int province_id;
                private int area_id;
                private String block;
                private String notes;
                private String created_at;
                private String updated_at;
                private boolean faved;
                private String link;
                /**
                 * user_id : 34
                 * shop_id : 2
                 */

                private PivotBean pivot;
                /**
                 * aggregate : 5.0000
                 * shop_id : 2
                 */

                private List<AvgRatingBean> avg_rating;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getTitleAr() {
                    return titleAr;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public String getTitleEn() {
                    return titleEn;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public String getDetailsAr() {
                    return detailsAr;
                }

                public void setDetailsAr(String detailsAr) {
                    this.detailsAr = detailsAr;
                }

                public String getDetailsEn() {
                    return detailsEn;
                }

                public void setDetailsEn(String detailsEn) {
                    this.detailsEn = detailsEn;
                }

                public String getStatus() {
                    return status;
                }
                public String getStatusAr() {
                    return getStatusAr;
                }

                public void setStatus(String status) {
                    this.status = status;
                }
                public void setStatusAr(String getStatusAr) {
                    this.getStatusAr = getStatusAr;
                }

                public double getMinimum_charges() {
                    return minimum_charges;
                }

                public void setMinimum_charges(double minimum_charges) {
                    this.minimum_charges = minimum_charges;
                }

                public double getDelivery_cost() {
                    return delivery_cost;
                }

                public void setDelivery_cost(double delivery_cost) {
                    this.delivery_cost = delivery_cost;
                }

                public int getDelivery_time() {
                    return delivery_time;
                }

                public void setDelivery_time(int delivery_time) {
                    this.delivery_time = delivery_time;
                }

                public String getOpen_at() {
                    return open_at;
                }

                public void setOpen_at(String open_at) {
                    this.open_at = open_at;
                }

                public String getClose_at() {
                    return close_at;
                }

                public void setClose_at(String close_at) {
                    this.close_at = close_at;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public int getProvince_id() {
                    return province_id;
                }

                public void setProvince_id(int province_id) {
                    this.province_id = province_id;
                }

                public int getArea_id() {
                    return area_id;
                }

                public void setArea_id(int area_id) {
                    this.area_id = area_id;
                }

                public String getBlock() {
                    return block;
                }

                public void setBlock(String block) {
                    this.block = block;
                }

                public String getNotes() {
                    return notes;
                }

                public void setNotes(String notes) {
                    this.notes = notes;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public boolean isFaved() {
                    return faved;
                }

                public void setFaved(boolean faved) {
                    this.faved = faved;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public PivotBean getPivot() {
                    return pivot;
                }

                public void setPivot(PivotBean pivot) {
                    this.pivot = pivot;
                }

                public List<AvgRatingBean> getAvg_rating() {
                    return avg_rating;
                }

                public void setAvg_rating(List<AvgRatingBean> avg_rating) {
                    this.avg_rating = avg_rating;
                }

                public static class PivotBean {
                    private int user_id;
                    private int shop_id;

                    public int getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public int getShop_id() {
                        return shop_id;
                    }

                    public void setShop_id(int shop_id) {
                        this.shop_id = shop_id;
                    }
                }

                public static class AvgRatingBean {
                    private String aggregate;
                    private int shop_id;

                    public String getAggregate() {
                        return aggregate;
                    }

                    public void setAggregate(String aggregate) {
                        this.aggregate = aggregate;
                    }

                    public int getShop_id() {
                        return shop_id;
                    }

                    public void setShop_id(int shop_id) {
                        this.shop_id = shop_id;
                    }
                }
            }
        }
    }
}
