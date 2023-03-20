FROM shoothzj/compile:jdk17-mvn AS build
COPY . /opt/compile
WORKDIR /opt/compile
RUN mvn -B clean package -DskipTests

FROM shoothzj/base:jdk17

WORKDIR /opt/paas-dashboard

COPY --from=build /opt/compile/target/paas-dashboard-0.0.1-SNAPSHOT.jar /opt/paas-dashboard/paas-dashboard.jar
COPY --from=build /opt/compile/target/conf /opt/paas-dashboard/conf
COPY --from=build /opt/compile/target/lib /opt/paas-dashboard/lib

RUN wget -q https://github.com/paas-dashboard/paas-dashboard-portal-angular/releases/download/latest/paas-dashboard-portal.tar.gz && \
    tar -xzf paas-dashboard-portal.tar.gz && \
    rm -rf paas-dashboard-portal.tar.gz

ENV STATIC_PATH /opt/paas-dashboard/static/

EXPOSE 11111

CMD ["/usr/bin/dumb-init", "java", "-jar", "/opt/paas-dashboard/paas-dashboard.jar"]
