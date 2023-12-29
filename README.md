# OrderCraft - Gestion des Commandes

## Aperçu du Projet

L'entreprise artisanale ArtWood a entrepris le développement d'une application de gestion des commandes dans le but d'optimiser le processus de traitement des commandes clients. L'objectif principal est d'améliorer l'efficacité opérationnelle en facilitant l'ajout de nouvelles commandes, en suivant l'état d'avancement des commandes en cours et en marquant les commandes comme complètes une fois qu'elles ont été traitées.
## Structure des Packages

```
ordercraft.project
|-- main
    |-- java
        |--com.ordercraft
            |-- entity
            |-- enums
            |-- repository
            |-- service
            |-- web
    |-- resources
    |-- webapp
            |-- resources
            |-- WEB-INF
               |-- views
                     |-- client
                     |-- error
                     |-- order
                     |-- product



## Classes et Interfaces


#### Attributs :

- `url: jdbc:mysql://localhost:3306/customer_db`
- `username: root`
- `password:`

#### Méthodes :

- `getInstance()`: Retourne une instance unique de la connexion à la base de données.

### 2. Client (Classe)

Cette classe représente une entité client.

#### Attributs :

- `id`: Identifiant unique du client.
- `name`: Nom du client.
- `email`: Adresse e-mail du client.
- `phone`: Numéro de téléphone du client.

#### Méthodes :

- Constructeurs, getters et setters.

### 3. ClientDao (Classe)

Cette classe gère les opérations de base de données liées aux clients.

#### Méthodes :

- `insertClient(Client)`: Insère un nouveau client dans la base de données.
- `selectClientById(int)`: Récupère un client par ID depuis la base de données.
- `selectAllClients()`: Récupère une liste de tous les clients depuis la base de données.
- `deleteClient(int)`: Supprime un client par ID depuis la base de données.

### 4. ClientService (Classe)

Cette classe fournit des services liés aux clients.

#### Méthodes :

- `listClients(HttpServletRequest, HttpServletResponse)`: Récupère une liste de clients depuis la base de données et les transmet à la page JSP.

### 5. ClientServlet (Classe)

Cette servlet gère les requêtes HTTP liées aux clients.

#### Méthodes :

- `doGet(HttpServletRequest, HttpServletResponse)`: Traite les requêtes GET liées aux clients.

## Pages JSP

### 1. client-list.jsp

Cette page JSP affiche une liste de clients.

#### Fonctionnalités :

- Itère sur la liste des clients à l'aide de `<c:forEach>`.
- Affiche les détails du client dans un tableau.
- Fournit des liens pour éditer et supprimer les clients.

## Déploiement

Expliquez comment déployer l'application, y compris les dépendances et les fichiers de configuration.

## Bibliothèques Externes

- [Thymeleaf](link_to_thymeleaf)
- [Hibernate](link_to_hibernate)

## Notes Additionnelles

Incluez toutes les notes supplémentaires ou considérations pour les développeurs travaillant sur ou maintenant le projet.

Ce modèle est un point de départ, et vous pouvez le personnaliser en fonction des détails spécifiques de votre projet.
