package June7th;
import java.util.*;

public class PizzaOrderSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}
	
	public static void start() {
		
		Scanner input = new Scanner(System.in);

		while(true) {
			
			boolean ordering = true;
			System.out.println("Please input your name to make an order.");
			String name = input.nextLine();
			ArrayList<Pizza> orderList = new ArrayList<Pizza>();
			
			while(ordering) {
				
				System.out.println("Please input the type you want(Regular or Sicilian).");
				String type = input.nextLine();
				System.out.println("Please input the size you want(From 1 to 4).");
				int size = Integer.parseInt(input.nextLine());
				
				Pizza pizza = null;
				if(type.equals("Regular")) {
					
					pizza = new RegularPizaa(type, size);
					System.out.println("Now you can add up to 4 toppings(xx/xx/xx/xx).");
					pizza.addToppings(input.nextLine());
					orderList.add(pizza);
					
				} else if(type.equals("Sicilian")) {
					
					pizza = new SicilianPizza(type, size);
					System.out.println("Now you can add up to 2 toppings(xx/xx).");
					pizza.addToppings(input.nextLine());
					orderList.add(pizza);
					
				} else {
					
					System.out.println("There is no such kind of pizza.");
					continue;
					
				}
				
				System.out.println("Do you wanna order more?");
				String answer = input.nextLine();
				
				if(answer.toLowerCase().equals("no")) {
					System.out.println("Name: " + name);
					printOrder(orderList);
					ordering = false;
					
				}
				
			}
		}

	}

	private static void printOrder(ArrayList<Pizza> orderList) {
		// TODO Auto-generated method stub
		int totalCost = 0;
		for(Pizza pizza : orderList) {
			totalCost += pizza.cost;
			System.out.println("Pizza type: " + pizza.type);
			System.out.println("Pizza size: " + pizza.size);
			System.out.print("Toppings: ");
			for(String top : pizza.toppings) {
				System.out.print(top + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("Totalcost: " + totalCost);
		
	}

}
