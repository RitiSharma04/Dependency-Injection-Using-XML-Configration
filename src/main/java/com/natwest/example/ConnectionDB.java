package com.natwest.example;

public class ConnectionDB {
    String usernme;
    String password;
    String dbName;

    public String getUsernme() {
        return usernme;
    }

    public void setUsernme(String usernme) {
        this.usernme = usernme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ConnectionDB() {
    }

    public ConnectionDB(String usernme, String password, String dbName) {
        this.usernme = usernme;
        this.password = password;
        this.dbName = dbName;
    }

    String displayConnectionDetails(){
        return "ConnectionDB{" +
                "usernme='" + usernme + '\'' +
                ", password='" + password + '\'' +
                ", dbName='" + dbName + '\'' +
                '}';
    }
}
