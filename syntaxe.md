#La syntaxe de l'énumeration

##Analyse de la grammaire Nit

Dans la grammaire de Nit, il existe présentement des tokens et des productions 
pour des enums. Par exemple, dans le fichier 
[nit.sablecc3xx](https://raw.github.com/privat/nit/master/src/parser/nit.sablecc3xx)
à la ligne 101, il existe une déclaration de token pour les mots-clés d'un enum et 
à la ligne 236 la déclaration de sa production. La syntaxe que nous allons proposer
est semblable à celle d'une déclaration de classe, alors nous ne croyons pas avoir
de grandes modifications à la grammaire de Nit.

##Syntaxe proposée

Nous avons fait une analyse des énumerations dans d'autres langages afin de 
proposer bonne syntaxe tout en suivant le "coding-style" de Nit. Suite à des
discussions avec Alexis Laferrière, un des contributeurs au projet Nit, nous
proposons la syntaxe suivante:

```
enum <Nom>
    <Clé> [= valeur]
    .
    .
end
```

##Fonctionalité souhaitable

Lors de nos discussions avec Alexis Laferrière, nous avons pensé à une 
fonctionalité des énumérations qui serait souhaitable d'implémenter.
Prenons le problème de distribution d'un logiciel dans l'écosystème
informatique d'aujourd'hui avec plusieurs architectures et systèmes
d'exploitation. Il peut rapidement devenir difficile de savoir quelle
librairie doit être utilisée pour tel combinaison d'architecture et de OS.

Une solution à laquelle nous avons pensé c'était l'utilisation d'
>TODO parler plan cartésien
