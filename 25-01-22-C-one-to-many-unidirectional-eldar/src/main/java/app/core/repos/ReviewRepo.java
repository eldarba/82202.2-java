package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

}
