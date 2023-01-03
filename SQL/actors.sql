CREATE TABLE film_actor(actor_id smallint, film_id smallint);
INSERT INTO film_actor VALUES(1, 1);
INSERT INTO film_actor VALUES(2, 1);
INSERT INTO film_actor VALUES(2, 2);
INSERT INTO film_actor VALUES(3, 2);
INSERT INTO film_actor VALUES(1, 2);
INSERT INTO film_actor VALUES(3, 3);
INSERT INTO film_actor VALUES(1, 3);
INSERT INTO film_actor VALUES(1, 4);
INSERT INTO film_actor VALUES(3, 4);
INSERT INTO film_actor VALUES(1, 5);
DELETE FROM film_actor;

CREATE TABLE actor(actor_id smallint, first_name varchar(45), last_name varchar(45));
INSERT INTO actor VALUES (1, "Sean", "Bean");
INSERT INTO actor VALUES (2, "Ian", "Holms");
INSERT INTO actor VALUES (3, "Elijia", "Wood");
DELETE FROM actor;

CREATE TABLE film(film_id smallint, title varchar(255));
INSERT INTO film VALUES(1, "The Hobbit");
INSERT INTO film VALUES(2, "The Lord of the Rings");
INSERT INTO film VALUES(3, "Magic Mike");
INSERT INTO film VALUES(4, "Breaking Bad");
INSERT INTO film VALUES(5, "American Dad");

SELECT DISTINCT first_actor,
                second_actor,
                film.title
FROM
    (SELECT CONCAT(a1.first_name, ' ', a1.last_name) as first_actor,
            a1.actor_id as actor_id1,
            CONCAT(a2.first_name, ' ', a2.last_name) as second_actor,
            a2.actor_id as actor_id2,
            COUNT(*) as film_count
     FROM film_actor as actor1
              inner join actor a1 using(actor_id),
          film_actor as actor2
              inner join actor a2 using(actor_id)
     WHERE actor1.actor_id < actor2.actor_id AND actor1.film_id = actor2.film_id
     GROUP BY first_actor, actor_id1, second_actor, actor_id2
     ORDER BY film_count DESC
     LIMIT 1) as t,
    film_actor as f inner join film using(film_id)
WHERE f.film_id in (SELECT fa1.film_id
                    FROM film_actor fa1, film_actor fa2
                    WHERE fa1.film_id = fa2.film_id AND t.actor_id1 = fa1.actor_id AND t.actor_id2 = fa2.actor_id);


