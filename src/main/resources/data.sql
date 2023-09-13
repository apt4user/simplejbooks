INSERT INTO 
	CATEGORIES (category_name, category_description, category_designator) 
VALUES
  	('Drama', 'Dramen', 'novel'),
	('Thriller', 'Thriller', 'novel'),
	('Fantasy', 'Fantasy-Bücher', 'novel'),
  	('Naturiwssenschaften', 'Bücher über Naturwissenschaften', 'nonfiction'),
  	('Informationstechnologie', 'Bücher über Informationstechnologien', 'nonfiction'),
  	('Mathematik', 'Bücher über Mathematik', 'nonfiction');
  	
  	INSERT INTO 
	SUBCATEGORIES (subcategory_topic, subcategory_description, category_id) 
VALUES
  	('High Fantasy', 'Bücher des Subgenres High Fantasy', 3),
	('Physik', 'Lehr-/ Sachbücher über Physik', 4),
	('Chemie', 'Lehr-/ Sachbücher über Chemie', 4),
  	('Algorithmen', 'Lehr-/ Sachbücher über Algorithmen', 5),
  	('Netzwerktechnik', 'Lehr-/ Sachbücher über Netzwerktechnik', 5),
  	('Analysis', 'Lehr-/ Sachbücher über Mathematik über Analysis', 6),
  	('Lineare Algebra', 'Lehr-/ Sachbücher über Lineare Algebra', 6);
  	
  	

  	
  	INSERT INTO 
	BOOKS (book_title, book_isbn, book_description, book_price, subcategory_id) 
VALUES
  	('Fliegende Fetzen', '3442456398', 'Scheibenwelt-Roman' , 20, 1),
	('Final Fantasy VII Remake', '1646091779', 'Final Fantasy VII Buch', 5 ,1),
	('Physik', '3868943633', 'Lehrbuch Physik', 90, 2),
  	('Physik', '3662679353', 'Lehrbuch Physik', 95, 2),
  	('Physikalische Chemie', '3527345507', 'Lehrbuch Physikalische Chemie', 70, 3),
  	('Organische Chemie', '3868943412', 'Lehrbuch Organische Chemie', 7, 4),
  	('The Algorithm Design Manual', '3030542556', 'Lehrbuch Algorithmen', 80, 4),
    ('Algorithmen', '3486748610','Lehrbuch Algorithmen', 105, 4),
    ('Technik der IP-Netze', '3446462104', 'Lehrbuch Netzwerktechnik', 60, 5),
    ('IT-Sicherheit für TCP/IP- und IoT-Netzwerke', '9783658226022', 'Lehrbuch IT-Sicherheit', 20, 5),
    ('Analysis 1', '3868941703', 'Lehrbuch Analysis', 50, 6),
    ('Gewöhnliche Differentialgleichungen', '9783658102401', 'Lehrbuch Mathematik', 30, 6),
    ('Lineare Algebra', '3868942718', 'Lehrbuch Lineare Algebra', 35, 7),
    ('Lineare Algebra 1', '3662632624', 'Lehrbuch Lineare Algebra', 35, 7);

  	
  	  	INSERT INTO 
	AUTHORS (author_name) 
VALUES
  	('Terry Pratchett'),
	('Kazushige Nojima'),
	('Giancoli'),
  	('Tipler'),
  	('Peter Atkins'),
  	('Paula Bruice'),
  	('Steven Skiena'),
  	('Thomas Cormen'),
  	('Anatol Badach'),
  	('Steffen Wendzel'),
  	('George Thomas'),
  	('Lars Grüne'),
  	('Michael Ruhrländer'),
  	('Stefan Waldmann');
  	
  	
  	  	  	  	INSERT INTO 
	AUTHORS_BOOKS(authors_id, books_id) 
VALUES
  	(1,1),
	(2,2),
	(3,3),
  	(4,4),
  	(5,5),
  	(6,6),
  	(7,7),
  	(8,8),
  	(9,9),
  	(10,10),
  	(11,11),
  	(12,12),
  	(13,13),
  	(14,14);
  	