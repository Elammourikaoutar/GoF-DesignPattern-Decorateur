# GoF-DesignPattern-Decorateur
Nous avons vu que représenter notre boisson plus le schéma de tarification des
ingrédients au moyen de l’héritage n’a pas bien fonctionné; nous obtenons
• une explosion de classes,
• une conception rigide,

• ou nous ajoutons à la classe de base des fonctionnalités non appropriée pour certaines sous-
classes.

Voici ce que nous allons faire.
• Nous allons commencer par une boisson
• et nous allons la décorer avec des ingrédients au moment de l’exécution.
Si, par exemple, le client veut un Sumatra avec Chocolat et Chantilly, nous allons:
• Créer un objet Sumatra
• Le décorer avec un objet Chocolat
• Le décorer avec un objet Chantilly
• Appeler la méthode cout() et nous appuyer sur la délégation pour ajouter les coûts des
ingrédients.

Voici le diagramme de classe de notre application:

![image](https://github.com/Elammourikaoutar/GoF-DesignPattern-Decorateur/assets/106027819/791dffa3-c295-4598-901c-00bd6221e17e)

L'architecture de notre application:

![image](https://github.com/Elammourikaoutar/GoF-DesignPattern-Decorateur/assets/106027819/ce57f2eb-5cf0-46ca-b7b5-523d1ee450a9)

Affichage de l'execution:

![image](https://github.com/Elammourikaoutar/GoF-DesignPattern-Decorateur/assets/106027819/6229cc9b-e0da-4be2-9913-ed99b156bb30)
