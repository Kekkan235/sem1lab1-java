package edu.course.lab01;

public class reverse {
    public static void replace(String text){
        String reversed = "";
        for (int i  = text.length() - 1; i >=0; i--){
            reversed += text.charAt(i);

        }
        System.out.println(reversed);

    }
}
