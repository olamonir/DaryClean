package com.example.ola.dryclean.Classes;

/**
 * Created by ola on 1/16/2017.
 */

public class Constants {


    // all final  varaibale is upper case
    public static final String GENERAL_URL = "http://ghasala.nasmedia.net/api/";
    public static String getGetLundryInfo(int page){
        return GENERAL_URL +String.format("shops/view/" , page);
    }
    public static final String GET_DRY_LIST = GENERAL_URL + "shops/area/1";
    public static final String GET_REVIEWS_LIST = GENERAL_URL + "shops/reviews/2";
    public static final String GET_USER_INFO = GENERAL_URL + "users/view/34";
    public static final String GET_LUNDRY_INFO = GENERAL_URL + "shops/view/";
    public static final String GET_SETTING = GENERAL_URL + "settings";
    public static final String GET_LAST_ORDERS = GENERAL_URL + "orders/my-orders/34";




    public static final String Header ="application/json";



}
