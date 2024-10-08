# Utilizando a imagem oficial do OpenJDK 11 para rodar a aplicação
FROM openjdk:11-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiando o arquivo JAR gerado pela aplicação para o diretório do container
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Definindo a variável de ambiente para o nome da aplicação
ENV SPRING_PROFILES_ACTIVE=prod

# Expondo a porta que será utilizada pela aplicação
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
