## Spring Boot DTO Pattern - Implementation et Mapping
Dans ce repo, nous allons voir un exemple de modèle Data Transfer Object (DTO) en Java - Implémentation et mappage à l'aide de Spring Boot.<br/>
Créons une application qui prend en charge le suivi de la localisation de vos amis. Nous allons créer une application Spring Boot qui expose une API REST. En l'utilisant, nous pourrons récupérer les emplacements des utilisateurs à partir d'une base de données PostgreSQL.<br/>
Nous utilisons les outils de mappage, tels que MapStruct ou ModelMapper.

### Data Transfer Object (DTO)
---
Le modèle de conception Data Transfer Object (DTO) est l'un des modèles d'architecture d'application d'entreprise qui appelle à l'utilisation d'objets qui agrègent et encapsulent des données pour le transfert. Un objet de transfert de données est, essentiellement, comme une structure de données. Il ne doit pas contenir de logique métier mais doit contenir des mécanismes de sérialisation et de désérialisation.<br/><br/>
Les DTO peuvent soit contenir toutes les données d'une source, soit des données partielles. Ils peuvent également contenir des données provenant de sources uniques ou multiples. Une fois mis en œuvre, les DTO deviennent le moyen de transport de données entre les systèmes.<br/><br/>
Le DTO est destiné à être utilisé dans les appels à distance pour promouvoir la sécurité et le couplage lâche. S'il est appliqué à des systèmes locaux, il s'agit simplement de sur-concevoir une fonctionnalité simple.

### Exemples
---
* Mappage manuellement
* Mappage en utilisant ModelMapper 
* Mappage en utilisant MapStruct

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes :<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce projet nous allons utiliser les dependances de base suivants :
* **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.
* **Spring Data JPA** - sert à stocker et à récupérer des données entre une base de données relationnelle et un objet Java (POJO).
* **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.
* **PostgreSQL** - est destiné au pilote JDBC pour connecter les applications clientes à la base de données PostgreSQL.
* **springdoc-openapi-ui** - dépendances pour la documentation de l'API swagger 3.
* **ModelMapper** - est une excellente bibliothèque de mappage qui nous permet de mapper entre les modèles et les DTO.
* **MapStruct** - est un générateur de code open source basé sur Java qui crée du code pour les implémentations de mappage.

### Exigences technique
---
- Les données sont stockées dans un SGBD<br/>
- L'application est composé de 4 couches :<br/>
    - La couche de données (model) pour les classes entités (domain object et DTO).<br/>
    - La couche DOA (Repository, Spring Data, JPA, Hibenate et JDBC) pour interagir avec la base de données.<br/>
    - La couche métier pour le traitement de la logique métier.<br/>
    - La couche infrastructure (controller)  basée sur Rest API pour traiter la logique d'entreprise.

### Exécuter et tester les API
---
Pour tester les APIs vous pouvez utiliser Postman, Swagger, curl ou n'importe quel client HTTP :
* L'API d'URL GET `/api/locations` - renvoie une liste des emplacements de l'utilisateur.

Voila ! dans ce repo nous avons réalisé un exemple d'API REST pour la gestion de produit avec une base PostgreSQL.