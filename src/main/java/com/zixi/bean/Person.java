package com.zixi.bean;

import java.util.*;

public class Person {
    private int No;
    private String pName;
    private String gender;
    private String[] hobbies;
    private Address address;
    private List<String> lists;
    private Set<Integer> sets;
    private Map<String, Object> maps;
    private Properties properties;

    public Person() {
        System.out.println("你创建了没");
    }

    public int getNo() {
        return No;
    }

    @Override
    public String toString() {
        return "Person{" +
                "No=" + No +
                ", pName='" + pName + '\'' +
                ", gender='" + gender + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }

    public Person(int no, String pName, String gender, String[] hobbies, Address address, List<String> lists, Set<Integer> sets, Map<String, Object> maps, Properties properties) {
        No = no;
        this.pName = pName;
        this.gender = gender;
        this.hobbies = hobbies;
        this.address = address;
        this.lists = lists;
        this.sets = sets;
        this.maps = maps;
        this.properties = properties;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<Integer> getSets() {
        return sets;
    }

    public void setSets(Set<Integer> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(int no, String pName, String gender) {
        No = no;
        this.pName = pName;
        this.gender = gender;
    }
}
