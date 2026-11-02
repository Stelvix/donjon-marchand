# Utiliser l'image de java temurin
FROM eclipse-temurin:25-jdk

# Définir le répertoire de travail dans le conteneur
WORKDIR /donjon-marchand-app

# Copier le fichier JAR de l'application
COPY target/donjon-marchand-app.jar app.jar

# Exposer le port sur lequel l'application écoute
EXPOSE 9003

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]