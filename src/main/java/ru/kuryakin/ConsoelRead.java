package ru.kuryakin;

import java.io.IOException;

public class ConsoelRead {

    public static String read(){
        byte a[] = new byte[1000];
        byte b[];
        String s="";
        int sizeRead = a.length;
        try {
            while (sizeRead == 1000) {
                sizeRead = System.in.read(a);
                if (sizeRead == -1)
                    return null;
                if (sizeRead < 1000) {
                    b = new byte[sizeRead];
                    for (int i = 0; i < sizeRead; i++) {
                        b[i] = a[i];
                    }
                    s += new String(b);
                    return s;
                }
                s += new String(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s.length());
        return s;
    }
}
