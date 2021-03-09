FROM openjdk:8
COPY ./target/Scientific-Calculator-with-Devops-1.0-SNAPSHOT.jar ./
ADD ./target/libs ./libs
WORKDIR ./
RUN touch calculator_log.txt
