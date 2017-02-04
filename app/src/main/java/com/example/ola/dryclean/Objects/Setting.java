package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/24/2017.
 */

public class Setting {

    /**
     * result : {"success":1,"data":{"settings":{"siteNameAr":"غسالة","siteNameEn":"Ghasala","phone":"66991985","mobile":"66991985","adminEmail":"info@ghasala.com","socialInstagram":"#","socialFacebook":"#","socialTwitter":"#","socialGoogle":"#","socialLinkedin":"#","socialYoutube":"#","facebookApiAndroid":"key|secret","facebookApiIphone":"key|secret","googleApiAndroid":"key|secret","googleApiIphone":"key|secret","notification_suitable_project":"مشروع جديد مناسب لك","notification_new_offer":"عرض جديد علي مشروع %s","notification_accepted":"تم قبول عرضك في مشروع %s","notification_file_uploaded":"تم ارفاق ملف جدد الي مشروع %s","notification_closed":"تم اغلاق مشروع %s","notification_new_message":"لديك رسالة جديدة من %s","notification_rate_provider":"قم بتقييم %s","appShareUrl":"https://ghasala.nasmedia.net/app-download","payment_url":"http://ghasala.nasmedia.net/payments/confirm/|ORDER_ID|"},"paths":{"avatars":"media/avatars/","products_sections":"media/products_sections/","products_categories":"media/products_categories/","shops":"media/shops/","payments_options":"media/payments_options/","resize":"http://ghasala.nasmedia.net/resize?src="},"payments_options":[{"id":1,"titleAr":"كاش","titleEn":"Cash","icon":"2017-01-23-19-41-15-a3286.png"}],"services":[{"id":1,"titleAr":"غسيل عل ناشف","titleEn":"Dry Clean"}],"sections":[{"id":1,"titleAr":"دشداشة","titleEn":"Deshdasha","icon":"2017-01-23-19-31-23-b425e.png"}],"categories":[{"id":1,"titleAr":"شتوي","titleEn":"Winter","subTitleAr":"غسيل وكوي","subTitleEn":"Wash & Iron","icon":"2017-01-23-19-39-15-45c03.png"}],"provinces":[{"id":1,"titleAr":"محافظة العاصمة","titleEn":"Asima Governorate","areas":[{"id":1,"titleAr":"شرق","titleEn":"Sharq","apiName":"Sharq","province_id":1}]}],"user":null,"countries":[{"id":154,"titleAr":"الاورغوي","titleEn":"Alaurgoa","currency":"","rate":0,"phone_prefix":0,"alpha_2":"ur"}]}}
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
         * data : {"settings":{"siteNameAr":"غسالة","siteNameEn":"Ghasala","phone":"66991985","mobile":"66991985","adminEmail":"info@ghasala.com","socialInstagram":"#","socialFacebook":"#","socialTwitter":"#","socialGoogle":"#","socialLinkedin":"#","socialYoutube":"#","facebookApiAndroid":"key|secret","facebookApiIphone":"key|secret","googleApiAndroid":"key|secret","googleApiIphone":"key|secret","notification_suitable_project":"مشروع جديد مناسب لك","notification_new_offer":"عرض جديد علي مشروع %s","notification_accepted":"تم قبول عرضك في مشروع %s","notification_file_uploaded":"تم ارفاق ملف جدد الي مشروع %s","notification_closed":"تم اغلاق مشروع %s","notification_new_message":"لديك رسالة جديدة من %s","notification_rate_provider":"قم بتقييم %s","appShareUrl":"https://ghasala.nasmedia.net/app-download","payment_url":"http://ghasala.nasmedia.net/payments/confirm/|ORDER_ID|"},"paths":{"avatars":"media/avatars/","products_sections":"media/products_sections/","products_categories":"media/products_categories/","shops":"media/shops/","payments_options":"media/payments_options/","resize":"http://ghasala.nasmedia.net/resize?src="},"payments_options":[{"id":1,"titleAr":"كاش","titleEn":"Cash","icon":"2017-01-23-19-41-15-a3286.png"}],"services":[{"id":1,"titleAr":"غسيل عل ناشف","titleEn":"Dry Clean"}],"sections":[{"id":1,"titleAr":"دشداشة","titleEn":"Deshdasha","icon":"2017-01-23-19-31-23-b425e.png"}],"categories":[{"id":1,"titleAr":"شتوي","titleEn":"Winter","subTitleAr":"غسيل وكوي","subTitleEn":"Wash & Iron","icon":"2017-01-23-19-39-15-45c03.png"}],"provinces":[{"id":1,"titleAr":"محافظة العاصمة","titleEn":"Asima Governorate","areas":[{"id":1,"titleAr":"شرق","titleEn":"Sharq","apiName":"Sharq","province_id":1}]}],"user":null,"countries":[{"id":154,"titleAr":"الاورغوي","titleEn":"Alaurgoa","currency":"","rate":0,"phone_prefix":0,"alpha_2":"ur"}]}
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
             * settings : {"siteNameAr":"غسالة","siteNameEn":"Ghasala","phone":"66991985","mobile":"66991985","adminEmail":"info@ghasala.com","socialInstagram":"#","socialFacebook":"#","socialTwitter":"#","socialGoogle":"#","socialLinkedin":"#","socialYoutube":"#","facebookApiAndroid":"key|secret","facebookApiIphone":"key|secret","googleApiAndroid":"key|secret","googleApiIphone":"key|secret","notification_suitable_project":"مشروع جديد مناسب لك","notification_new_offer":"عرض جديد علي مشروع %s","notification_accepted":"تم قبول عرضك في مشروع %s","notification_file_uploaded":"تم ارفاق ملف جدد الي مشروع %s","notification_closed":"تم اغلاق مشروع %s","notification_new_message":"لديك رسالة جديدة من %s","notification_rate_provider":"قم بتقييم %s","appShareUrl":"https://ghasala.nasmedia.net/app-download","payment_url":"http://ghasala.nasmedia.net/payments/confirm/|ORDER_ID|"}
             * paths : {"avatars":"media/avatars/","products_sections":"media/products_sections/","products_categories":"media/products_categories/","shops":"media/shops/","payments_options":"media/payments_options/","resize":"http://ghasala.nasmedia.net/resize?src="}
             * payments_options : [{"id":1,"titleAr":"كاش","titleEn":"Cash","icon":"2017-01-23-19-41-15-a3286.png"}]
             * services : [{"id":1,"titleAr":"غسيل عل ناشف","titleEn":"Dry Clean"}]
             * sections : [{"id":1,"titleAr":"دشداشة","titleEn":"Deshdasha","icon":"2017-01-23-19-31-23-b425e.png"}]
             * categories : [{"id":1,"titleAr":"شتوي","titleEn":"Winter","subTitleAr":"غسيل وكوي","subTitleEn":"Wash & Iron","icon":"2017-01-23-19-39-15-45c03.png"}]
             * provinces : [{"id":1,"titleAr":"محافظة العاصمة","titleEn":"Asima Governorate","areas":[{"id":1,"titleAr":"شرق","titleEn":"Sharq","apiName":"Sharq","province_id":1}]}]
             * user : null
             * countries : [{"id":154,"titleAr":"الاورغوي","titleEn":"Alaurgoa","currency":"","rate":0,"phone_prefix":0,"alpha_2":"ur"}]
             */

