package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Enum.OrderStatus;
import entites.Client;
import entites.OrderItem;
import entites.Product;
import entites.Order;

public class Progam {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);	
		
		System.out.println();
		System.out.println("Enter order date: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(),status,client);
		
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n ; i++) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			String nameProd = sc.next();
			System.out.print("Product price: ");
			double priceProd = sc.nextDouble();
			
			Product product = new Product(nameProd, priceProd);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantity,priceProd, product);
			
			order.addItem(orderitem);
		}
		
		System.out.println();
		System.out.println("Order sumaryo");
		System.out.println(order);
			
		}
	}
