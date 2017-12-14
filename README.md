# Jooq + PostgresQL custom type MVE #

illustractes an error when using PqSQL custom types in arrays

1. init a PgSQL database using schema.sql
2. set db properties in pom.xml
3. generate jooq classes: ```rm -rf src/generated/java && mvn package jooq-codegen:generate```
4. execute: ```mvn package exec:java``` 
5. observe "org.jooq.exception.DataTypeException: Cannot convert" error

