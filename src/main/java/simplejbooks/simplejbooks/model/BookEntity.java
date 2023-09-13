package simplejbooks.simplejbooks.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "books")
@Entity
public class BookEntity implements Serializable {

	@ManyToMany
	private List<AuthorEntity> authors;
	
	@ManyToOne
	@JoinColumn(name = "subcategory_id", nullable = false)
	private SubcategoryEntity subcategory;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "book_title")
	private String bookTitle;

	@Column(name = "book_isbn")
	private String bookIsbn;

	@Column(name = "book_description")
	private String bookDescription;

	@Column(name = "book_price")
	private double bookPrice;

	public SubcategoryEntity getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubcategoryEntity subcategory) {
		this.subcategory = subcategory;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

}