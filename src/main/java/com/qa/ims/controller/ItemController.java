package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDao;
	private Utils Utils;

	public ItemController(ItemDAO itemDao, Utils Utils) {
		super();
		this.itemDao = itemDao;
		this.Utils = Utils;
	}

	@Override
	public List<Item> readAll() {
		List<Item> items = itemDao.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter the name of the item");
		String name = Utils.getString();
		LOGGER.info("Please enter the price of the item");
		Double price = Utils.getDouble();
		Item item = itemDao.create(new Item(name, price));
		LOGGER.info("Item created");
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = Utils.getLong();
		LOGGER.info("Please enter item's title");
		String name = Utils.getString();
		LOGGER.info("Please enter a value");
		Double price = Utils.getDouble();
		Item item = itemDao.update(new Item(id, name, price));
		LOGGER.info("Item updated.");
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter id of item you would like to delete");
        Long id = Utils.getLong();
        return itemDao.delete(id);
	}

	public ItemDAO getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDAO itemDao) {
		this.itemDao = itemDao;
	}

	public Utils getUtils() {
		return Utils;
	}

	public void setUtils(Utils utils) {
		Utils = utils;
	}

}
