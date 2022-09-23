# Flyway Demo
这个样例解决的目的是探究: 如何单独启动 flyway 程序将 spring 程序中的 flyway 刷到数据库中   

运行之前 首先使用 docker 启动数据库

```bash
docker run --name mysql -d  -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password --restart unless-stopped mysql:8
```

单独启动 flyway 程序
```bash
chmod +x build-and-run-flyway.sh
sh build-and-run-flyway.sh
```

