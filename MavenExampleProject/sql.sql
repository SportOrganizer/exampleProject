drop table teams;
drop table players;

CREATE TABLE TEAMS (
id INT(6) AUTO_INCREMENT PRIMARY KEY,
kapitan_id INT(6),
name VARCHAR(128) NOT NULL,
skratka VARCHAR(128) NOT NULL,
reg_date TIMESTAMP
) ;


CREATE TABLE PLAYERS (
id INT(6)  AUTO_INCREMENT PRIMARY KEY,
TEAM_ID INT(6),
meno VARCHAR(128) NOT NULL,
priezvisko VARCHAR(128) NOT NULL,
cislo INT(2) NOT NULL,
datum_narodenia DATE
);


ALTER TABLE PLAYERS ADD CONSTRAINT fk_PlayerTeam FOREIGN KEY (TEAM_ID) REFERENCES TEAMS(id);
ALTER TABLE TEAMS ADD CONSTRAINT fk_kapitanPlayer FOREIGN KEY (kapitan_id) REFERENCES Players(id);


INSERT INTO TEAMS (name, skratka) VALUES ("dinosaury", "dino");
INSERT INTO TEAMS (name, skratka) VALUES ("najlepsi tim", "naj");
INSERT INTO TEAMS (name,skratka) VALUES ("treti tim", "3");

INSERT INTO PLAYERS (meno,priezvisko,cislo, team_id) VALUES ("peter","ondovcik",5,1);
INSERT INTO PLAYERS (meno,priezvisko,cislo, team_id) VALUES ("kristian","kacinetz",3,2);
INSERT INTO PLAYERS (meno,priezvisko,cislo, team_id) VALUES ("jan","polacek",2,3);
INSERT INTO PLAYERS (meno,priezvisko,cislo, team_id) VALUES ("kristian","stroka",6,1);
INSERT INTO PLAYERS (meno,priezvisko,cislo, team_id) VALUES ("tomas","prieboj",10,1);


Update Teams set kapitan_id = 1 where id = 1;
Update Teams set kapitan_id = 2 where id = 2;
Update Teams set kapitan_id = 3 where id = 3;
Update Teams set kapitan_id = 3 where id = 3;