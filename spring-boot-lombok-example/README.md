## Spring Boot Lombok exemples
Dans ce repo, nous allons voir un petit guide du projet Lombok avec Spring Boot.

### Qu'est-ce que Lombok ?
---
**Lombok** est une bibliothèque open source utilisée pour réduire le code standard dans les classes Java. 
Ceci est réalisé en remplaçant de nombreux morceaux de code répétitifs par des annotations simples et concises.<br/>
Ainsi, avec Lombok, vous pouvez vous débarrasser de toutes les méthodes getter et setter, du hashcode, des méthodes equals et bien d'autres simplement en ajoutant des annotations.

**Dépendance de Lombok**
```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>{version}</version>
    <scope>provided</scope>
</dependency>
```
*Remarque : La portée est `provided` telle que Lombok est une dépendance de construction pure et non une dépendance d'exécution. Cela signifie que nous nous attendons à ce que l'application nous fournisse la dépendance à l'exécution.*

### Annotations de Lombok
---
* **@Getter et @Setter** - Ces annotations peuvent être utilisées au niveau d'un champ ou d'une classe. S'il est utilisé au niveau de la classe, il générera des getters et des setters pour tous les champs de la classe
```
@Getter
@Setter
public class User {
    private String name;
    private String email;
}
```
Si vous voulez des getters/setters pour certains champs uniquement, annotez-les en conséquence :
```
public class User {
    @Getter
    @Setter
    private String name;
    private String email;
}
```
* **@AllArgsConstructor** * - Le décorateur `@AllArgsConstructor` générera un constructeur public avec tous les champs déclarés dans votre classe dans le même ordre qu'ils sont définis
```
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}
```
* **@NoArgsConstructor** - va générer un constructeur sans arguments
```
@NoArgsConstructor
public class User {
    private String name;
    private String email;
}
```
* **@RequiredArgsConstructor** - va générer un constructeur avec tous les champs final de la classe
```
@RequiredArgsConstructor
public class User {
    private final String name;
    private String email;
}
```
*Remarque : `@NoArgsConstructor` et `@RequiredArgsConstructor` ne peuvent pas être utilisés ensemble et généreront une erreur de compilation si vous essayez de le faire.*

* **@EqualsAndHashCode** - peut utiliser utilisé au niveau de la classe qui générera des implémentations pour `equals(Object other)` et des méthodes `hashCode()`.
```
@EqualsAndHashCode
public class User {
    private String name;
    private String email;
    private Integer age;
}
```
S'il y a certains champs que vous ne souhaitez pas inclure dans les méthodes `equals` ou `hashCode`, nous pouvons exclure ces champs spécifiques en utilisant `@EqualsAndHashCode.Exclude` :
```
@EqualsAndHashCode
public class User {
    private String name;
    private String email;

    @EqualsAndHashCode.Exclude
    private Integer age;
}
```
Alternativement, nous pouvons spécifier les champs à inclure en utilisant `@EqualsAndHashCode.Include` et `@EqualsAndHashCode(onlyExplicitlyIncluded = true)` :
```
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @EqualsAndHashCode.Include
    private String name;

    @EqualsAndHashCode.Include
    private String email;

    private Integer age;
}
```
* **@ToString** - 
De même, `@ToString` peut être utilisé pour générer l'implémentation `toString()`. Par défaut, tous les champs non statiques seront imprimés. Vous pouvez spécifier d'inclure ou d'ignorer certains champs en utilisant une combinaison de `@ToString.Exclude`, `@ToString.Include`, et `@ToString(onlyExplicitlyIncluded = true)` comme avant :
```
@ToString(onlyExplicitlyIncluded = true)
public class User {

    @ToString.Include
    private String name;

    @ToString.Include
    private String email;

    private Integer age;
}
```
* **@Data** - Cela regroupe les fonctionnalités de `@Getter/@Setter`, `@EqualsAndHashCode` et ensemble `@ToString` comme `@RequiredArgsConstructor` si vous les aviez toutes empilées :
```
@Data
public class User {
    private final String name;
    private String email;
}
```
* **@Value** - Parfois, nous voulons que notre objet soit immuable après sa création. `@Valuee` est une variante immuable de `@Data` et est utilisé exactement à cette fin.
Par défaut, tous les champs sont rendus définitifs et les setters ne sont pas créés :
```
@Value
public class User {
    private String name;
    private String email;
}
```
* **@Builder** - est un modèle de conception de création utilisé pour aider à créer des objets étape par étape.
```
@Builder
@Data
public class User {
    private String name;
    private String email;
}
```
On peut maintenant créer l'objet `User` à l'aide du modèle Builder sans tout le code requis pour le prendre en charge :
```
User user = new User.UserBuilder()
	.email("test@test.com")
	.name("test name")
	.build();

System.out.println(user.getEmail());
```
* **Logging** - `@Log` crée une variable de journal avec un objet `java.util.logging.Logger.getLogger(LogExample.class.getName())`.

Voilà ! nous avons vu une introduction au projet Lombok et vu comment il facilite notre processus de développement en réduisant le code passe-partout avec de simples annotations. Cela améliore considérablement la lisibilité et la brièveté.