package com.accp.renting.entity;

import java.util.Date;

public class House {
  private Integer  id;
  private Integer  typeid;
  private String  title;
  private String  descriptiond;
  private Integer  price;
  private Date pubdate;
  private Integer floorage;
  private String  contact;
  private Integer streetid;
  private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", typeid=" + typeid +
                ", title='" + title + '\'' +
                ", descriptiond='" + descriptiond + '\'' +
                ", price=" + price +
                ", pubdate=" + pubdate +
                ", floorage=" + floorage +
                ", contact='" + contact + '\'' +
                ", streetid=" + streetid +
                '}';
    }

    public House() {
    }

    public House(String title, String contact) {
        this.title = title;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptiond() {
        return descriptiond;
    }

    public void setDescriptiond(String descriptiond) {
        this.descriptiond = descriptiond;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Integer getFloorage() {
        return floorage;
    }

    public void setFloorage(Integer floorage) {
        this.floorage = floorage;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getStreetid() {
        return streetid;
    }

    public void setStreetid(Integer streetid) {
        this.streetid = streetid;
    }
}
