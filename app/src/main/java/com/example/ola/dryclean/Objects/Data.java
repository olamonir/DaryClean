package com.example.ola.dryclean.Objects;

import java.util.List;

/**
 * Created by ola on 1/24/2017.
 */

public class Data  {
    public static final String TOTAL = "total";
    public static final String PER_PAGE = "per_page";
    public static final String CURRENT_PAGE = "current_page";
    public static final String LAST_PAGE = "last_page";
    public static final String FROM = "from";
    public static final String TO = "to";
    public static final String ID = "id";
    public static final String SHOP_ID = "shop_id";
    public static final String USER_ID = "user_id";
    public static final String RATE = "rate";
    public static final String COMMENT = "comment";
    public static final String CREATED_AT = "created_at";
    public static final String UPDATED_AT = "updated_at";
    public static final String USER = "user";
    public static final String DATA = "data";

    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private int from;
    private int to;
    private int id;
    private int shop_id;
    private int user_id;
    private int rate;
    private String comment;
    private String created_at;
    private String updated_at;
    private User user;
    private List<Data> data;

    public Data(){ }

    public Data setTotal(int total){
        this.total = total;
        return this;
    }
    public int getTotal(){
        return this.total;
    }
    public Data setPer_page(int per_page){
        this.per_page = per_page;
        return this;
    }
    public int getPer_page(){
        return this.per_page;
    }
    public Data setCurrent_page(int current_page){
        this.current_page = current_page;
        return this;
    }
    public int getCurrent_page(){
        return this.current_page;
    }
    public Data setLast_page(int last_page){
        this.last_page = last_page;
        return this;
    }
    public int getLast_page(){
        return this.last_page;
    }
    public Data setFrom(int from){
        this.from = from;
        return this;
    }
    public int getFrom(){
        return this.from;
    }
    public Data setTo(int to){
        this.to = to;
        return this;
    }
    public int getTo(){
        return this.to;
    }
    public Data setId(int id){
        this.id = id;
        return this;
    }
    public int getId(){
        return this.id;
    }
    public Data setShop_id(int shop_id){
        this.shop_id = shop_id;
        return this;
    }
    public int getShop_id(){
        return this.shop_id;
    }
    public Data setUser_id(int user_id){
        this.user_id = user_id;
        return this;
    }
    public int getUser_id(){
        return this.user_id;
    }
    public Data setRate(int rate){
        this.rate = rate;
        return this;
    }
    public int getRate(){
        return this.rate;
    }
    public Data setComment(String comment){
        this.comment = comment;
        return this;
    }
    public String getComment(){
        return this.comment;
    }
    public Data setCreated_at(String created_at){
        this.created_at = created_at;
        return this;
    }
    public String getCreated_at(){
        return this.created_at;
    }
    public Data setUpdated_at(String updated_at){
        this.updated_at = updated_at;
        return this;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }
    public Data setUser(User user){
        this.user = user;
        return this;
    }
    public User getUser(){
        return this.user;
    }
    public Data setData(List<Data> data){
        this.data = data;
        return this;
    }
    public List<Data> getData(){
        return this.data;
    }
}
