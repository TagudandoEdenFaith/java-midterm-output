import java.util.ArrayList;
import java.util.Scanner;

public class EntryMidterm {
    static ArrayList<Integer> age = new ArrayList<>();
    static Scanner ae = new Scanner(System.in);
    static ArrayList<String> name = new ArrayList<>();
    static Scanner nm = new Scanner(System.in);

    static void addEntry() {
        System.out.print("Please Enter the Name: ");
        name.add(nm.next());
        System.out.print("Please Enter the Age: ");
        age.add(ae.nextInt());
        System.out.println("Entry Added Successfully!");
    }

    static void delEntry() {
        String id;
        System.out.print("Enter Name of the Entry You Want to Delete: ");
        id= nm.next();
        if(name.contains(id)){
            name.remove(id);
            System.out.println("Successfully Remove "+ id + " in the List.");
        }
        else{
            System.out.println(id + " does not Exist in Your List");
        }
    }

    static void displayEntry() {
        System.out.println("Displaying All Entries...");
        for(int i=0; i<name.size(); i++)
            System.out.println(name.get(i)+" is "+ age.get(i) +" years old.");
    }

    static void UpEntry() {
        if (name.isEmpty()){
            System.out.println("There's No Entry Yet. Please Add an Entry First.");
        }
        else {
            System.out.print("Enter Index of the Entry: ");
            int index = ae.nextInt();
            System.out.print("Enter New Name of the Entry: ");
            String upName = nm.next();
            name.set(index, upName);
            System.out.print("Enter New Age of the Entry: ");
            int upAge = ae.nextInt();
            age.set(index, upAge);
            System.out.println("The Entry was Successfully Updated!");
        }

    }

    public static void main(String[] args) {
        int sel;
        opt:
        while (true) {
            System.out.println("\nPlease Choose an Option.\n1) Add Entry.\n2) Delete Entry.\n3) View All Entries.\n4) Update An Entry.\n5) Quit.");
            sel = ae.nextInt();
            switch (sel) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    delEntry();
                    break;
                case 3:
                    displayEntry();
                    break;
                case 4:
                    UpEntry();
                    break;
                case 5:
                    Scanner dc = new Scanner(System.in);
                    System.out.println("Quit the Program? Press Y for Yes. N for No.");
                    String yn = dc.nextLine();
                    if (yn.equalsIgnoreCase("Y")){
                        System.out.println("You Quit the Program.");
                        return;
                    }
                    if (yn.equalsIgnoreCase("N")){
                        System.out.println("Cancelled.");
                        break;
                    }
                    else{
                        System.out.println("Invalid Input! The Program Ended.");
                        return;
                    }
                default:
                    System.out.println("Invalid Input!");
                    break opt;
            }
        }
    }

}