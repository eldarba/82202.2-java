package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
