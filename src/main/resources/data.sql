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