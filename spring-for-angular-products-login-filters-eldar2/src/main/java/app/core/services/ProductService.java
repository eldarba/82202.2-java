package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Product;
import app.core.exceptions.ProductException;
import app.core.repos.ProductRepo;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public int addProduct(Product product) throws ProductException {
		if (this.productRepo.existsById(product.getId())) {
			throw new ProductException("addProduct failed - already exists: " + product.getId());
		}
		return this.productRepo.save(product).getId();
	}

	public Product getOneProduct(int productId) throws ProductException {
		Optional<Product> opt = this.productRepo.findById(productId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new ProductException("getOneProduct failed - not found: " + productId);
		}
	}

	public List<Product> getAllProducts() {
		return this.productRepo.findAll();
	}

	public void updateProduct(Product product) throws ProductException {
		if (this.productRepo.existsById(product.getId())) {
			this.productRepo.save(product);
		} else {
			throw new ProductException("updateProduct failed - not found: " + product.getId());
		}
	}

	public void deleteOneProduct(int productId) throws ProductException {
		Optional<Product> opt = this.productRepo.findById(productId);
		if (opt.isPresent()) {
			this.productRepo.delete(opt.get());
		} else {
			throw new ProductException("deleteOneProduct failed - not found: " + productId);
		}
	}

	public void deleteAllProducts() {
		this.productRepo.deleteAll();
	}
}
