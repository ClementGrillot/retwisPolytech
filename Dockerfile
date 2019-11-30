FROM tomcat:9.0.29-jdk13-openjdk-oracle

ADD target/retwisj-v3.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]