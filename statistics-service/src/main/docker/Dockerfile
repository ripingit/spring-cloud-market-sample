FROM utsman/spring-cloud-market-sample-base
VOLUME /tmp
ADD statistics-service.jar /app.jar
COPY ./run.sh /run.sh
RUN chmod u+x /run.sh
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""

CMD ["./run.sh"]

EXPOSE 9000
