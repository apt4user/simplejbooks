package simplejbooks.simplejbooks.model;

import java.io.Serializable;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Table(name = "categories")
@Entity
public class CategoryEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "category_description")
	private String categoryDescription;

	@Column(name = "category_designator")
	private String categoryDesignator;

	public Long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryDesignator() {
		return categoryDesignator;
	}

	public void setCategoryDesignator(String categoryDesignator) {
		this.categoryDesignator = categoryDesignator;
	}
}
