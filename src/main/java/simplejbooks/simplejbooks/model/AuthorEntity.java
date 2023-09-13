package simplejbooks.simplejbooks.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "authors")
@Entity
public class AuthorEntity {

	@ManyToMany
	List<BookEntity> books;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "author_name")
	private String authorName;

	public Long getId() {
		return id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public List<BookEntity> getBooks() {
		return books;
	}

	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}
}
