package simplejbooks.simplejbooks.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "items")
@Entity
public class ItemEntity implements Serializable {

	@OneToOne
	@JoinColumn(name = "book_id", nullable = false)
	BookEntity book;

	@ManyToOne
	@JoinColumn(name = "catrt_id", nullable = false)
	CartEntity cart;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "item_quantity")
	private int itemQuantity;

	public BookEntity getBook() {
		return book;
	}

	public void setBook(BookEntity book) {
		this.book = book;
	}

	public CartEntity getCart() {
		return cart;
	}

	public void setCart(CartEntity cart) {
		this.cart = cart;
	}

	public Long getId() {
		return id;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

}
