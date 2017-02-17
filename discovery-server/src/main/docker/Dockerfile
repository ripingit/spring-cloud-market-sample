FROM java:8
VOLUME /tmp
ADD discovery-server.jar /app.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS="-Xmx256m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

EXPOSE 8761
