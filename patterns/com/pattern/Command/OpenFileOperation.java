package com.pattern.Command;

public class OpenFileOperation implements TextFileOperation{
    //Command class
    private TextFile textFile;
    public OpenFileOperation(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public String execute(){
        return this.textFile.open();
    }
}

