package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/21/2017.
 */

public class TestObject {


    /**
     * success : 1
     * data : [{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"open","minimum_charges":2,"delivery_cost":0.7,"delivery_time":48,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sgd","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","user":{"id":22,"avatar":"","name":"","username":"josie83","email":"qfritsch@yahoo.com","phone":"+94(2)0296254637","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-12-04 15:04:40","updated_at":"2016-12-04 15:04:40"},"products":[{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"},{"id":2,"shop_id":2,"section_id":2,"category_id":1,"price":2,"active":1,"notes":"","created_at":"2017-01-16 14:37:52","updated_at":"2017-01-16 14:38:27"},{"id":3,"shop_id":2,"section_id":1,"category_id":1,"price":1,"active":1,"notes":"","created_at":"2017-01-16 14:37:56","updated_at":"2017-01-16 14:37:56"},{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}]}]
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
         * id : 2
         * logo : 2017-01-09-08-39-01-b2410.jpeg
         * titleAr : مصبغة
         * titleEn : Lundry
         * detailsAr : اتلات
         * detailsEn : sgsg
         * status : open
         * minimum_charges : 2
         * delivery_cost : 0.7
         * delivery_time : 48
         * open_at : 07:00:00
         * close_at : 20:00:00
         * user_id : 22
         * province_id : 1
         * area_id : 1
         * block : 3
         * notes : sgd
         * created_at : 2017-01-09 08:40:01
         * updated_at : 2017-01-09 08:40:01
         * avg_rating : []
         * faved : false
         * link : http://ghasala.nasmedia.net/shop/view/2
         * user : {"id":22,"avatar":"","name":"","username":"josie83","email":"qfritsch@yahoo.com","phone":"+94(2)0296254637","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-12-04 15:04:40","updated_at":"2016-12-04 15:04:40"}
         * products : [{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"},{"id":2,"shop_id":2,"section_id":2,"category_id":1,"price":2,"active":1,"notes":"","created_at":"2017-01-16 14:37:52","updated_at":"2017-01-16 14:38:27"},{"id":3,"shop_id":2,"section_id":1,"category_id":1,"price":1,"active":1,"notes":"","created_at":"2017-01-16 14:37:56","updated_at":"2017-01-16 14:37:56"},{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}]
         */

        private List<DataBean> data;

        public int getSuccess() {
            return success;
        }

        public void setSuccess(int success) {
            this.success = success;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private int id;
            private String logo;
            private String titleAr;
            private String titleEn;
            private String detailsAr;
            private String detailsEn;
            private String status;
            private String status_ar;
            private int minimum_charges;
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
             * id : 22
             * avatar :
             * name :
             * username : josie83
             * email : qfritsch@yahoo.com
             * phone : +94(2)0296254637
             * country_id : 120
             * isAdmin : 0
             * role_id : 2
             * remember_token :
             * active : 1
             * created_at : 2016-12-04 15:04:40
             * updated_at : 2016-12-04 15:04:40
             */

            private UserBean user;
            private List<?> avg_rating;
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

            private List<ProductsBean> products;

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
            public String getStatusAr() {return status_ar;}

            public void setStatus(String status) {
                this.status = status;
            }
            public void setStatusAr(String status_ar) {this.status_ar = status_ar;}

            public int getMinimum_charges() {
                return minimum_charges;
            }

            public void setMinimum_charges(int minimum_charges) {
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

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public List<?> getAvg_rating() {
                return avg_rating;
            }

            public void setAvg_rating(List<?> avg_rating) {
                this.avg_rating = avg_rating;
            }

            public List<ProductsBean> getProducts() {
                return products;
            }

            public void setProducts(List<ProductsBean> products) {
                this.products = products;
            }

            public static class UserBean {
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
            }

            public static class ProductsBean {
                private int id;
                private int shop_id;
                private int section_id;
                private int category_id;
                private double price;
                private int active;
                private String notes;
                private String created_at;
                private String updated_at;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getShop_id() {
                    return shop_id;
                }

                public void setShop_id(int shop_id) {
                    this.shop_id = shop_id;
                }

                public int getSection_id() {
                    return section_id;
                }

                public void setSection_id(int section_id) {
                    this.section_id = section_id;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public int getActive() {
                    return active;
                }

                public void setActive(int active) {
                    this.active = active;
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
        }
    }
}
