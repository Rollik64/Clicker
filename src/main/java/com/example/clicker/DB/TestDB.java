package com.example.clicker.DB;


public class TestDB {
    private int countDB = 8;

    public TestDB() {
    }

    public TestDB(int countDB) {
        this.countDB = countDB;
    }

    public int getCountDB() {
        return countDB;
    }

    public void setCountDB(int countDB) {
        this.countDB = countDB;
    }
}
