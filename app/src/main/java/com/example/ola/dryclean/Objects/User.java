package com.example.ola.dryclean.Objects;

/**
 * Created by ola on 1/24/2017.
 */

public class User {
    public static final String ID = "id";
    public static final String AVATAR = "avatar";
    public static final String NAME = "name";
    public static final String USERNAME = "username";
    public static final String EMAIL = "email";
    public static final String PHONE = "phone";
    public static final String COUNTRY_ID = "country_id";
    public static final String IS_ADMIN = "isAdmin";
    public static final String ROLE_ID = "role_id";
    public static final String REMEMBER_TOKEN = "remember_token";
    public static final String ACTIVE = "active";
    public static final String CREATED_AT = "created_at";
    public static final String UPDATED_AT = "updated_at";

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

    public User(){ }

    public User setId(int id){
        this.id = id;
        return this;
    }
    public int getId(){
        return this.id;
    }
    public User setAvatar(String avatar){
        this.avatar = avatar;
        return this;
    }
    public String getAvatar(){
        return this.avatar;
    }
    public User setName(String name){
        this.name = name;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public User setUsername(String username){
        this.username = username;
        return this;
    }
    public String getUsername(){
        return this.username;
    }
    public User setEmail(String email){
        this.email = email;
        return this;
    }
    public String getEmail(){
        return this.email;
    }
    public User setPhone(String phone){
        this.phone = phone;
        return this;
    }
    public String getPhone(){
        return this.phone;
    }
    public User setCountry_id(int country_id){
        this.country_id = country_id;
        return this;
    }
    public int getCountry_id(){
        return this.country_id;
    }
    public User setIsAdmin(int isAdmin){
        this.isAdmin = isAdmin;
        return this;
    }
    public int getIsAdmin(){
        return this.isAdmin;
    }
    public User setRole_id(int role_id){
        this.role_id = role_id;
        return this;
    }
    public int getRole_id(){
        return this.role_id;
    }
    public User setRemember_token(String remember_token){
        this.remember_token = remember_token;
        return this;
    }
    public String getRemember_token(){
        return this.remember_token;
    }
    public User setActive(int active){
        this.active = active;
        return this;
    }
    public int getActive(){
        return this.active;
    }
    public User setCreated_at(String created_at){
        this.created_at = created_at;
        return this;
    }
    public String getCreated_at(){
        return this.created_at;
    }
    public User setUpdated_at(String updated_at){
        this.updated_at = updated_at;
        return this;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }
}