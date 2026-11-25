# Donjon-Marchand

## Ceci est le backend du projet Donjon-Marchand. Il est développé en Java avec le framework Spring Boot.

### Etape 1 :
Utiliser Spring Initializr pour générer un projet Spring Boot avec les dépendances suivantes :
- Spring Web
- Spring Data JPA
- H2 Database
- Spring Security
- Et lombok

### Etape 2 :
Configurer le fichier `application.yaml` pour définir les propriétés de l'application, en y ajoutant le port du serveur à 9003.

### Etape 3 :
Mettre en place le dockerfile pour containeriser l'application. On utilise la version temurin de java 25
Et voici le contenu du dockerfile :

```
# l'image de base pour l'application Java
FROM eclipse-temurin:25-jre 

# répertoire de travail pour l'application
WORKDIR /app

# copier le fichier JAR généré dans le conteneur
COPY target/donjon-marchand-0.0.1-SNAPSHOT.jar app.jar

# exposer le port sur lequel l'application écoute
EXPOSE 9003

# définir le point d'entrée pour exécuter l'application
ENTRYPOINT ["java","-jar","app.jar"]
```

### Etape 4 :
Initialiser un dépôt Git pour le projet et créer un fichier.
`.gitignore` pour ignorer les fichiers et dossiers inutiles.

### Etape 5 :
Voici les commandes pour exécuter le projet :

```
- mvn spring-boot:run :  pour exécuter le projet en utilisant Maven.
- mvn clean package : pour créer un fichier JAR exécutable du projet.
- docker build -t donjon-marchand . : pour construire l'image Docker de l'application.
```

### Etape 6 :
Pour exécuter l'application dans un conteneur Docker, utilisez la commande suivante :
```
docker run -p 9003:9003 donjon-marchand
```
