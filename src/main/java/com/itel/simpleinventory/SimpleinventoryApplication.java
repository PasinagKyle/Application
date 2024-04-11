package com.itel.simpleinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleinventoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SimpleInventoryApplication.class, args);
		InventoryMenuService menuService = context.getBean(InventoryMenuService.class);
		menuService.displayMenu();
	}

}
