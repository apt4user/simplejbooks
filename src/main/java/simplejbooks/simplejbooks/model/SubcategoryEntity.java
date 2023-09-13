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
	@JoinColumn(name = "category_id", nullable = false)
	private CategoryEntity category;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "subcategory_topic")
	private String subcategoryTopic;

	@Column(name = "subcategory_description")
	private String subcategoryDescription;

	public Long getId() {
		return id;
	}
	
	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public String getSubcategoryTopic() {
		return subcategoryTopic;
	}

	public void setSubcategoryTopic(String subcategoryTopic) {
		this.subcategoryTopic = subcategoryTopic;
	}

	public String getSubcategoryDescription() {
		return subcategoryDescription;
	}

	public void setSubcategoryDescription(String subcategoryDescription) {
		this.subcategoryDescription = subcategoryDescription;
	}

}
