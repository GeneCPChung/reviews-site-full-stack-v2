package reviewssitefullstack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String categoryName;
	private String images;

	@OneToMany(mappedBy = "movieCategory")
	private Set<Review> movieReviews;

	protected Category() {

	}

	public Category(String categoryName, String images, Set<Review> movieReviews) {
		this.categoryName = categoryName;
		this.images = images;
		this.movieReviews = movieReviews;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getImages() {
		return images;
	}

	public Set<Review> getMovieReviews() {
		return movieReviews;
	}

}
