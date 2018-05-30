package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
@Component
public class ReviewsPopulator implements CommandLineRunner {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {
		Tag tagG = new Tag("G", null);
		tagRepo.save(tagG);
		Tag tagPg = new Tag("PG", null);
		tagRepo.save(tagPg);
		Tag tagPg13 = new Tag("PG-13", null);
		tagRepo.save(tagPg13);
		Tag tagR = new Tag("R", null);
		tagRepo.save(tagR);

		Category category1 = new Category("Sci-Fi", "/images/the-matrix.jpg", null);
		categoryRepo.save(category1);
		Category category2 = new Category("Chick-Flicks", "/images/beaches.jpg", null);
		categoryRepo.save(category2);
		Category category3 = new Category("Comedy", "/images/dumb-and-dumber.jpg", null);
		categoryRepo.save(category3);
		Category category4 = new Category("Drama", "/images/fmj.jpg", null);
		categoryRepo.save(category4);
		Category category5 = new Category("Family", "/images/puff.jpg", null);
		categoryRepo.save(category5);

		Review review1 = new Review("The Matrix", "/images/the-matrix.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",
				category1, tagPg13);
		reviewRepo.save(review1);
		Review review2 = new Review("Beaches", "/images/beaches.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",
				category2, tagPg);
		reviewRepo.save(review2);
		Review review3 = new Review("Dumb & Dumber", "/images/dumb-and-dumber.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rtrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category3, tagPg);
		reviewRepo.save(review3);
		Review review4 = new Review("Full Metal Jacket", "/images/fmj.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",
				category4, tagR);
		reviewRepo.save(review4);
		Review review5 = new Review("The Matrix: Reloaded", "/images/the-matrix.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusrutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category1, tagR);
		reviewRepo.save(review5);
		Review review6 = new Review("Titanic", "/images/titanic.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category2, tagPg);
		reviewRepo.save(review6);
		Review review7 = new Review("Big Trouble in Little China", "/images/big-trouble.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",
				category3, tagPg13);
		reviewRepo.save(review7);
		Review review8 = new Review("The Godfather", "/images/godfather.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusrutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category4, tagR);
		reviewRepo.save(review8);
		Review review9 = new Review("Aladin", "/images/aladin.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",
				category5, tagG);
		reviewRepo.save(review9);
		Review review10 = new Review("Puff The Magic Dragon", "/images/puff.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusrutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category5, tagG);
		reviewRepo.save(review10);

	}

}
*/