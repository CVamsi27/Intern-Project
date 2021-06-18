package com.cognizant.vendor.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.cognizant.vendor.model.Vendor;
import com.cognizant.vendor.model.VendorStock;

@Service
public class VendorServiceImplementation implements VendorService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Vendor> getAllVendor() {

		String sql = "SELECT * FROM Vendor";

		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Vendor>>() {

			@Override
			public List<Vendor> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Vendor> vendorList = new ArrayList<Vendor>();

				while (rs.next()) {
					Vendor v = new Vendor(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
					vendorList.add(v);
				}
				return vendorList;

			}

		});
	}

	@Override
	public List<VendorStock> getAllVendorStock() {
		String sql = "SELECT * FROM Vendor_Stock";

		return jdbcTemplate.query(sql, new ResultSetExtractor<List<VendorStock>>() {

			@Override
			public List<VendorStock> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<VendorStock> vendorStockList = new ArrayList<VendorStock>();

				while (rs.next()) {
					VendorStock v = new VendorStock(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4));
					vendorStockList.add(v);
				}
				return vendorStockList;

			}

		});
	}

	@Override
	public List<Vendor> getDetail(String productId) {

		List<Vendor> vendorDetail = new ArrayList<Vendor>();
		List<Vendor> vendorList = getAllVendor();
		List<VendorStock> vendorStockList = getAllVendorStock();

		for (VendorStock a : vendorStockList) {
			if (productId.equalsIgnoreCase(a.getProductId()) && a.isStockInHand()) {

				for (Vendor v : vendorList) {
					if (a.getVendorId().equalsIgnoreCase(v.getVendorId())) {
						vendorDetail.add(v);
					}
				}
			}
		}

		return vendorDetail;

	}

}
