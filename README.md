# spring-boot-dubbo
> springboot整合dubbo 多个客户端与服务端

## api
> 统一entity和service管理

## provider-log
> 服务端之一，提供log服务，并未添加web依赖

## provider-message
> 服务端之一，提供message服务，添加了web依赖

## consumer
> 客户端，添加但原车测试

## pom依赖

> 写在api下面

```
<dependencies>
    <dependency>
        <groupId>org.apache.dubbo</groupId>
        <artifactId>dubbo-spring-boot-starter</artifactId>
        <version>2.7.1</version>
    </dependency>
    <dependency>
        <groupId>org.apache.dubbo</groupId>
        <artifactId>dubbo</artifactId>
        <version>2.7.1</version>
    </dependency>
    <dependency>
        <groupId>org.apache.dubbo</groupId>
        <artifactId>dubbo-dependencies-zookeeper</artifactId>
        <version>2.7.1</version>
        <exclusions>
            <exclusion>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-log4j12</artifactId>
            </exclusion>
        </exclusions>
        <type>pom</type>
    </dependency>
</dependencies>
```
