package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/29/2017.
 */

public class LastOrders  {


    /**
     * result : {"success":1,"data":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50","orders":[{"id":2,"user_id":34,"shop_id":2,"address_id":3,"units":8,"total":9.1,"minimum_charges":2,"delivery_cost":0.7,"delivery_time":48,"active":1,"paid":0,"status":"incomplete","notes":"ya reet t3'slhom kwayes","created_at":"2017-01-27 19:07:33","updated_at":"2017-01-27 19:07:33","option_id":1,"payment_url":"http://ghasala.nasmedia.net/payments/confirm/2","user":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"},"shop":{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"Open","minimum_charges":1.5,"delivery_cost":0.4,"delivery_time":24,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sdgsdg","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"5.0000","shop_id":2}],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","status_ar":"مفتوح"},"address":{"id":3,"user_id":34,"address":"Block3 St.5, Building 10 Flat 32","province_id":1,"area_id":1,"block":"5","street":"5","gada":"5","qasima":"5","building":"5","floor":"5","flat_house":"5","notes":"sgsdgsg","created_at":"2017-01-09 07:30:00","updated_at":"2017-01-09 07:30:00"},"items":[{"id":2,"order_id":2,"product_id":1,"units":5,"price":1.2,"total":6,"product":{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"}},{"id":3,"order_id":2,"product_id":4,"units":3,"price":0.8,"total":2.4,"product":{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}}]}]}}
     */

    private ResultBean result;

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public ResultBean getResult() {
        return result;
    }

    public static class ResultBean {
        /**
         * success : 1
         * data : {"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50","orders":[{"id":2,"user_id":34,"shop_id":2,"address_id":3,"units":8,"total":9.1,"minimum_charges":2,"delivery_cost":0.7,"delivery_time":48,"active":1,"paid":0,"status":"incomplete","notes":"ya reet t3'slhom kwayes","created_at":"2017-01-27 19:07:33","updated_at":"2017-01-27 19:07:33","option_id":1,"payment_url":"http://ghasala.nasmedia.net/payments/confirm/2","user":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"},"shop":{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"Open","minimum_charges":1.5,"delivery_cost":0.4,"delivery_time":24,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sdgsdg","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"5.0000","shop_id":2}],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","status_ar":"مفتوح"},"address":{"id":3,"user_id":34,"address":"Block3 St.5, Building 10 Flat 32","province_id":1,"area_id":1,"block":"5","street":"5","gada":"5","qasima":"5","building":"5","floor":"5","flat_house":"5","notes":"sgsdgsg","created_at":"2017-01-09 07:30:00","updated_at":"2017-01-09 07:30:00"},"items":[{"id":2,"order_id":2,"product_id":1,"units":5,"price":1.2,"total":6,"product":{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"}},{"id":3,"order_id":2,"product_id":4,"units":3,"price":0.8,"total":2.4,"product":{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}}]}]}
         */

        private int success;
        private DataBean data;

