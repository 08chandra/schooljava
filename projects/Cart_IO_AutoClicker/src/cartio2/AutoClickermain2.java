
//Copyright 2020

//Owner:Cart.io
//Will engage in legal action if copied.

package cartio2;


import java.util.Scanner;

import java.awt.event.InputEvent;
import java.lang.Thread;

public class AutoClickermain2 {

	public static void main(String[] args) {
		int choice = 0;
		int y = 1;
		int x = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("░█████╗░░█████╗░██████╗░████████╗  ██╗░█████╗░");
		System.out.println("██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝  ██║██╔══██╗");
		System.out.println("██║░░╚═╝███████║██████╔╝░░░██║░░░  ██║██║░░██║");
		System.out.println("██║░░██╗██╔══██║██╔══██╗░░░██║░░░  ██║██║░░██║");
		System.out.println("╚█████╔╝██║░░██║██║░░██║░░░██║░░░  ██║╚█████╔╝");
		System.out.println("░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░  ╚═╝░╚════╝░");

		System.out.println("░█████╗░██╗░░░██╗████████╗░█████╗░  ░█████╗░██╗░░░░░██╗░█████╗░██╗░░██╗███████╗██████╗░");
		System.out.println("██╔══██╗██║░░░██║╚══██╔══╝██╔══██╗  ██╔══██╗██║░░░░░██║██╔══██╗██║░██╔╝██╔════╝██╔══██╗");
		System.out.println("███████║██║░░░██║░░░██║░░░██║░░██║  ██║░░╚═╝██║░░░░░██║██║░░╚═╝█████═╝░█████╗░░██████╔╝");
		System.out.println("██╔══██║██║░░░██║░░░██║░░░██║░░██║  ██║░░██╗██║░░░░░██║██║░░██╗██╔═██╗░██╔══╝░░██╔══██╗");
		System.out.println("██║░░██║╚██████╔╝░░░██║░░░╚█████╔╝  ╚█████╔╝███████╗██║╚█████╔╝██║░╚██╗███████╗██║░░██║");
		System.out.println("╚═╝░░╚═╝░╚═════╝░░░░╚═╝░░░░╚════╝░  ░╚════╝░╚══════╝╚═╝░╚════╝░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝");
		
		while (x != y) {


			System.out.println("\n𝙎𝙚𝙡𝙚𝙘𝙩 𝙖 𝙘𝙝𝙤𝙞𝙘𝙚 𝙗𝙮 𝙩𝙮𝙥𝙞𝙣𝙜 𝙖 𝙣𝙪𝙢𝙗𝙚𝙧. \n\n"
					+ "𝙀𝙓𝙄𝙏 𝘼𝙪𝙩𝙤𝘾𝙡𝙞𝙘𝙠𝙚𝙧[1] \n\n" + "𝙎𝙏𝘼𝙍𝙏 𝘼𝙪𝙩𝙤𝘾𝙡𝙞𝙘𝙠𝙚𝙧[2]");
			System.out.println("\n𝙉𝙪𝙢𝙗𝙚𝙧/𝘾𝙝𝙤𝙞𝙘𝙚[?]");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("𝘼𝙪𝙩𝙤𝘾𝙡𝙞𝙘𝙠𝙚𝙧 𝘾𝙡𝙤𝙨𝙚𝙙");
				System.exit(0);
			case 2:
				Scanner scanner = new Scanner(System.in);

				System.out.print("𝙀𝙣𝙩𝙚𝙧 𝙩𝙝𝙚 𝙣𝙪𝙢𝙗𝙚𝙧 𝙤𝙛 𝙙𝙚𝙨𝙞𝙧𝙚𝙙 𝙘𝙡𝙞𝙘𝙠𝙨[?]");
				int clicks = scanner.nextInt();

				System.out.println("\n1 𝙎𝙚𝙘𝙤𝙣𝙙 = 1000 𝙈𝙞𝙡𝙡𝙞𝙨𝙚𝙘𝙤𝙣𝙙𝙨");
				System.out.println(
						"\n𝙀𝙣𝙩𝙚𝙧 𝙩𝙝𝙚 𝙙𝙚𝙡𝙖𝙮 𝙗𝙚𝙩𝙬𝙚𝙚𝙣 𝙘𝙡𝙞𝙘𝙠𝙨 𝙞𝙣 𝙢𝙞𝙡𝙡𝙞𝙨𝙚𝙘𝙤𝙣𝙙𝙨[?]");
				int delay = scanner.nextInt();

				System.out.println("𝙂𝙚𝙩 𝙮𝙤𝙪𝙧 𝙢𝙤𝙪𝙨𝙚 𝙘𝙪𝙧𝙨𝙤𝙧 𝙞𝙣 𝙥𝙤𝙨𝙞𝙩𝙞𝙤𝙣");
				System.out.println("\n𝘼𝙪𝙩𝙤𝘾𝙡𝙞𝙘𝙠𝙚𝙧 𝙬𝙞𝙡𝙡 𝙨𝙩𝙖𝙧𝙩 𝙞𝙣 3 𝙨𝙚𝙘𝙤𝙣𝙙𝙨...");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				AutoClicker2 clicker = new AutoClicker2();
				clicker.setDelay(delay);

				for (int i = 0; i < clicks; i++) {

					clicker.ClickMouse(InputEvent.BUTTON1_DOWN_MASK);
				}

				System.out.println("\n𝘼𝙪𝙩𝙤𝘾𝙡𝙞𝙘𝙠𝙚𝙧 𝙩𝙖𝙨𝙠 𝙘𝙤𝙢𝙥𝙡𝙚𝙩𝙚𝙙");
				break;
			default:
				System.out.println("𝙏𝙝𝙖𝙩’𝙨 𝙣𝙤𝙩 𝙖 𝙘𝙝𝙤𝙞𝙘𝙚!!");
				System.out.println("\n𝙏𝙧𝙮 𝙖𝙜𝙖𝙞𝙣!");
			}
		}
	
	}
}
