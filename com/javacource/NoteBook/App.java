package com.javacource.NoteBook;

public class App {
      public static void main(String[] args) {
        new Thread(new ScannerRun()).start();
        new Thread(new NotiFicator()).start();
    }
}


