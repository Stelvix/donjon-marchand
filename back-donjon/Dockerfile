# Utiliser l'image de java temurin
FROM eclipse-temurin:25-jre

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR de l'application
COPY target/donjon-marchand-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port sur lequel l'application écoute
EXPOSE 9003

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]