# TP 11 : Spring Data REST

## 1. Compilation du projet sous CMD (Maven Build)
![Compilation du projet sous CMD](screenshots/01_cmd_build_maven.png)

## 2. Démarrage de l'application Spring Boot et initialisation des données (CommandLineRunner)
![Démarrage de l'application Spring Boot](screenshots/02_cmd_run_spring_boot.png)

## 3. Requête CMD - Récupération de tous les comptes (Exposition automatique & IDs exposés)
![GET /api/comptes](screenshots/03_cmd_get_comptes.png)

## 4. Requête CMD - Consultation d'un compte par son identifiant
![GET /api/comptes/1](screenshots/04_cmd_get_compte_by_id.png)

## 5. Requête CMD - Utilisation de la projection Solde (CompteProjection1)
![Projection Solde](screenshots/05_cmd_projection_solde.png)

## 6. Requête CMD - Utilisation de la projection Mobile (CompteProjection2)
![Projection Mobile](screenshots/06_cmd_projection_mobile.png)

## 7. Requête CMD - Recherche personnalisée par type de compte (/search/byType)
![Recherche par Type](screenshots/07_cmd_search_by_type.png)

## 8. Requête CMD - Pagination et Tri des comptes (?page=0&size=2&sort=solde,desc)
![Pagination et Tri](screenshots/08_cmd_pagination_tri.png)

## 9. Requête CMD - Récupération de la liste des clients
![GET /api/clients](screenshots/09_cmd_get_clients.png)

## 10. Requête CMD - Navigation relationnelle : comptes d'un client (/api/clients/1/comptes)
![Relation Client Comptes](screenshots/10_cmd_client_comptes_relation.png)

## 11. Requête CMD - Navigation relationnelle avec projection (ClientProjection)
![Client Projection](screenshots/11_cmd_client_projection.png)

## 12. Requête CMD - Ajout d'un nouveau compte (POST)
![POST Compte](screenshots/12_cmd_post_compte.png)

## 13. Requête CMD - Modification d'un compte existant (PUT)
![PUT Compte](screenshots/13_cmd_put_compte.png)

## 14. Requête CMD - Suppression d'un compte (DELETE)
![DELETE Compte](screenshots/14_cmd_delete_compte.png)

## 15. Requête CMD - Accès et vérification de la console H2 (/h2-console)
![Console H2](screenshots/15_cmd_h2_console.png)
