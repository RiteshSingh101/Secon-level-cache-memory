# Hibernate Second Level Cache using EhCache

This project demonstrates the implementation of **Hibernate Second Level Cache** using **EhCache** with **PostgreSQL** database in a Java Maven project.

---

## Technologies Used

- Java
- Hibernate ORM
- JPA
- EhCache
- PostgreSQL
- Maven

---

## Project Objective

The main goal of this project is to understand:

- First Level Cache
- Second Level Cache
- Hibernate Caching Mechanism
- Entity Caching using EhCache
- Performance Optimization in Hibernate

---

## What is Second Level Cache?

Hibernate provides two types of caching:

### 1. First Level Cache
- Enabled by default
- Works within the same `EntityManager` / `Session`
- Data is cached temporarily

### 2. Second Level Cache
- Shared across multiple sessions
- Improves application performance
- Reduces unnecessary database queries
- Requires external cache provider like:
  - EhCache
  - Redis
  - Hazelcast
  - Infinispan

This project uses **EhCache** as the cache provider.

---

## Project Structure

```text
src
 ├── main
 │   ├── java
 │   │   └── com.mca
 │   │       ├── entity
 │   │       │   ├── Car.java
 │   │       │   └── Engine.java
 │   │       └── curd
 │   │           ├── Save.java
 │   │           └── Fetch.java
 │   └── resources
 │       ├── META-INF
 │       │   └── persistence.xml
 │       └── ehcache.xml