            private SettingsBean settings;
            private PathsBean paths;
            private Object user;
            private List<PaymentsOptionsBean> payments_options;
            private List<ServicesBean> services;
            private List<SectionsBean> sections;
            private List<CategoriesBean> categories;
            private List<ProvincesBean> provinces;
            private List<CountriesBean> countries;

            public void setSettings(SettingsBean settings) {
                this.settings = settings;
            }

            public void setPaths(PathsBean paths) {
                this.paths = paths;
            }

            public void setUser(Object user) {
                this.user = user;
            }

            public void setPayments_options(List<PaymentsOptionsBean> payments_options) {
                this.payments_options = payments_options;
            }

            public void setServices(List<ServicesBean> services) {
                this.services = services;
            }

            public void setSections(List<SectionsBean> sections) {
                this.sections = sections;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public void setProvinces(List<ProvincesBean> provinces) {
                this.provinces = provinces;
            }

            public void setCountries(List<CountriesBean> countries) {
                this.countries = countries;
            }

            public SettingsBean getSettings() {
                return settings;
            }

            public PathsBean getPaths() {
                return paths;
            }

            public Object getUser() {
                return user;
            }

            public List<PaymentsOptionsBean> getPayments_options() {
                return payments_options;
            }

            public List<ServicesBean> getServices() {
                return services;
            }

            public List<SectionsBean> getSections() {
                return sections;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public List<ProvincesBean> getProvinces() {
                return provinces;
            }

            public List<CountriesBean> getCountries() {
                return countries;
            }

            public static class SettingsBean {
                /**
                 * siteNameAr : غسالة
                 * siteNameEn : Ghasala
                 * phone : 66991985
                 * mobile : 66991985
                 * adminEmail : info@ghasala.com
                 * socialInstagram : #
                 * socialFacebook : #
                 * socialTwitter : #
                 * socialGoogle : #
                 * socialLinkedin : #
                 * socialYoutube : #
                 * facebookApiAndroid : key|secret
                 * facebookApiIphone : key|secret
                 * googleApiAndroid : key|secret
                 * googleApiIphone : key|secret
                 * notification_suitable_project : مشروع جديد مناسب لك
                 * notification_new_offer : عرض جديد علي مشروع %s
                 * notification_accepted : تم قبول عرضك في مشروع %s
                 * notification_file_uploaded : تم ارفاق ملف جدد الي مشروع %s
                 * notification_closed : تم اغلاق مشروع %s
                 * notification_new_message : لديك رسالة جديدة من %s
                 * notification_rate_provider : قم بتقييم %s
                 * appShareUrl : https://ghasala.nasmedia.net/app-download
                 * payment_url : http://ghasala.nasmedia.net/payments/confirm/|ORDER_ID|
                 */

                private String siteNameAr;
                private String siteNameEn;
                private String phone;
                private String mobile;
                private String adminEmail;
                private String socialInstagram;
                private String socialFacebook;
                private String socialTwitter;
                private String socialGoogle;
                private String socialLinkedin;
                private String socialYoutube;
                private String facebookApiAndroid;
                private String facebookApiIphone;
                private String googleApiAndroid;
                private String googleApiIphone;
                private String notification_suitable_project;
                private String notification_new_offer;
                private String notification_accepted;
                private String notification_file_uploaded;
                private String notification_closed;
                private String notification_new_message;
                private String notification_rate_provider;
                private String appShareUrl;
                private String payment_url;

                public void setSiteNameAr(String siteNameAr) {
                    this.siteNameAr = siteNameAr;
                }

                public void setSiteNameEn(String siteNameEn) {
                    this.siteNameEn = siteNameEn;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public void setAdminEmail(String adminEmail) {
                    this.adminEmail = adminEmail;
                }

                public void setSocialInstagram(String socialInstagram) {
                    this.socialInstagram = socialInstagram;
                }

                public void setSocialFacebook(String socialFacebook) {
                    this.socialFacebook = socialFacebook;
                }

                public void setSocialTwitter(String socialTwitter) {
                    this.socialTwitter = socialTwitter;
                }

                public void setSocialGoogle(String socialGoogle) {
                    this.socialGoogle = socialGoogle;
                }

                public void setSocialLinkedin(String socialLinkedin) {
                    this.socialLinkedin = socialLinkedin;
                }

                public void setSocialYoutube(String socialYoutube) {
                    this.socialYoutube = socialYoutube;
                }

                public void setFacebookApiAndroid(String facebookApiAndroid) {
                    this.facebookApiAndroid = facebookApiAndroid;
                }

                public void setFacebookApiIphone(String facebookApiIphone) {
                    this.facebookApiIphone = facebookApiIphone;
                }

                public void setGoogleApiAndroid(String googleApiAndroid) {
                    this.googleApiAndroid = googleApiAndroid;
                }

                public void setGoogleApiIphone(String googleApiIphone) {
                    this.googleApiIphone = googleApiIphone;
                }

                public void setNotification_suitable_project(String notification_suitable_project) {
                    this.notification_suitable_project = notification_suitable_project;
                }

                public void setNotification_new_offer(String notification_new_offer) {
                    this.notification_new_offer = notification_new_offer;
                }

                public void setNotification_accepted(String notification_accepted) {
                    this.notification_accepted = notification_accepted;
                }

                public void setNotification_file_uploaded(String notification_file_uploaded) {
                    this.notification_file_uploaded = notification_file_uploaded;
                }

                public void setNotification_closed(String notification_closed) {
                    this.notification_closed = notification_closed;
                }

                public void setNotification_new_message(String notification_new_message) {
                    this.notification_new_message = notification_new_message;
                }

                public void setNotification_rate_provider(String notification_rate_provider) {
                    this.notification_rate_provider = notification_rate_provider;
                }

                public void setAppShareUrl(String appShareUrl) {
                    this.appShareUrl = appShareUrl;
                }

                public void setPayment_url(String payment_url) {
                    this.payment_url = payment_url;
                }

                public String getSiteNameAr() {
                    return siteNameAr;
                }

                public String getSiteNameEn() {
                    return siteNameEn;
                }

                public String getPhone() {
                    return phone;
                }

                public String getMobile() {
                    return mobile;
                }

                public String getAdminEmail() {
                    return adminEmail;
                }

                public String getSocialInstagram() {
                    return socialInstagram;
                }

                public String getSocialFacebook() {
                    return socialFacebook;
                }

                public String getSocialTwitter() {
                    return socialTwitter;
                }

                public String getSocialGoogle() {
                    return socialGoogle;
                }

                public String getSocialLinkedin() {
                    return socialLinkedin;
                }

                public String getSocialYoutube() {
                    return socialYoutube;
                }

                public String getFacebookApiAndroid() {
                    return facebookApiAndroid;
                }

                public String getFacebookApiIphone() {
                    return facebookApiIphone;
                }

                public String getGoogleApiAndroid() {
                    return googleApiAndroid;
                }

                public String getGoogleApiIphone() {
                    return googleApiIphone;
                }

                public String getNotification_suitable_project() {
                    return notification_suitable_project;
                }

                public String getNotification_new_offer() {
                    return notification_new_offer;
                }

                public String getNotification_accepted() {
                    return notification_accepted;
                }

                public String getNotification_file_uploaded() {
                    return notification_file_uploaded;
                }

                public String getNotification_closed() {
                    return notification_closed;
                }

                public String getNotification_new_message() {
                    return notification_new_message;
                }

                public String getNotification_rate_provider() {
                    return notification_rate_provider;
                }

                public String getAppShareUrl() {
                    return appShareUrl;
                }

                public String getPayment_url() {
                    return payment_url;
                }
            }

            public static class PathsBean {
                /**
                 * avatars : media/avatars/
                 * products_sections : media/products_sections/
                 * products_categories : media/products_categories/
                 * shops : media/shops/
                 * payments_options : media/payments_options/
                 * resize : http://ghasala.nasmedia.net/resize?src=
                 */

                private String avatars;
                private String products_sections;
                private String products_categories;
                private String shops;
                private String payments_options;
                private String resize;

                public void setAvatars(String avatars) {
                    this.avatars = avatars;
                }

                public void setProducts_sections(String products_sections) {
                    this.products_sections = products_sections;
                }

                public void setProducts_categories(String products_categories) {
                    this.products_categories = products_categories;
                }

                public void setShops(String shops) {
                    this.shops = shops;
                }

                public void setPayments_options(String payments_options) {
                    this.payments_options = payments_options;
                }

                public void setResize(String resize) {
                    this.resize = resize;
                }

                public String getAvatars() {
                    return avatars;
                }

                public String getProducts_sections() {
                    return products_sections;
                }

                public String getProducts_categories() {
                    return products_categories;
                }

                public String getShops() {
                    return shops;
                }

                public String getPayments_options() {
                    return payments_options;
                }

                public String getResize() {
                    return resize;
                }
            }

            public static class PaymentsOptionsBean {
                /**
                 * id : 1
                 * titleAr : كاش
                 * titleEn : Cash
                 * icon : 2017-01-23-19-41-15-a3286.png
                 */

                private int id;
                private String titleAr;
                private String titleEn;
                private String icon;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
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

                public String getIcon() {
                    return icon;
                }
            }

            public static class ServicesBean {
                /**
                 * id : 1
                 * titleAr : غسيل عل ناشف
                 * titleEn : Dry Clean
                 */

                private int id;
                private String titleAr;
                private String titleEn;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
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
            }

            public static class SectionsBean {
                /**
                 * id : 1
                 * titleAr : دشداشة
                 * titleEn : Deshdasha
                 * icon : 2017-01-23-19-31-23-b425e.png
                 */

                private int id;
                private String titleAr;
                private String titleEn;
                private String icon;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
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

                public String getIcon() {
                    return icon;
                }
            }

            public static class CategoriesBean {
                /**
                 * id : 1
                 * titleAr : شتوي
                 * titleEn : Winter
                 * subTitleAr : غسيل وكوي
                 * subTitleEn : Wash & Iron
                 * icon : 2017-01-23-19-39-15-45c03.png
                 */

                private int id;
                private String titleAr;
                private String titleEn;
                private String subTitleAr;
                private String subTitleEn;
                private String icon;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public void setSubTitleAr(String subTitleAr) {
                    this.subTitleAr = subTitleAr;
                }

                public void setSubTitleEn(String subTitleEn) {
                    this.subTitleEn = subTitleEn;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
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

                public String getSubTitleAr() {
                    return subTitleAr;
                }

                public String getSubTitleEn() {
                    return subTitleEn;
                }

                public String getIcon() {
                    return icon;
                }
            }

            public static class ProvincesBean {
                /**
                 * id : 1
                 * titleAr : محافظة العاصمة
                 * titleEn : Asima Governorate
                 * areas : [{"id":1,"titleAr":"شرق","titleEn":"Sharq","apiName":"Sharq","province_id":1}]
                 */

                private int id;
                private String titleAr;
                private String titleEn;
                private List<AreasBean> areas;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public void setAreas(List<AreasBean> areas) {
                    this.areas = areas;
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

                public List<AreasBean> getAreas() {
                    return areas;
                }

                public static class AreasBean {
                    /**
                     * id : 1
                     * titleAr : شرق
                     * titleEn : Sharq
                     * apiName : Sharq
                     * province_id : 1
                     */

                    private int id;
                    private String titleAr;
                    private String titleEn;
                    private String apiName;
                    private int province_id;

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setTitleAr(String titleAr) {
                        this.titleAr = titleAr;
                    }

                    public void setTitleEn(String titleEn) {
                        this.titleEn = titleEn;
                    }

                    public void setApiName(String apiName) {
                        this.apiName = apiName;
                    }

                    public void setProvince_id(int province_id) {
                        this.province_id = province_id;
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

                    public String getApiName() {
                        return apiName;
                    }

                    public int getProvince_id() {
                        return province_id;
                    }
                }
            }

            public static class CountriesBean {
                /**
                 * id : 154
                 * titleAr : الاورغوي
                 * titleEn : Alaurgoa
                 * currency :
                 * rate : 0
                 * phone_prefix : 0
                 * alpha_2 : ur
                 */

                private int id;
                private String titleAr;
                private String titleEn;
                private String currency;
                private int rate;
                private int phone_prefix;
                private String alpha_2;

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitleAr(String titleAr) {
                    this.titleAr = titleAr;
                }

                public void setTitleEn(String titleEn) {
                    this.titleEn = titleEn;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }

                public void setRate(int rate) {
                    this.rate = rate;
                }

                public void setPhone_prefix(int phone_prefix) {
                    this.phone_prefix = phone_prefix;
                }

                public void setAlpha_2(String alpha_2) {
                    this.alpha_2 = alpha_2;
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

                public String getCurrency() {
                    return currency;
                }

                public int getRate() {
                    return rate;
                }

                public int getPhone_prefix() {
                    return phone_prefix;
                }

                public String getAlpha_2() {
                    return alpha_2;
                }
            }
        }
    }
}
