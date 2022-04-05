package Controls;

import Controls.SystemServices;

public class StudentServicesMessages extends SystemServices {
    // welcome message
    @Override
    public void WelcomeMsg()
    {
        System.out.println("\nWelcome to our Student Services !!!");
    }

    // back to main menu
    @Override
    public void mainMenu()
    {
        System.out.println("Terminating Student Services");
    }

    // Student Services
    @Override
    public void ServicesInfo()
    {
        System.out.println(
                "\nStudent Services: \n" +
                        "# 1 Create\n" +
                        "# 2 Read\n" +
                        "# 3 Update\n" +
                        "# 4 Delete\n" +
                        "# 0 Terminate\n"
        );
    }
}
