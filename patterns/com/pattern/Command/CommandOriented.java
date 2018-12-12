package com.pattern.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandOriented {
    // classic implementation - Command, Receiver, Invoker, Client
    // This class is Invoker..
    // sources based from https://www.baeldung.com/java-command-pattern
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation)
    {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }

}
