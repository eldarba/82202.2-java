package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Item;
import app.core.repos.ItemRepo;

@Service
@Transactional
public class ItemService {

	@Autowired
	private ItemRepo itemRepo;

	public int addItem(Item item) {
		if (itemRepo.existsById(item.getId())) {
			throw new RuntimeException("addItem failed - item already exists");
		}
		return this.itemRepo.save(item).getId();
	}

	public Item getItem(int id) {
		Optional<Item> opt = itemRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("get item with id " + id + " faild - not found");
		}
	}

	public List<Item> getAllItems() {
		return itemRepo.findAll();
	}

	public void updateItem(Item item) {
		System.out.println(item);
		if (itemRepo.existsById(item.getId())) {
			this.itemRepo.save(item);
		} else {
			throw new RuntimeException("updateItem failed - item not found");
		}
	}

	public void deleteItem(int id) {
		itemRepo.deleteById(id);
	}

}
