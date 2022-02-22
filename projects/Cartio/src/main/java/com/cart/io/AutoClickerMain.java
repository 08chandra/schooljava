package com.cart.io;
//Copyright 2020
//Owner:Cart.io
//Will engage in legal action if copied.

import java.awt.*;
import java.util.Scanner;

import java.awt.event.InputEvent;
import java.lang.Thread;
import java.io.*;
public class AutoClickerMain {

	//private static boolean keyVerify(String key){
	//	try {
	//		BufferedReader read = new BufferedReader(
	//				new FileReader("");
	//		String option = "";
	//		while((option = read.readLine())!= null){
	//			if(key.equals(option)){
	//				return true;
	//			}
	//		}
	//		read.close();
	//	} catch (Exception ex) {
			
	//	return false;
	//	}
	//	return false;
//	}
	
	public static void main(String[] args) {

		Console console = System.console();
		if(console == null && !GraphicsEnvironment.isHeadless()) {
			//String filename = YOURMAINCALSS.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
			String filename="cart-io-1.0.jar";
			try {
				File batch = new File("Launcher.bat");
				if(!batch.exists()){
					batch.createNewFile();
					PrintWriter writer = new PrintWriter(batch);
					writer.println("@echo on");
					writer.println("set CLASSPATH=.;./jre;%CLASSPATH%");
					writer.println("set Path=./jre/bin;%Path%");
					writer.println("echo \"Path\" : %Path%");
					writer.println("echo \"CLASSPATH\" : %CLASSPATH%");
					writer.println("java -jar "+filename);
					writer.println("exit");
					writer.flush();
				}
				Runtime.getRuntime().exec("cmd /c start \"\" "+batch.getPath());
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			//your program code...
			AutoClickerMain app=new AutoClickerMain();
			app.process();
		}
	}

	private void process(){
		int choice = 0;
		int y = 1;
		int x = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("  /$$$$$$                    /$$$$$$  /$$$$$$ \n" +
				" /$$__  $$                  |_  $$_/ /$$__  $$\n" +
				"| $$  \\__/  /$$$$$$   /$$$$$$ | $$  | $$  \\ $$\n" +
				"| $$       |____  $$ /$$__  $$| $$  | $$  | $$\n" +
				"| $$        /$$$$$$$| $$  \\__/| $$  | $$  | $$\n" +
				"| $$    $$ /$$__  $$| $$      | $$  | $$  | $$\n" +
				"|  $$$$$$/|  $$$$$$$| $$ /$$ /$$$$$$|  $$$$$$/\n" +
				" \\______/  \\_______/|__/|__/|______/ \\______/ ");

		System.out.println("\n\n\n");

		System.out.println("  /$$$$$$              /$$                /$$$$$$  /$$ /$$           /$$                          \n" +
				" /$$__  $$            | $$               /$$__  $$| $$|__/          | $$                          \n" +
				"| $$  \\ $$ /$$   /$$ /$$$$$$    /$$$$$$ | $$  \\__/| $$ /$$  /$$$$$$$| $$   /$$  /$$$$$$   /$$$$$$ \n" +
				"| $$$$$$$$| $$  | $$|_  $$_/   /$$__  $$| $$      | $$| $$ /$$_____/| $$  /$$/ /$$__  $$ /$$__  $$\n" +
				"| $$__  $$| $$  | $$  | $$    | $$  \\ $$| $$      | $$| $$| $$      | $$$$$$/ | $$$$$$$$| $$  \\__/\n" +
				"| $$  | $$| $$  | $$  | $$ /$$| $$  | $$| $$    $$| $$| $$| $$      | $$_  $$ | $$_____/| $$      \n" +
				"| $$  | $$|  $$$$$$/  |  $$$$/|  $$$$$$/|  $$$$$$/| $$| $$|  $$$$$$$| $$ \\  $$|  $$$$$$$| $$      \n" +
				"|__/  |__/ \\______/    \\___/   \\______/  \\______/ |__/|__/ \\_______/|__/  \\__/ \\_______/|__/ ");


		//	System.out.println("License Key[?]");
		//	String key = scan.next();
		//	boolean flag = keyVerify(key);


		//while (flag && x != y)
		while ( x != y){
					System.out.println("\n\n\n"
					+ "EXIT AutoClicker[1] \n\n" + "START AutoClicker[2]");
			System.out.println("\nNumber/Choice[?]");
			choice = scan.nextInt();
			switch (choice) {
				case 1:
					System.out.println("AutoClicker Closed");
					System.exit(0);
				case 2:
					Scanner scanner = new Scanner(System.in);

					System.out.print("Enter the number of desired clicks[?] ");
					int clicks = scanner.nextInt();

					System.out.println("\n1 Second = 1000 Milliseconds");
					System.out.println(
							"\nEnter the delay between clicks in milliseconds[?]");
					int delay = scanner.nextInt();

					System.out.println("Get your mouse cursor in position");
					System.out.println("\nAutoClicker will start in 3 seconds...");
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}

					AutoClicker clicker = new AutoClicker();
					clicker.setDelay(delay);

					for (int i = 0; i < clicks; i++) {

						clicker.ClickMouse(InputEvent.BUTTON1_DOWN_MASK);
					}

					System.out.println("\nAutoClicker task completed");
					break;
				default:
					System.out.println("That's not a choice!");
					System.out.println("\nTry again!");
			}
		}
	}
}

