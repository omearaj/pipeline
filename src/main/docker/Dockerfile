FROM java:8
VOLUME /tmp
ADD pipeline-0.0.1-SNAPSHOT.jar app.jar
#ADD pipeline-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
#RUN chmod a+x /app
# Test comment
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080