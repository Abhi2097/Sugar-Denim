package com.niit.dao;

import com.niit.models.Supplier;

public interface SupplierDao {
	 Supplier saveSupplier(Supplier supplier);
	 Supplier getSupplier(int id);
}