        public void setSuccess(int success) {
            this.success = success;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public int getSuccess() {
            return success;
        }

        public DataBean getData() {
            return data;
        }

        public static class DataBean {
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
             * orders : [{"id":2,"user_id":34,"shop_id":2,"address_id":3,"units":8,"total":9.1,"minimum_charges":2,"delivery_cost":0.7,"delivery_time":48,"active":1,"paid":0,"status":"incomplete","notes":"ya reet t3'slhom kwayes","created_at":"2017-01-27 19:07:33","updated_at":"2017-01-27 19:07:33","option_id":1,"payment_url":"http://ghasala.nasmedia.net/payments/confirm/2","user":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"},"shop":{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"Open","minimum_charges":1.5,"delivery_cost":0.4,"delivery_time":24,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sdgsdg","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"5.0000","shop_id":2}],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","status_ar":"مفتوح"},"address":{"id":3,"user_id":34,"address":"Block3 St.5, Building 10 Flat 32","province_id":1,"area_id":1,"block":"5","street":"5","gada":"5","qasima":"5","building":"5","floor":"5","flat_house":"5","notes":"sgsdgsg","created_at":"2017-01-09 07:30:00","updated_at":"2017-01-09 07:30:00"},"items":[{"id":2,"order_id":2,"product_id":1,"units":5,"price":1.2,"total":6,"product":{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"}},{"id":3,"order_id":2,"product_id":4,"units":3,"price":0.8,"total":2.4,"product":{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}}]}]
             */

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
            private List<OrdersBean> orders;

            public void setId(int id) {
                this.id = id;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public void setCountry_id(int country_id) {
                this.country_id = country_id;
            }

            public void setIsAdmin(int isAdmin) {
                this.isAdmin = isAdmin;
            }

            public void setRole_id(int role_id) {
                this.role_id = role_id;
            }

            public void setRemember_token(String remember_token) {
                this.remember_token = remember_token;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public void setOrders(List<OrdersBean> orders) {
                this.orders = orders;
            }

            public int getId() {
                return id;
            }

            public String getAvatar() {
                return avatar;
            }

            public String getName() {
                return name;
            }

            public String getUsername() {
                return username;
            }

            public String getEmail() {
                return email;
            }

            public String getPhone() {
                return phone;
            }

            public int getCountry_id() {
                return country_id;
            }

            public int getIsAdmin() {
                return isAdmin;
            }

            public int getRole_id() {
                return role_id;
            }

            public String getRemember_token() {
                return remember_token;
            }

            public int getActive() {
                return active;
            }

            public String getCreated_at() {
                return created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public List<OrdersBean> getOrders() {
                return orders;
            }

            public static class OrdersBean {
                /**
                 * id : 2
                 * user_id : 34
                 * shop_id : 2
                 * address_id : 3
                 * units : 8
                 * total : 9.1
                 * minimum_charges : 2
                 * delivery_cost : 0.7
                 * delivery_time : 48
                 * active : 1
                 * paid : 0
                 * status : incomplete
                 * notes : ya reet t3'slhom kwayes
                 * created_at : 2017-01-27 19:07:33
                 * updated_at : 2017-01-27 19:07:33
                 * option_id : 1
                 * payment_url : http://ghasala.nasmedia.net/payments/confirm/2
                 * user : {"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"}
                 * shop : {"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"Open","minimum_charges":1.5,"delivery_cost":0.4,"delivery_time":24,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sdgsdg","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"5.0000","shop_id":2}],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","status_ar":"مفتوح"}
                 * address : {"id":3,"user_id":34,"address":"Block3 St.5, Building 10 Flat 32","province_id":1,"area_id":1,"block":"5","street":"5","gada":"5","qasima":"5","building":"5","floor":"5","flat_house":"5","notes":"sgsdgsg","created_at":"2017-01-09 07:30:00","updated_at":"2017-01-09 07:30:00"}
                 * items : [{"id":2,"order_id":2,"product_id":1,"units":5,"price":1.2,"total":6,"product":{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"}},{"id":3,"order_id":2,"product_id":4,"units":3,"price":0.8,"total":2.4,"product":{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}}]
                 */

                private int id;
                private int user_id;
                private int shop_id;
                private int address_id;
                private int units;
                private float  total;
                private int minimum_charges;
                private double delivery_cost;
                private int delivery_time;
                private int active;
                private int paid;
                private String status;
                private String notes;
                private String created_at;
                private String updated_at;
                private int option_id;
                private String payment_url;
                private UserBean user;
                private ShopBean shop;
                private AddressBean address;
                private List<ItemsBean> items;

                public void setId(int id) {
                    this.id = id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public void setShop_id(int shop_id) {
                    this.shop_id = shop_id;
                }

                public void setAddress_id(int address_id) {
                    this.address_id = address_id;
                }

                public void setUnits(int units) {
                    this.units = units;
                }

                public void setTotal(float  total) {
                    this.total = total;
                }

                public void setMinimum_charges(int minimum_charges) {
                    this.minimum_charges = minimum_charges;
                }

                public void setDelivery_cost(double delivery_cost) {
                    this.delivery_cost = delivery_cost;
                }

                public void setDelivery_time(int delivery_time) {
                    this.delivery_time = delivery_time;
                }

                public void setActive(int active) {
                    this.active = active;
                }

                public void setPaid(int paid) {
                    this.paid = paid;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public void setNotes(String notes) {
                    this.notes = notes;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public void setOption_id(int option_id) {
                    this.option_id = option_id;
                }

                public void setPayment_url(String payment_url) {
                    this.payment_url = payment_url;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public void setShop(ShopBean shop) {
                    this.shop = shop;
                }

                public void setAddress(AddressBean address) {
                    this.address = address;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public int getId() {
                    return id;
                }

                public int getUser_id() {
                    return user_id;
                }

                public int getShop_id() {
                    return shop_id;
                }

                public int getAddress_id() {
                    return address_id;
                }

                public int getUnits() {
                    return units;
                }

                public float  getTotal() {
                    return total;
                }

                public int getMinimum_charges() {
                    return minimum_charges;
                }

                public double getDelivery_cost() {
                    return delivery_cost;
                }

                public int getDelivery_time() {
                    return delivery_time;
                }

                public int getActive() {
                    return active;
                }

                public int getPaid() {
                    return paid;
                }

                public String getStatus() {
                    return status;
                }

                public String getNotes() {
                    return notes;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public int getOption_id() {
                    return option_id;
                }

                public String getPayment_url() {
                    return payment_url;
                }

                public UserBean getUser() {
                    return user;
                }

                public ShopBean getShop() {
                    return shop;
                }

                public AddressBean getAddress() {
                    return address;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public static class UserBean {
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
                     */

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

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public void setUsername(String username) {
                        this.username = username;
                    }

                    public void setEmail(String email) {
                        this.email = email;
                    }

                    public void setPhone(String phone) {
                        this.phone = phone;
                    }

                    public void setCountry_id(int country_id) {
                        this.country_id = country_id;
                    }

                    public void setIsAdmin(int isAdmin) {
                        this.isAdmin = isAdmin;
                    }

                    public void setRole_id(int role_id) {
                        this.role_id = role_id;
                    }

                    public void setRemember_token(String remember_token) {
                        this.remember_token = remember_token;
                    }

                    public void setActive(int active) {
                        this.active = active;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public int getId() {
                        return id;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public String getName() {
                        return name;
                    }

                    public String getUsername() {
                        return username;
                    }

                    public String getEmail() {
                        return email;
                    }

                    public String getPhone() {
                        return phone;
                    }

                    public int getCountry_id() {
                        return country_id;
                    }

                    public int getIsAdmin() {
                        return isAdmin;
                    }

                    public int getRole_id() {
                        return role_id;
                    }

                    public String getRemember_token() {
                        return remember_token;
                    }

                    public int getActive() {
                        return active;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }
                }

                public static class ShopBean {
                    /**
                     * id : 2
                     * logo : 2017-01-09-08-39-01-b2410.jpeg
                     * titleAr : مصبغة
                     * titleEn : Lundry
                     * detailsAr : اتلات
                     * detailsEn : sgsg
                     * status : Open
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
                     * faved : false
                     * link : http://ghasala.nasmedia.net/shop/view/2
                     * status_ar : مفتوح
                     */

                    private int id;
                    private String logo;
                    private String titleAr;
                    private String titleEn;
                    private String detailsAr;
                    private String detailsEn;
                    private String status;
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
                    private String status_ar;
                    private List<AvgRatingBean> avg_rating;

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public void setTitleAr(String titleAr) {
                        this.titleAr = titleAr;
                    }

                    public void setTitleEn(String titleEn) {
                        this.titleEn = titleEn;
                    }

                    public void setDetailsAr(String detailsAr) {
                        this.detailsAr = detailsAr;
                    }

                    public void setDetailsEn(String detailsEn) {
                        this.detailsEn = detailsEn;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public void setMinimum_charges(double minimum_charges) {
                        this.minimum_charges = minimum_charges;
                    }

                    public void setDelivery_cost(double delivery_cost) {
                        this.delivery_cost = delivery_cost;
                    }

                    public void setDelivery_time(int delivery_time) {
                        this.delivery_time = delivery_time;
                    }

                    public void setOpen_at(String open_at) {
                        this.open_at = open_at;
                    }

                    public void setClose_at(String close_at) {
                        this.close_at = close_at;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public void setProvince_id(int province_id) {
                        this.province_id = province_id;
                    }

                    public void setArea_id(int area_id) {
                        this.area_id = area_id;
                    }

                    public void setBlock(String block) {
                        this.block = block;
                    }

                    public void setNotes(String notes) {
                        this.notes = notes;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public void setFaved(boolean faved) {
                        this.faved = faved;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public void setStatus_ar(String status_ar) {
                        this.status_ar = status_ar;
                    }

                    public void setAvg_rating(List<AvgRatingBean> avg_rating) {
                        this.avg_rating = avg_rating;
                    }

                    public int getId() {
                        return id;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public String getTitleAr() {
                        return titleAr;
                    }

                    public String getTitleEn() {
                        return titleEn;
                    }

                    public String getDetailsAr() {
                        return detailsAr;
                    }

                    public String getDetailsEn() {
                        return detailsEn;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public double getMinimum_charges() {
                        return minimum_charges;
                    }

                    public double getDelivery_cost() {
                        return delivery_cost;
                    }

                    public int getDelivery_time() {
                        return delivery_time;
                    }

                    public String getOpen_at() {
                        return open_at;
                    }

                    public String getClose_at() {
                        return close_at;
                    }

                    public int getUser_id() {
                        return user_id;
                    }

                    public int getProvince_id() {
                        return province_id;
                    }

                    public int getArea_id() {
                        return area_id;
                    }

                    public String getBlock() {
                        return block;
                    }

                    public String getNotes() {
                        return notes;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }

                    public boolean getFaved() {
                        return faved;
                    }

                    public String getLink() {
                        return link;
                    }

                    public String getStatus_ar() {
                        return status_ar;
                    }

                    public List<AvgRatingBean> getAvg_rating() {
                        return avg_rating;
                    }

                    public static class AvgRatingBean {
                        /**
                         * aggregate : 5.0000
                         * shop_id : 2
                         */

                        private String aggregate;
                        private int shop_id;

                        public void setAggregate(String aggregate) {
                            this.aggregate = aggregate;
                        }

                        public void setShop_id(int shop_id) {
                            this.shop_id = shop_id;
                        }

                        public String getAggregate() {
                            return aggregate;
                        }

                        public int getShop_id() {
                            return shop_id;
                        }
                    }
                }

                public static class AddressBean {
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

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public void setAddress(String address) {
                        this.address = address;
                    }

                    public void setProvince_id(int province_id) {
                        this.province_id = province_id;
                    }

                    public void setArea_id(int area_id) {
                        this.area_id = area_id;
                    }

                    public void setBlock(String block) {
                        this.block = block;
                    }

                    public void setStreet(String street) {
                        this.street = street;
                    }

                    public void setGada(String gada) {
                        this.gada = gada;
                    }

                    public void setQasima(String qasima) {
                        this.qasima = qasima;
                    }

                    public void setBuilding(String building) {
                        this.building = building;
                    }

                    public void setFloor(String floor) {
                        this.floor = floor;
                    }

                    public void setFlat_house(String flat_house) {
                        this.flat_house = flat_house;
                    }

                    public void setNotes(String notes) {
                        this.notes = notes;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public int getId() {
                        return id;
                    }

                    public int getUser_id() {
                        return user_id;
                    }

                    public String getAddress() {
                        return address;
                    }

                    public int getProvince_id() {
                        return province_id;
                    }

                    public int getArea_id() {
                        return area_id;
                    }

                    public String getBlock() {
                        return block;
                    }

                    public String getStreet() {
                        return street;
                    }

                    public String getGada() {
                        return gada;
                    }

                    public String getQasima() {
                        return qasima;
                    }

                    public String getBuilding() {
                        return building;
                    }

                    public String getFloor() {
                        return floor;
                    }

                    public String getFlat_house() {
                        return flat_house;
                    }

                    public String getNotes() {
                        return notes;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }
                }

                public static class ItemsBean {
                    /**
                     * id : 2
                     * order_id : 2
                     * product_id : 1
                     * units : 5
                     * price : 1.2
                     * total : 6
                     * product : {"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"}
                     */

                    private int id;
                    private int order_id;
                    private int product_id;
                    private int units;
                    private double price;
                    private int total;
                    private ProductBean product;

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setOrder_id(int order_id) {
                        this.order_id = order_id;
                    }

                    public void setProduct_id(int product_id) {
                        this.product_id = product_id;
                    }

                    public void setUnits(int units) {
                        this.units = units;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public void setTotal(int total) {
                        this.total = total;
                    }

                    public void setProduct(ProductBean product) {
                        this.product = product;
                    }

                    public int getId() {
                        return id;
                    }

                    public int getOrder_id() {
                        return order_id;
                    }

                    public int getProduct_id() {
                        return product_id;
                    }

                    public int getUnits() {
                        return units;
                    }

                    public double getPrice() {
                        return price;
                    }

                    public int getTotal() {
                        return total;
                    }

                    public ProductBean getProduct() {
                        return product;
                    }

                    public static class ProductBean {
                        /**
                         * id : 1
                         * shop_id : 2
                         * section_id : 2
                         * category_id : 2
                         * price : 1.2
                         * active : 1
                         * notes : sgdsdg
                         * created_at : 2017-01-09 09:04:09
                         * updated_at : 2017-01-16 14:46:59
                         */

                        private int id;
                        private int shop_id;
                        private int section_id;
                        private int category_id;
                        private double price;
                        private int active;
                        private String notes;
                        private String created_at;
                        private String updated_at;

                        public void setId(int id) {
                            this.id = id;
                        }

                        public void setShop_id(int shop_id) {
                            this.shop_id = shop_id;
                        }

                        public void setSection_id(int section_id) {
                            this.section_id = section_id;
                        }

                        public void setCategory_id(int category_id) {
                            this.category_id = category_id;
                        }

                        public void setPrice(double price) {
                            this.price = price;
                        }

                        public void setActive(int active) {
                            this.active = active;
                        }

                        public void setNotes(String notes) {
                            this.notes = notes;
                        }

                        public void setCreated_at(String created_at) {
                            this.created_at = created_at;
                        }

                        public void setUpdated_at(String updated_at) {
                            this.updated_at = updated_at;
                        }

                        public int getId() {
                            return id;
                        }

                        public int getShop_id() {
                            return shop_id;
                        }

                        public int getSection_id() {
                            return section_id;
                        }

                        public int getCategory_id() {
                            return category_id;
                        }

                        public double getPrice() {
                            return price;
                        }

                        public int getActive() {
                            return active;
                        }

                        public String getNotes() {
                            return notes;
                        }

                        public String getCreated_at() {
                            return created_at;
                        }

                        public String getUpdated_at() {
                            return updated_at;
                        }
                    }
                }
            }
        }
    }
}
