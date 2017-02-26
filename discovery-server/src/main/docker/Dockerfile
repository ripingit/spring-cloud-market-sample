FROM utsman/spring-cloud-market-sample-base
VOLUME /tmp
ADD discovery-server.jar /app.jar
COPY ./run.sh /run.sh
RUN chmod u+x /run.sh
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS="-Xmx256m"

CMD ["./run.sh"]

EXPOSE 8761
