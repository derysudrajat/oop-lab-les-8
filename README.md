# oop-lab-les-8
This project contain exercieses form oop lab leeson 8 about JDBC (Java Database Connectivity)

## Download JDBC
You can download lates here [JDBC MySQL Connector](https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java-5.1.47.zip)

## Setup
Before you using this repository you must create databases called db_penjualan and on this database include one table called tabel_penjualan,
so we must create it first. Follow intruction bellow to create.

### Create Database
create db_penjualan
```sql
  CREATE DATABASE db_penjualan;
```
### Crate Table
now you must create tabel_penjualan
```sql
CREATE TABLE tabel_penjualan(
    kode VARCHAR(20),
    nama VARCHAR(20),
    harga INT
 );
```

