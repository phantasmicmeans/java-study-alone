package com.pattern.Command;

import org.junit.Test;
import org.junit.internal.Throwables;

import java.io.*;
import java.net.URL;
import java.util.Optional;

public class TextFile {
// This is Receiver class
    private String name;
    private File file;

    public TextFile(String name){
        this.name = name;
    }

    public String open(){ //print file with name

        try {
            this.file = getFile(this.name);
            BufferedReader bReader = new BufferedReader(new FileReader(this.file));

            String str;
            while ((str = bReader.readLine()) != null) {
                System.out.println(str);
            }
        }catch(IOException e){
            return Throwables.getStacktrace(e);
        }
        System.out.println("file opened");
        return "file opened";
    }

    public String write(String data){ //write to file data.

        try {
            this.file = getFile(this.name);
            FileWriter fileWriter = new FileWriter(this.file);
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("file writed to " + this.file.getName());
            return "writed to " + this.file.getName();
        }catch(IOException e){
            return Throwables.getStacktrace(e);
        }
    }

    private File getFile(String name) throws IOException{

        Optional<URL> url = Optional.ofNullable(getClass().getResource(name));
        return new File(url.orElseThrow(FileNotFoundException::new).getPath()); // throw it file not found
    }


    @Test
    public void test() throws IOException{

        Optional<URL> url = Optional.ofNullable(getClass().getResource("command.txt"));
        File file = new File(url.orElseThrow(()->new FileNotFoundException("Cannot found that file"))
                                .getPath());

        BufferedReader bReader = new BufferedReader(new FileReader(file));

        String str;
        while((str = bReader.readLine()) != null){ System.out.println(str); }
    }

}
