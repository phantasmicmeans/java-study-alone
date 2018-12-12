package com.pattern.Command;

import org.junit.Test;

public class CommandClient {

    static TextFile textFile;

    @Test
    public void test() {

        textFile = new TextFile("command.txt");
        String writeData = "hello world";
        CommandOriented commandOriented = new CommandOriented();
        commandOriented.executeOperation(new SaveFileOperation(textFile,writeData)); //write
        commandOriented.executeOperation(new OpenFileOperation(textFile)); //read

        writeData = "hello world this is second";
        commandOriented.executeOperation(new SaveFileOperation(textFile, writeData)); //write
        commandOriented.executeOperation(new OpenFileOperation(textFile)); //read
    }
}
