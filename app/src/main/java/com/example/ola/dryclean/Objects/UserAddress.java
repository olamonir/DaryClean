package com.example.ola.dryclean.Objects;

/**
 * Created by ola on 1/20/2017.
 */

public class UserAddress  {
    private Integer id;
    private Integer user_id;
    private String address;
    private Integer province_id;
    private Integer area_id;
    private Integer block;
    private Integer gada;
    private Integer qasima;
    private Integer building;
    private Integer floor;
    private Integer flat_house;
    private String notes;
    private String created_at;
    private String updated_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getGada() {
        return gada;
    }

    public void setGada(Integer gada) {
        this.gada = gada;
    }

    public Integer getQasima() {
        return qasima;
    }

    public void setQasima(Integer qasima) {
        this.qasima = qasima;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFlat_house() {
        return flat_house;
    }

    public void setFlat_house(Integer flat_house) {
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
