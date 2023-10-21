package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, ClassNotFoundException {

          //User user = new User(222);

        Class<?> user = Class.forName("Reflection.User");

         Field[] fields= user.getClass().getDeclaredFields();

         for(Field f : fields){
             if(f.getName().equals("accountNumber")){
                 f.setAccessible(true);
                 f.set(user,333);
             }
         }

       // System.out.println(user.accountNumber);


        for (Method method : user.getClass().getDeclaredMethods()) {
             System.out.println(method.getName());

             if(method.getName().equals("printCountry")){
                 method.setAccessible(true);
                 method.invoke(null);
             }

            if(method.getName().equals("printCity")){
                method.invoke(null);
            }

        }


    }
}