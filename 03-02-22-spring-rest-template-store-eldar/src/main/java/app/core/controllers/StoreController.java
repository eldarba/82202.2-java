package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Store;
import app.core.services.StoreService;

@RestController
@RequestMapping("/api/store")
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	// create
	@PostMapping
	public ResponseEntity<?> addStore(@RequestBody Store store){
		try {
			int id = storeService.addStore(store);
			return ResponseEntity.ok(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	// read
	@GetMapping("/get-store/{storeId}")
	public ResponseEntity<?> getStore(@PathVariable int storeId){
		try {
			Store store = storeService.getStore(storeId);
			return ResponseEntity.ok(store);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@GetMapping("/get-store-items/{storeId}")
	public ResponseEntity<?> getStoreItems(@PathVariable int storeId){
		try {
			return ResponseEntity.ok(storeService.getStoreItems(storeId));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	// update
	@PutMapping
	public ResponseEntity<?> updateStore(@RequestBody Store store){
		try {
			storeService.updateStore(store);
//			return ResponseEntity.ok().build();
			return ResponseEntity.ok(null);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	// delete
	@DeleteMapping("/{storeId}")
	public ResponseEntity<?> deleteStore(@PathVariable int storeId){
		try {
			storeService.deleteStore(storeId);
			return ResponseEntity.ok(null);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
