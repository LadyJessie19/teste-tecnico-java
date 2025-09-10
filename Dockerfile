# Estágio 1: build
FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app
COPY src /app/src
RUN javac -encoding UTF-8 -d . src/com/iniflex/industria/*.java

# Estágio 2: runtime
FROM eclipse-temurin:17-jre AS runtime

WORKDIR /app
COPY --from=builder /app /app

CMD ["java", "-Dfile.encoding=UTF-8", "com.iniflex.industria.Principal"]
