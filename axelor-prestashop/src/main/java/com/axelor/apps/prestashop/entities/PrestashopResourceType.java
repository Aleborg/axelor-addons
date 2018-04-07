package com.axelor.apps.prestashop.entities;

/**
 * Type of resources handled by Prestashop's API.
 * Only those actually used by Axelor sync are declared,
 * feel free to enhance.
 */
public enum PrestashopResourceType {
	ADDRESSES("addresses"),
	CARTS("carts"),
	CATEGORIES("categories"),
	COUNTRIES("countries"),
	CURRENCIES("currencies"),
	CUSTOMERS("customers"),
	IMAGES("images"),
	LANGUAGES("languages"),
	ORDER_DETAILS("order_details"),
	ORDER_HISTORIES("order_histories"),
	ORDERS("orders"),
	PRODUCTS("products");

	final String label;

	private PrestashopResourceType(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}