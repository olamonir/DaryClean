package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/21/2017.
 */

public class TestObject {


    /**
     * result : {"success":1,"data":[{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"Open","minimum_charges":2,"delivery_cost":0.7,"delivery_time":48,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sgd","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"4.9355","shop_id":2}],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","status_ar":"مفتوح","user":{"id":22,"avatar":"","name":"","username":"josie83","email":"qfritsch@yahoo.com","phone":"+94(2)0296254637","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-12-04 15:04:40","updated_at":"2016-12-04 15:04:40"},"services":[{"id":1,"titleAr":"غسيل عل ناشف","titleEn":"Dry Clean","pivot":{"shop_id":2,"service_id":1}},{"id":2,"titleAr":"ملابس","titleEn":"Clothes","pivot":{"shop_id":2,"service_id":2}},{"id":3,"titleAr":"بطاطين","titleEn":"Bataten","pivot":{"shop_id":2,"service_id":3}}],"products":[{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"},{"id":2,"shop_id":2,"section_id":2,"category_id":1,"price":2,"active":1,"notes":"","created_at":"2017-01-16 14:37:52","updated_at":"2017-01-16 14:38:27"},{"id":3,"shop_id":2,"section_id":1,"category_id":1,"price":1,"active":1,"notes":"","created_at":"2017-01-16 14:37:56","updated_at":"2017-01-16 14:37:56"},{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}]},{"id":4,"logo":"","titleAr":"مصبغة حولى","titleEn":"hawally","detailsAr":"تلابللا","detailsEn":"jhvfhc","status":"Busy","minimum_charges":2,"delivery_cost":0.4,"delivery_time":70,"open_at":"00:00:15","close_at":"00:15:00","user_id":20,"province_id":1,"area_id":1,"block":"","notes":"no comments","created_at":"2017-01-30 21:35:00","updated_at":"2017-01-30 21:35:00","avg_rating":[],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/4","status_ar":"مشغول","user":{"id":20,"avatar":"","name":"","username":"Ahfsmdss3","email":"ad@a42d3.asdss","phone":"65694554","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-05-16 08:48:23","updated_at":"2016-05-16 09:08:13"},"services":[],"products":[]}]}
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
         * data : [{"id":2,"logo":"2017-01-09-08-39-01-b2410.jpeg","titleAr":"مصبغة","titleEn":"Lundry","detailsAr":"اتلات","detailsEn":"sgsg","status":"Open","minimum_charges":2,"delivery_cost":0.7,"delivery_time":48,"open_at":"07:00:00","close_at":"20:00:00","user_id":22,"province_id":1,"area_id":1,"block":"3","notes":"sgd","created_at":"2017-01-09 08:40:01","updated_at":"2017-01-09 08:40:01","avg_rating":[{"aggregate":"4.9355","shop_id":2}],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/2","status_ar":"مفتوح","user":{"id":22,"avatar":"","name":"","username":"josie83","email":"qfritsch@yahoo.com","phone":"+94(2)0296254637","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-12-04 15:04:40","updated_at":"2016-12-04 15:04:40"},"services":[{"id":1,"titleAr":"غسيل عل ناشف","titleEn":"Dry Clean","pivot":{"shop_id":2,"service_id":1}},{"id":2,"titleAr":"ملابس","titleEn":"Clothes","pivot":{"shop_id":2,"service_id":2}},{"id":3,"titleAr":"بطاطين","titleEn":"Bataten","pivot":{"shop_id":2,"service_id":3}}],"products":[{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"},{"id":2,"shop_id":2,"section_id":2,"category_id":1,"price":2,"active":1,"notes":"","created_at":"2017-01-16 14:37:52","updated_at":"2017-01-16 14:38:27"},{"id":3,"shop_id":2,"section_id":1,"category_id":1,"price":1,"active":1,"notes":"","created_at":"2017-01-16 14:37:56","updated_at":"2017-01-16 14:37:56"},{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}]},{"id":4,"logo":"","titleAr":"مصبغة حولى","titleEn":"hawally","detailsAr":"تلابللا","detailsEn":"jhvfhc","status":"Busy","minimum_charges":2,"delivery_cost":0.4,"delivery_time":70,"open_at":"00:00:15","close_at":"00:15:00","user_id":20,"province_id":1,"area_id":1,"block":"","notes":"no comments","created_at":"2017-01-30 21:35:00","updated_at":"2017-01-30 21:35:00","avg_rating":[],"faved":false,"link":"http://ghasala.nasmedia.net/shop/view/4","status_ar":"مشغول","user":{"id":20,"avatar":"","name":"","username":"Ahfsmdss3","email":"ad@a42d3.asdss","phone":"65694554","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-05-16 08:48:23","updated_at":"2016-05-16 09:08:13"},"services":[],"products":[]}]
         */

