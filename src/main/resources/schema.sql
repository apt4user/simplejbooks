DROP TABLE IF EXISTS CATEGORIES;
 
CREATE TABLE CATEGORIES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  category_name VARCHAR(250) NOT NULL,
  category_description VARCHAR(250) NOT NULL,
  category_designator VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS SUBCATEGORIES;

CREATE TABLE SUBCATEGORIES (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    subcategory_topic VARCHAR(250) NOT NULL,
    subcategory_description VARCHAR(250) NOT NULL,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES CATEGORIES(id)
);

DROP TABLE IF EXISTS BOOKS;

CREATE TABLE BOOKS (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    book_title VARCHAR(250) NOT NULL,
    book_isbn VARCHAR(250) NOT NULL,
    book_description VARCHAR(250) NOT NULL,
    book_price NUMERIC(5,2) NOT NULL,
    subcategory_id INT,
    FOREIGN KEY (subcategory_id) REFERENCES SUBCATEGORIES(id)
);