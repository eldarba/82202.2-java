package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Store;

public interface StoreRepo extends JpaRepository<Store, Integer> {

}
