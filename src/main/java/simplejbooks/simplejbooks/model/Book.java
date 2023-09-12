package simplejbooks.simplejbooks.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "book")
@Entity
public class Book implements Serializable{
	public Book(String string) {
		firstName = string;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Long id;
	@Column(name = "first_name")
	String firstName;

	public String getFirstName() {
		return firstName;
	}

}