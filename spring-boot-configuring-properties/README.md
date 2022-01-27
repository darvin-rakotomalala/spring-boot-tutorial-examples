## Spring Boot - configuration des propriétés exemple
Dans ce repo, nous allons voir un petit guide de configuration des propriétés de Spring Boot.

### Contexte
---
Par défaut, le fichier `application.properties` peut être utilisé pour stocker des paires de propriétés, 
bien que vous puissiez également définir n'importe quel nombre de fichiers de propriétés supplémentaires.<br/><br/>

`application.properties` - Il s'agit du fichier par défaut sur lequel Spring s'appuie pour charger les propriétés. 
Nous pouvons écrire nos propriétés personnalisées ou spécifiques à Spring sous forme de paires clé-valeur ici :
```
message.default.welcome=Welcome...
message.default.goodbye=Goodbye...
```

Au lieu du fichier properties, nous pouvons également utiliser un fichier `.yml` et définir les mêmes propriétés que :
```
message:
  default:
    welcome: Welcome...
    goodbye: Goodbye...
```

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes :<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Exemples
---
* Injecter des propriétés à l'aide de l'annotation `@Value` - permet de définir une valeur par défaut si celle demandée
* Injection de propriétés à l'aide de l'annotation `@ConfigurationProperties` - qui mappera les propriétés sur des objets Java
* Utilisation de Spring Profiles - La manière la plus courante d'écrire des propriétés "modifiables" consiste à les stocker dans différents fichiers. Ces fichiers sont spécifiques à l'environnement et notre application peut les charger en fonction des variables d'environnement.
Exemple convention de dénomination - `application-<environment>.properties` pour nos fichiers de propriétés :
	* application-dev.properties
	* application-qa.properties
	* application-production.properties , etc.

Pour indiquer à Spring quels fichiers utiliser, nous devons définir une variable d'environnement - `spring.profiles.active`.<br/>
Cela étant dit, si la valeur de `spring.profiles.active` est `dev`, par exemple, Spring boot chargera le fichier `application-dev.properties` et de même.<br/>

*Remarque : `application.properties` est toujours chargé, quelle que soit la valeur `spring.profiles.active`.*<br/><br/>

Nous pouvons également passer le `spring.profiles.active` en tant qu'argument de ligne de commande comme :
```
java -jar -Dspring.profiles.active=dev greeting-service-0.0.1-SNAPSHOT.jar
```

Voilà ! nous avons réalisé comment configurer les propriétés dans une application Spring Boot.