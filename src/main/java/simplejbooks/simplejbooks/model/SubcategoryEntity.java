package simplejbooks.simplejbooks.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "subcategories")
@Entity
public class SubcategoryEntity implements Serializable {
	
	@OneToMany(mappedBy = "subcategory")
	private List<BookEntity> books;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable=false)
	CategoryEntity category;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	
	
	
	
}
