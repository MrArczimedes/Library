INSERT INTO LIBRARY (id, name, address, zipcode) VALUES (1,'Biblioteka Narodowa', 'Adres 1', '00-001');
INSERT INTO LIBRARY (id, name, address, zipcode) VALUES (2,'Biblioteka Za Rogiem', 'Adres 2', '00-020');
INSERT INTO LIBRARY (id, name, address, zipcode) VALUES (3,'Biblioteka Przy Rogu', 'Adres 3', '00-300');
INSERT INTO CATEGORY (id, library_id, name) VALUES (1,1,'Fantasy');
INSERT INTO CATEGORY (id, library_id, name) VALUES (2,2,'Fantasy');
INSERT INTO CATEGORY (id, library_id, name) VALUES (3,3,'Fantasy');
INSERT INTO CATEGORY (id, library_id, name) VALUES (4,1,'Sci-Fi');
INSERT INTO CATEGORY (id, library_id, name) VALUES (5,2,'Sci-Fi');
INSERT INTO CATEGORY (id, library_id, name) VALUES (6,3,'Sci-Fi');
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(1,1,'Wiedzmin 1','A. Sapkowski', 9);
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(2,2,'Wiedzmin 2','A. Sapkowski', 8);
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(3,3,'Wiedzmin 3','A. Sapkowski', 7);
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(4,1,'Wiedzmin 4','A. Sapkowski', 5);
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(5,2,'Wiedzmin 5','A. Sapkowski', 4);
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(6,3,'Wiedzmin 6','A. Sapkowski', 3);
INSERT INTO BOOK (id, category_id, name, author, rate) VALUES(7,1,'Wiedzmin 7','A. Sapkowski', 2);