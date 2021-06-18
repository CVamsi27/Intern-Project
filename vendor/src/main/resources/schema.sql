DROP TABLE IF EXISTS Vendor;
CREATE TABLE Vendor(vendorId VARCHAR(10),vendorName VARCHAR(20),deliveryCharge DOUBLE,rating DOUBLE);

DROP TABLE IF EXISTS Vendor_Stock;
CREATE TABLE Vendor_Stock(productId VARCHAR(10),vendorId VARCHAR(10),stockInHand BOOLEAN,expectedDate DATE);
