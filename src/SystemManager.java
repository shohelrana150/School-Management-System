import Calculations.CalculationsOfMulDiv;
import StudentInfo.StudentInfoForm;
import Controls.InfoAddedServices;
import Controls.SystemServices;
import java.util.Scanner;
import java.util.ArrayList;
import Calculations.CalculationsAddSub;
import Controls.FilupForm;
import Controls.CalculatorServicesMessage;
import Controls.StudentServicesMessages;



public class SystemManager{
    // main method
    public static  void main(String[] args){
        //System.out.println("Hello");

        ArrayList<StudentInfoForm> database = new ArrayList<StudentInfoForm>();

        int selectOption;
        int operation;

        SystemServices sm;
        sm = new StudentServicesMessages();

        SystemServices csm;
        csm = new CalculatorServicesMessage();

        while(true)
        {
            System.out.println("\n\nWelcome to our School Management System !!\n");
            System.out.println("1. Student Services");
            System.out.println("2. Calculator Services");
            System.out.println("0. Terminate\n");

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Option: ");
            selectOption = scan.nextInt();

            if (selectOption == 0)
                break;

            else if (selectOption == 1)
            {
                sm.WelcomeMsg();
                while (true)
                {
                    sm.ServicesInfo();
                    System.out.print("Enter Operation: ");
                    operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    // create | read | update | delete
                    switch (operation)
                    {
                        case 1:
                        { // create info
                            StudentInfoForm std = FilupForm.fillUp();
                            Controls.InfoAddedServices.create(std, database);
                            break;
                        }
                        case 2:
                        { // read info
                            System.out.print("Search Id: ");
                            int search_id = scan.nextInt();
                            Controls.InfoAddedServices.filterById(search_id, database);
                            break;
                        }
                        case 3:
                        { // update info
                            System.out.print("Update through id: ");
                            StudentInfoForm update_std = FilupForm.fillUp();
                            Controls.InfoAddedServices.update(update_std, database);
                            break;
                        }
                        case 4:
                        { // delete info
                            System.out.print("Delete Id: ");
                            int delete_id = scan.nextInt();
                            InfoAddedServices.delete(delete_id, database);
                            break;
                        }
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                sm.mainMenu();
            }
            else if (selectOption == 2)
            {
                csm.ServicesInfo();
                while (true)
                {
                    double num1, num2;
                    int firstNum, secondNum;


                    System.out.print("Enter Operation: ");
                    operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    // Calculation Area
                    switch (operation)
                    {
                        case 1:
                        { // addition
                            System.out.print("Enter your 1st value: ");
                            firstNum = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            secondNum = scan.nextInt();
                            CalculationsAddSub.addition(firstNum, secondNum);
                            break;
                        }
                        case 2:
                        { // subtraction
                            System.out.print("Enter your 1st value: ");
                            firstNum = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            secondNum = scan.nextInt();
                            CalculationsAddSub.substraction(firstNum, secondNum);
                            break;
                        }
                        case 3:
                        { // multiplication
                            System.out.print("Enter your 1st value: ");
                            num1 = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            num2 = scan.nextInt();
                            CalculationsOfMulDiv.multiplication(num1, num2);
                            break;
                        }
                        case 4:
                        { // division
                            System.out.print("Enter your 1st value: ");
                            num1 = scan.nextDouble();
                            System.out.print("Enter your 2nd value: ");
                            num2 = scan.nextDouble();
                            CalculationsOfMulDiv.division(num1, num2);
                            break;
                        }
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                csm.mainMenu();
            }
            else {
                System.out.println("Invalid Options, Please Try again");
            }
        }
    }
}
