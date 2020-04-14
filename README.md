# ppshuai_betterserver_vertx
ppshuai_betterserver_vertx

## 1.安装vscode
https://code.visualstudio.com/
## 2.安装vscode-java插件

## 3.安装maven
http://maven.apache.org/

## 4.vscode配置mvn路径为绝对路径

## 5.修改maven安装路径下conf/settings.xml
在mirrors节点中，添加镜像下载地址
<mirror>
    <id>aliyunmaven</id>
    <mirrorOf>*</mirrorOf>
    <name>阿里云公共仓库</name>
    <url>https://maven.aliyun.com/repository/public</url>
</mirror>
