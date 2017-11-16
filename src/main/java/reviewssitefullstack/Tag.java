package reviewssitefullstack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tagName;

	@ManyToMany(mappedBy = "reviewTags")
	private Set<Review> tags;

	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public Set<Review> getTag() {
		return tags;
	}

}
