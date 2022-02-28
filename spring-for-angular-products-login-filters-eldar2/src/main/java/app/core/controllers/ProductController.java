package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Product;
import app.core.exceptions.ProductException;
import app.core.services.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public int addProducts(@RequestBody Product product, @RequestHeader String token) throws ResponseStatusException {
		try {
			return this.productService.addProduct(product);
		} catch (ProductException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}

	@GetMapping("/{productId}")
	public Product getOneProduct(@PathVariable int productId, @RequestHeader String token)
			throws ResponseStatusException {
		try {
			return this.productService.getOneProduct(productId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping
	public List<Product> getAllProducts(@RequestHeader String token) {
		return this.productService.getAllProducts();
	}

	@PutMapping
	public void updateProduct(@RequestBody Product product, @RequestHeader String token) throws ResponseStatusException {
		try {
			this.productService.updateProduct(product);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/{productId}")
	public void deleteOneProduct(@PathVariable int productId, @RequestHeader String token)
			throws ResponseStatusException {
		try {
			this.productService.deleteOneProduct(productId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping
	public void deleteAllProducts(@RequestHeader String token) {
		this.productService.deleteAllProducts();
	}

}
