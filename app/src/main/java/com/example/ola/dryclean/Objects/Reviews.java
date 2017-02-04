package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/25/2017.
 */
//    package com.trucksidriver.Models.Driver;

    /**
     * Created by Dev_halima on 1/24/2017.
     */
    public class Reviews  {


        /**
         * result : {"success":1,"data":{"total":1,"per_page":20,"current_page":1,"last_page":1,"from":1,"to":1,"data":[{"id":1,"shop_id":2,"user_id":34,"rate":5,"comment":"pretty good","created_at":"2017-01-22 23:49:51","updated_at":"2017-01-22 23:49:51","user":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"}}]}}
         */

        private ResultEntity result;

        public void setResult(ResultEntity result) {
            this.result = result;
        }

        public ResultEntity getResult() {
            return result;
        }

        public static class ResultEntity {
            /**
             * success : 1
             * data : {"total":1,"per_page":20,"current_page":1,"last_page":1,"from":1,"to":1,"data":[{"id":1,"shop_id":2,"user_id":34,"rate":5,"comment":"pretty good","created_at":"2017-01-22 23:49:51","updated_at":"2017-01-22 23:49:51","user":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"}}]}
             */

            private int success;
            private DataEntityMainClass data;

            public void setSuccess(int success) {
                this.success = success;
            }

            public void setData(DataEntityMainClass data) {
                this.data = data;
            }

            public int getSuccess() {
                return success;
            }

            public DataEntityMainClass getData() {
                return data;
            }

            public static class DataEntityMainClass {
                /**
                 * total : 1
                 * per_page : 20
                 * current_page : 1
                 * last_page : 1
                 * from : 1
                 * to : 1
                 * data : [{"id":1,"shop_id":2,"user_id":34,"rate":5,"comment":"pretty good","created_at":"2017-01-22 23:49:51","updated_at":"2017-01-22 23:49:51","user":{"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"}}]
                 */

                private int total;
                private int per_page;
                private int current_page;
                private int last_page;
                private int from;
                private int to;
                private List<DataEntity> data;

                public void setTotal(int total) {
                    this.total = total;
                }

                public void setPer_page(int per_page) {
                    this.per_page = per_page;
                }

                public void setCurrent_page(int current_page) {
                    this.current_page = current_page;
                }

                public void setLast_page(int last_page) {
                    this.last_page = last_page;
                }

                public void setFrom(int from) {
                    this.from = from;
                }

                public void setTo(int to) {
                    this.to = to;
                }

                public void setData(List<DataEntity> data) {
                    this.data = data;
                }

                public int getTotal() {
                    return total;
                }

                public int getPer_page() {
                    return per_page;
                }

                public int getCurrent_page() {
                    return current_page;
                }

                public int getLast_page() {
                    return last_page;
                }

                public int getFrom() {
                    return from;
                }

                public int getTo() {
                    return to;
                }

                public List<DataEntity> getData() {
                    return data;
                }

                public static class DataEntity {
                    /**
                     * id : 1
                     * shop_id : 2
                     * user_id : 34
                     * rate : 5
                     * comment : pretty good
                     * created_at : 2017-01-22 23:49:51
                     * updated_at : 2017-01-22 23:49:51
                     * user : {"id":34,"avatar":"","name":"","username":"jjj","email":"email@example.com","phone":"66991985","country_id":120,"isAdmin":0,"role_id":1,"remember_token":"","active":1,"created_at":"2016-12-04 16:13:23","updated_at":"2016-12-04 16:19:50"}
                     */

                    private int id;
                    private int shop_id;
                    private int user_id;
                    private int rate;
                    private String comment;
                    private String created_at;
                    private String updated_at;
                    private UserEntity user;

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setShop_id(int shop_id) {
                        this.shop_id = shop_id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public void setRate(int rate) {
                        this.rate = rate;
                    }

                    public void setComment(String comment) {
                        this.comment = comment;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public void setUser(UserEntity user) {
                        this.user = user;
                    }

                    public int getId() {
                        return id;
                    }

                    public int getShop_id() {
                        return shop_id;
                    }

                    public int getUser_id() {
                        return user_id;
                    }

                    public int getRate() {
                        return rate;
                    }

                    public String getComment() {
                        return comment;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }

                    public UserEntity getUser() {
                        return user;
                    }

                    public static class UserEntity {
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
                }
            }
        }
    }


