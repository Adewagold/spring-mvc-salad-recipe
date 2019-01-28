FROM davidcaste/alpine-java-unlimited-jce:jre8
ARG PORT
ARG SPRING_PROFILE
ENV PORT_ENV=${PORT}
ENV SPRING_PROFILE_ENV=${SPRING_PROFILE}
EXPOSE ${PORT}
ARG JAR_FILE
COPY ${JAR_FILE} middleware.jar
ENTRYPOINT ["java", "-Xmx4g", "-Dserver.port=${PORT_ENV}", "-jar", "middleware.jar"]