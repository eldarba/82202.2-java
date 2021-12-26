package a.homwork.dictionary;

import java.util.Scanner;

import javax.swing.JFrame;

public class DictionarySystem {

	private Dictionary dictionary = new Dictionary();
	private Scanner sc = new Scanner(System.in);
	private boolean systemOn;

	public void start() {
		systemOn = true;
		while (systemOn) {
			try {
				printMenu();
				String command = sc.nextLine();
				switch (command) {
				case "add":
				case "1":
					doAdd();
					break;
				case "get":
				case "2":
					doGet();
					break;
				case "edit":
				case "3":
					doEdit();
					break;
				case "del":
				case "4":
					doDelete();
					break;
				case "disp":
				case "5":
					dispAll();
					break;
				case "q":
				case "x":
					systemOn = false;
					break;
				default:
					System.out.println(command + " is not a supported action");
				}
			} catch (Exception e) {
				System.err.println("ERROR: " + e.getMessage());
			}
		}

		sc.close();
		System.out.println("Bye");
	}

	private void dispAll() {
		System.out.println("All Entries:");
		for (String entry : dictionary.getAllEntriesSorted()) {
			System.out.println(entry);
		}
		System.out.println("============");
	}

	private void doDelete() {
		System.out.print("enter the entry to delete: ");
		String entry = sc.nextLine();
		String x = this.dictionary.deleteEntry(entry);
		if (x != null) {
			System.out.println("deleted entry: " + entry);
		} else {
			System.out.println("entry: " + entry + " not found");
		}
	}

	private void doEdit() throws DictionaryException {
		System.out.print("enter the entry to edit: ");
		String entry = sc.nextLine();
		System.out.print("enter the new definition: ");
		String definition = sc.nextLine();
		dictionary.editEntry(entry, definition);
	}

	private void doGet() {
		System.out.print("enter the entry to get: ");
		String entry = sc.nextLine();
		String def = this.dictionary.getDefinition(entry);
		System.out.println(entry + ": " + def);
	}

	private void doAdd() throws DictionaryException {
		System.out.print("enter the new entry: ");
		String entry = sc.nextLine();
		System.out.print("enter definition: ");
		String definition = sc.nextLine();
		this.dictionary.addEntry(entry, definition);
	}

	public void printMenu() {
		System.out.println("\n== Menu =========");
		System.out.println("Add Entry .......... add / 1");
		System.out.println("Get Definition ..... get / 2");
		System.out.println("Edit Definition .... edit / 3");
		System.out.println("Delete entry .. del / 4");
		System.out.println("diplay all ......... disp / 5");
		System.out.println("exit ............... q / x");
		System.out.print("Enter Choice: ");
		
	}

}
