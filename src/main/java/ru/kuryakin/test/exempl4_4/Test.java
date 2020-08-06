package ru.kuryakin.test.exempl4_4;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {


        try(FileReader reader = new FileReader("res/t.rows"))
        {
            // читаем посивольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }

        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
