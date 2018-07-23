# ftpclient的再次封装 与Spring进行整合
>ftpclient的基本的封装，包括上传以及下载的基本的方法


`上传：` 基本的配置项

  <pre> 
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://www.springframework.org/schema/beans
          http://www.springframework.org/schema/beans/spring-beans.xsd">
      <!--  ftp的配置文件  -->
      <bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
          <property name="order" value="11"/>
          <property name="localOverride" value="true"/>
          <property name="locations">
              <list>
                  <value>classpath*:ftp.properties</value>
              </list>
          </property>
      </bean>
  
  
      <!--  ftpServer的基本的配置  -->
      <bean id="ftpServer" class="com.test.ftp.testftp.upload.impl.FTPServerImpl">
          <property name="ftpHost" value="${ftp.host}"/>
          <property name="ftpPort" value="${ftp.port}"/>
          <property name="ftpUser" value="${ftp.user}"/>
          <property name="ftpPassword" value="${ftp.password}"/>
          <property name="basePath" value="${ftp.basePath}"/>
          <property name="localPath" value="${ftp.localPath}"/>
      </bean>
  
  </beans>
  
  </pre>

`下载：`