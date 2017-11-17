package reviewssitefullstack;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	CategoryRepository categoryRepo;
	@Resource
	ReviewRepository reviewRepo;
	@Resource
	TagRepository tagRepo;

	@RequestMapping("/categories")
	public String getAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/category")
	public String getOneCategory(@RequestParam Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping("/review")
	public String getOneReview(@RequestParam Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping("/tags")
	public String getAlltags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String getOneTag(@RequestParam Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}

	@RequestMapping("/add-tag")
	public String addATag(@RequestParam Long id, String tagName, Model model) {

		Tag addTag = tagRepo.findByTagName(tagName);
		if (addTag == null) {
			addTag = new Tag(tagName, null);
			tagRepo.save(addTag);
		}

		Review addTagToReview = reviewRepo.findOne(id);
		Set<Tag> tagExists = addTagToReview.getReviewTags();
		if (!tagExists.contains(addTag)) {
			addTagToReview.addTag(addTag);
			reviewRepo.save(addTagToReview);
		}

		return "redirect:/review?id=" + id;
	}

	@RequestMapping("/remove-tag")
	public String removeTag(@RequestParam Long id, String tagName, Model model) {

		Tag removeTag = tagRepo.findByTagName(tagName);
		if (removeTag != null) {
			Review tagToRemove = reviewRepo.findOne(id);
			Set<Tag> tagExists = tagToRemove.getReviewTags();
			if (tagExists.contains(removeTag)) {
				tagToRemove.removeTag(removeTag);
				reviewRepo.save(tagToRemove);
			}
		}

		return "redirect:/review?id=" + id;
	}

}
