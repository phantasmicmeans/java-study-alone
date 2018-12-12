package com.pattern.Command;

public class SaveFileOperation implements TextFileOperation{
    //Command class
    private TextFile textFile;
    private String data;

    public SaveFileOperation(TextFile textFile, String data){
        this.textFile = textFile;
        this.data = data;
    }

    @Override
    public String execute(){
        return this.textFile.write(this.data);
    }
}
