server:
        port:7777
spring:
datasource:
url: jdbc:mysql://localhost:3306/jc_blog?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai
username: root
password: 123456
driver-class-name: com.mysql.cj.jdbc.Driver
servlet:
multipart:
max-file-size: 2MB
max-request-size: 5MB
mybatis-plus:
configuration:
# 日志
log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
global-config:
db-config:
logic-delete-field: delFlag
logic-delete-value: 1
logic-not-delete-value: 0
id-type: auto

oss:
accessKey: hRGbnKtRXcGCwFeiuzg7XiJr7Aa5misFnuVv9-sO
secretKey: G7zEg1ZUghFLYKKAYYDTaLqSVRNA5iMTU3t3ZMYN
bucket: jessie-blog