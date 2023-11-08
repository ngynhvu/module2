package thi_lai.view;

import thi_lai.controller.BankController;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BankController bankController = new BankController();
        bankController.display();
    }
}
