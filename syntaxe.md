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
librairie doit être utilisée pour telle combinaison d'architecture et de OS.

Une solution à laquelle nous avons pensé c'était l'ajout d'une fonction
de jonction entre 2 enums. Ceci permetterait d'avoir deux énumerations et
de générer un 3e selon le contenu des 2 parents. Voici une syntaxe qui pourrait
être consideré pour cette fonctionalité:

```
enum A
    a
end
enum B
    b
end
enum C
    super A * B
end
```

Donc, dans le cas de notre exemple, il serait possible de créer 2 énumerations
et de faire la jonction entre les 2.

```
enum Arch
    x86
    amd64
    ia64
    arm
end
enum Os
    gnu
    bsd
    solaris
    nt
end
enum Libs
    super Arch * Os
end
```
Ensuite, pour importer la bonne librairie on pourrait faire:

```
if host == amd64.gnu then
    import amd64_gnu_lib
end
```

Une difficulté à laquelle nous avons pensé c'est comment baliser le 
comportement de cette jonction pour éviter que son utilisation devienne un
fardeau pour l'utilisateur. Une possible solution auquel nous avons pensé c'est
de forcer l'utilisateur qui désire profiter de cette fonctionalité à implémenter
certaines fonctions contenus dans une interface.

##Comparaison avec d'autres langages


