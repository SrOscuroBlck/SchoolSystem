package schoolsystem;

import DataControl.DataControl;
import schoolsystem.userInterface.Pages.PrincipalPage;

public class SchoolSystem {

    public static void main(String[] args) {
        DataControl data = new DataControl();
        data.loadData();
        PrincipalPage page = new PrincipalPage();
        page.setVisible(true);
    }
}
