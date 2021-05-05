package com.benkyou.interface_;

public class Interface03 {
    public static void main(String[] args) {

        MySQL_DB mySQL_db = new MySQL_DB();
        t(mySQL_db);

        OracleDB oracleDB = new OracleDB();
        t(oracleDB);

    }


    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}


