# TP 5

## Liste des dépendances utilisées

### Spring Web	

Spring Web MVC est le module Spring consacré au développement d’application Web et d’API Web. Le nom de ce module renvoie directement au modèle MVC (Modèle Vue Contrôleur).

Voir [ici](https://gayerie.dev/docs/spring/spring/spring_mvc_intro.html) pour plus d'informations.

##### JPA

[Spring Data JPA](https://spring.io/projects/spring-data-jpa), permet d'implémenter rapidement des répertoires JPA.

La Java Persistence API (abrégée en JPA), est une interface de programmation Java permettant aux développeurs d'organiser des données relationnelles dans des applications utilisant la plateforme Java.

##### Hibernate

Hibernate est un framework Java qui fournit un mappage objet-relationnel et permet la persistance et l'extraction de données du base de données.

##### H2

H2 permet de créer des bases de données en Java.

##### DevTools

C'est un ensemble d'outils permettant une expérience de développement plus facile.

##### Thymeleaf

Thymeleaf est un Java XML/XHTML/HTML5 Template Engine qui peut travailler à la fois dans des environnements Web (Servlet) et celui de non Web. Il est mieux adapté pour diffuser XHTML/HTML5 sur View (View Layer) des applications Web basées sur MVC.

## Réponses aux questions

**Avec quelle partie du code avons-nous paramétré l’url d’appel /greeting ?**

Réponse : 

```
@RequestParam(name="nameGET", required=false, defaultValue="World") String nameGET, Model model
```

**Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?**

Réponse :

```
@GetMapping("/greeting")
```

**Comment envoyons-nous le nom `a qui nous disons bonjour avec le second lien ?**

Réponse :

```
model.addAttribute("nomTemplate", nameGET);
```

**Expliquez l’apparition de la nouvelle table**

Réponse :

La classe Address à permis de créer une nouvelle table dans la base de donnée

**Affichage de la table Address**

<table>
	<tr>
		<th>ID</th>
		<th>CONTENT</th>
		<th>CREATION</th>
	</tr>
	<tr>
		<td>1</td>
		<td>57 boulevard demorieux</td>
		<td>2021-10-22</td>
	</tr>
	<tr>
		<td>2</td>
		<td>51 allee du gamay, 34080 montpellier</td>
		<td>2021-10-22</td>
	</tr>
</table>

**A quoi sert @autowired**

Réponse :

@autowired sert à injecter les référence directement. On peut l'utiliser pour les attributs et les méthodes. 

## Ajout de *fragments*

Les *fragments* de Thymeleaf permettent d'insérer du contenu venant de templates dans le HTML directement.

J'ai donc ajouté deux *fragments* :
* head : le contenu de la balise <head> qui se retrouve dans chaque fichier
* nav : un menu de navigation qui devrait aussi être sur toutes les pages