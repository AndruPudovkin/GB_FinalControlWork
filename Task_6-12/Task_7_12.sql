-- Задача 7 
CREATE DATABASE  IF NOT EXISTS Human_Friends;
-- Задача 8
USE human_friends;
CREATE TABLE IF NOT EXISTS `animal` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `name_owner` VARCHAR(30) NOT NULL,
  `age` DATE NULL,
  `id_type` INT NOT NULL,
  PRIMARY KEY (`id`));
 
  
CREATE TABLE IF NOT EXISTS  `commands` (
  `id` INT NOT NULL,
  `name_commands` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE IF NOT EXISTS `animal_type` (
  `id` INT NOT NULL,
  `name_type` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `animal_commands` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_animal` INT NOT NULL,
  `id_commands` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_animal`) REFERENCES animal(id) ON DELETE CASCADE,
FOREIGN KEY (`id_commands`) REFERENCES commands(id) ON DELETE CASCADE)  ;
  
   ALTER TABLE  animal
   ADD  FOREIGN KEY (`id_type`) REFERENCES animal_type(id) ON DELETE CASCADE;

-- задача 9
INSERT INTO `animal_type` (`id`, `name_type`) VALUES ('1', 'Сабака');
INSERT INTO `animal_type` (`id`, `name_type`) VALUES ('2', 'Кошка');
INSERT INTO `animal_type` (`id`, `name_type`) VALUES ('3', 'Хомяк');
INSERT INTO `animal_type` (`id`, `name_type`) VALUES ('4', 'Лошадь ');
INSERT INTO `animal_type` (`id`, `name_type`) VALUES ('5', 'Верблюд');
INSERT INTO `animal_type` (`id`, `name_type`) VALUES ('6', 'Ослик');

INSERT INTO `commands` (`id`, `name_commands`) VALUES ('1', 'Лежать');
INSERT INTO `commands` (`id`, `name_commands`) VALUES ('2', 'Лапу');
INSERT INTO `commands` (`id`, `name_commands`) VALUES ('3', 'Голос');
INSERT INTO `commands` (`id`, `name_commands`) VALUES ('4', 'Незнает команд');
INSERT INTO `commands` (`id`, `name_commands`) VALUES ('5', 'Ко мне');

INSERT INTO `animal` (`name`, `name_owner`, `age`, `id_type`) VALUES ('Васька', 'Петр', '22.10.20', '2');
INSERT INTO `animal` (`name`, `name_owner`, `age`, `id_type`) VALUES ('Шарик', 'Марат', '21.04.20', '1');
INSERT INTO	`animal` (`name`, `name_owner`, `age`, `id_type`) VALUES ('Степан', 'Ирина', '23.01.20', '3');
INSERT INTO `animal` (`name`, `name_owner`, `age`, `id_type`) VALUES ('Олег', 'Петр', '15.06.20', '4');
INSERT INTO `animal` (`name`, `name_owner`, `age`, `id_type`) VALUES ('Степан', 'Илья', '11.11.20', '5');
INSERT INTO `animal` (`name`, `name_owner`, `age`, `id_type`) VALUES ('Иа', 'Андрей', '21.04.20', '6');

INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('1', '1');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('1', '2');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('1', '3');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('2', '2');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('2', '5');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('4', '5');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('3', '4');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('5', '5');
INSERT INTO `animal_commands` (`id_animal`, `id_commands`) VALUES ('6', '5');
 
 -- Задача 10
 DELETE FROM animal_type WHERE id = 5;
 
CREATE TABLE IF NOT EXISTS horse_and_donkey  AS
SELECT  
	animal.id,
    animal.name,
    animal.name_owner,
    animal.age,
    animal_type.name_type
FROM animal 
JOIN animal_type
ON animal.id_type = animal_type.id
WHERE animal_type.id = 4 or animal_type.id = 6;

SELECT * from horse_and_donkey;

 -- Задача 11
 CREATE TABLE IF NOT EXISTS young_animal AS
	SELECT 	animal.id,
			animal.name,
			animal.name_owner,
			datediff( curdate(), animal.age) div 364 as age_year
	FROM animal
    WHERE date_add(animal.age, INTERVAL 1 YEAR) < curdate() 
            AND date_add(animal.age, INTERVAL 3 YEAR) > curdate();
            
	-- Задача 12	
    SELECT 	id,
			name,
			name_owner,
            name_type
	from horse_and_donkey
    UNION
    SELECT id,
			name,
			name_owner,
            age_year
	from young_animal;




