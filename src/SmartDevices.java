import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner; //

public class SmartDevices {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int select;

        do {

            // Display the menu
            System.out.println("Your options for Smart Home Application are:\n"+"1.List smart devices\n"+"2.Enable smart device\n"
                    +"3.Disable smart device\n"+"4.Add smart device\n"+"5.Remove smart device\n"+"6.Exit\n"+"Select your option number from the menu: ");
            // reading the input from user

            select = user.nextInt();
            // call the method for running the selected option
            runSelectedOption(select);
        }while(select>=1 && select<=6);
    }
    public static void runSelectedOption (Integer select) {
        while (select >= 1 && select <= 6) {
            switch (select) {
                case 1:
                    listSmartDevices();
                    break;
                case 2:
                    enableSmartDevice();
                    break;
                case 3:
                    disableSmaertDevice();
                    break;
                case 4:
                    addSmartDevice();
                    break;
                case 5:
                    removeSmartDevice();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid input try Again\n");
                    break;
            }break;
        }
    }
    // list smart devices
    static void listSmartDevices () {
        System.out.println("List of all Smart devices!\n");
    }

    // enable smart devices
    static void enableSmartDevice () {
        System.out.println("Enable Smart Device\n");
    }

    // disable smart devices
    static void disableSmaertDevice () {
        System.out.println("Disable Smart device\n");
    }

    // add smart devices
    static void addSmartDevice () {
        System.out.println("Smart Device Added\n");
    }

    // remove smart devices
    static void removeSmartDevice () {
        System.out.println("Smart Device Removed\n");
    }

}