<div align="center">

# Tri de Tableau d'Éléments

</div>

Le projet est une application Java qui met en œuvre différents algorithmes de tri pour trier un tableau d'éléments. Il permet de générer un tableau d'éléments aléatoires ou de le remplir manuellement, puis d'appliquer les algorithmes de tri pour obtenir le tableau trié.

## Classe "Element"

La classe **Element** représente un élément du tableau et contient une clé (entier) et une valeur (chaîne de caractères). Elle propose les fonctionnalités suivantes :

- Constructeurs pour initialiser l'élément avec une clé et une valeur spécifiques ou avec des valeurs par défaut.
- Accesseurs et mutateurs pour obtenir et modifier la clé et la valeur de l'élément.
- Méthode `toString()` pour obtenir une représentation textuelle de l'élément.

## Classe "TableauEl"

La classe **TableauEl** représente le tableau d'éléments à trier. Elle comprend les fonctionnalités suivantes :

- Un constructeur qui prend en paramètre la taille du tableau et crée un tableau vide de cette taille.
- Des méthodes pour obtenir la taille du tableau, récupérer un élément à une position donnée ou obtenir le tableau complet.
- Méthode `manuel()` pour remplir le tableau manuellement en demandant à l'utilisateur de saisir la clé et la valeur pour chaque élément.
- Méthode `aleatoire()` pour générer aléatoirement des clés et des valeurs pour chaque élément du tableau.
- Algorithmes de tri : tri à bulle, tri par dénombrement et tri rapide.
- Méthode `toString()` pour obtenir une représentation textuelle du tableau d'éléments.

## Classe "Test"

La classe **Test** contient la méthode principale `main` où le programme est lancé. Dans cette méthode, un tableau d'éléments est créé avec une taille donnée. Ensuite, le tableau est rempli soit manuellement, soit de manière aléatoire. Après cela, les différents algorithmes de tri sont appliqués au tableau. Le tableau trié est affiché, et le temps d'exécution de chaque algorithme est mesuré et affiché à la console.

N'hésitez pas à explorer le code source et à exécuter le programme pour observer le fonctionnement des algorithmes de tri sur le tableau d'éléments.

**Note**: Assurez-vous d'avoir les classes "Element", "TableauEl" et "Test" dans le même package pour exécuter le programme correctement.

### Exemple d'exécution :

Après avoir donnée une au tableau et choisi une méthode de tris
```java
le tableau généré : 
Element [cle=2747 val=L]
Element [cle=3270 val=MGm]
Element [cle=695 val=oz]
Element [cle=3477 val=mlM]
Element [cle=2216 val=]

le tableau trié :
Element [cle=695 val=oz]
Element [cle=2216 val=]
Element [cle=2747 val=L]
Element [cle=3270 val=MGm]
Element [cle=3477 val=mlM]

le temps d'exécution est de : 
0 ms

```

N'hésitez pas à explorer le code source pour en savoir plus sur la mise en œuvre des algorithmes de tri et à expérimenter avec différentes tailles de tableaux ou méthodes de remplissage.
