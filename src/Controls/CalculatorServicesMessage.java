package Controls;

import Controls.SystemServices;

public class CalculatorServicesMessage extends SystemServices {
    @Override
    public void WelcomeMsg() {

        System.out.println("Welcome to our Calculator System.");
    }

    @Override
    public void mainMenu() {

        System.out.println("Terminating Calculator System.");
    }

    @Override
    public void ServicesInfo()
    {
        System.out.println(
                "\nCalculator Services: \n" +
                        "# 1 Add\n" +
                        "# 2 Sub\n" +
                        "# 3 Multiply\n" +
                        "# 4 Division\n" +
                        "# 0 Terminate\n"
        );
    }
}
