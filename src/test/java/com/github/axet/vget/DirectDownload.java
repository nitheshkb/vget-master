package com.github.axet.vget;

import java.io.File;
import java.net.URL;

public class DirectDownload {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
           // String url = args[0];
            // ex: "/Users/axet/Downloads"
           // String path = args[1];
        	String url ="https://www.youtube.com/watch?v=dKrVegVI0Us";
        	String path ="D:\\eclipse-jee-mars-1-win32\\vget-master";
            VGet v = new VGet(new URL(url), new File(path));

            v.download();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