        private int success;
        private List<DataBean> data;

        public void setSuccess(int success) {
            this.success = success;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public int getSuccess() {
            return success;
        }

        public List<DataBean> getData() {
            return data;
        }

        public static class DataBean {
            /**
             * id : 2
             * logo : 2017-01-09-08-39-01-b2410.jpeg
             * titleAr : مصبغة
             * titleEn : Lundry
             * detailsAr : اتلات
             * detailsEn : sgsg
             * status : Open
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
             * avg_rating : [{"aggregate":"4.9355","shop_id":2}]
             * faved : false
             * link : http://ghasala.nasmedia.net/shop/view/2
             * status_ar : مفتوح
             * user : {"id":22,"avatar":"","name":"","username":"josie83","email":"qfritsch@yahoo.com","phone":"+94(2)0296254637","country_id":120,"isAdmin":0,"role_id":2,"remember_token":"","active":1,"created_at":"2016-12-04 15:04:40","updated_at":"2016-12-04 15:04:40"}
             * services : [{"id":1,"titleAr":"غسيل عل ناشف","titleEn":"Dry Clean","pivot":{"shop_id":2,"service_id":1}},{"id":2,"titleAr":"ملابس","titleEn":"Clothes","pivot":{"shop_id":2,"service_id":2}},{"id":3,"titleAr":"بطاطين","titleEn":"Bataten","pivot":{"shop_id":2,"service_id":3}}]
             * products : [{"id":1,"shop_id":2,"section_id":2,"category_id":2,"price":1.2,"active":1,"notes":"sgdsdg","created_at":"2017-01-09 09:04:09","updated_at":"2017-01-16 14:46:59"},{"id":2,"shop_id":2,"section_id":2,"category_id":1,"price":2,"active":1,"notes":"","created_at":"2017-01-16 14:37:52","updated_at":"2017-01-16 14:38:27"},{"id":3,"shop_id":2,"section_id":1,"category_id":1,"price":1,"active":1,"notes":"","created_at":"2017-01-16 14:37:56","updated_at":"2017-01-16 14:37:56"},{"id":4,"shop_id":2,"section_id":1,"category_id":2,"price":0.8,"active":1,"notes":"","created_at":"2017-01-16 14:38:01","updated_at":"2017-01-16 14:38:01"}]
             */

            private int id;
            private String logo;
            private String titleAr;
            private String titleEn;
            private String detailsAr;
            private String detailsEn;
            private String status;
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
            private String status_ar;
            private UserBean user;
            private List<AvgRatingBean> avg_rating;
            private List<ServicesBean> services;
            private List<ProductsBean> products;

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

            public void setMinimum_charges(int minimum_charges) {
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

            public void setUser(UserBean user) {
                this.user = user;
            }

            public void setAvg_rating(List<AvgRatingBean> avg_rating) {
                this.avg_rating = avg_rating;
            }

            public void setServices(List<ServicesBean> services) {
                this.services = services;
            }

            public void setProducts(List<ProductsBean> products) {
                this.products = products;
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

            public int getMinimum_charges() {
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

            public UserBean getUser() {
                return user;
            }

            public List<AvgRatingBean> getAvg_rating() {
                return avg_rating;
            }

            public List<ServicesBean> getServices() {
                return services;
            }

            public List<ProductsBean> getProducts() {
                return products;
            }

            public static class UserBean {
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

            public static class AvgRatingBean {
                /**
                 * aggregate : 4.9355
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

            public static class ServicesBean {
                /**
                 * id : 1
                 * titleAr : غسيل عل ناشف
                 * titleEn : Dry Clean
                 * pivot : {"shop_id":2,"service_id":1}
                 */

                private int id;
                private String titleAr;
                private String titleEn;
                private PivotBean pivot;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public void setPivot(PivotBean pivot) {
                    this.pivot = pivot;
                }

                public int getId() {
                    return id;
                }

                public String getTitleAr() {
                    return titleAr;
                }

                public String getTitleEn() {
                    return titleEn;
                }

                public PivotBean getPivot() {
                    return pivot;
                }

                public static class PivotBean {
                    /**
                     * shop_id : 2
                     * service_id : 1
                     */

                    private int shop_id;
                    private int service_id;

                    public void setShop_id(int shop_id) {
                        this.shop_id = shop_id;
                    }

                    public void setService_id(int service_id) {
                        this.service_id = service_id;
                    }

                    public int getShop_id() {
                        return shop_id;
                    }

                    public int getService_id() {
                        return service_id;
                    }
                }
            }

            public static class ProductsBean {
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
