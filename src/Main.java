import org.junit.platform.commons.function.Try;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main extends TryClass{
    public static void ch(Method [] m){
        class1 cl1 =new class1();
        Class cl2 =String.class;
String[] array=new String[m.length];
        for (int i = 0; i <m.length ; i++) {
            array[i]=m[i].getName();
        }
        for (int i = 0; i < array.length ; i++) {
            //System.out.println(array[i]);
            System.out.println("Class of method: "+m[i].getDeclaringClass()+"\n"+" Method: "+array[i]+"\n"+" Result method: ");
            if(array[i]=="vivod")
               cl1.vivod();
            if(array[i]=="vivod1")
                cl1.vivod1();
            if(array[i]=="vivod2")
                cl1.vivod2();
            if(array[i]=="vivod3")
                cl1.vivod3();
            if(array[i]=="start")
                cl1.started(cl2);
        }

    }
//вроде как сделал но не уверен в праивльности хотелось бы увидеть разорбанный вариант
    public static void main(String[] args) {
        int flag=0;
        String array[]=new String[flag];
            Method[] m= class1.class.getDeclaredMethods();
        for(Method mm:m) {
            if (mm.getAnnotation(CheckTest.class) != null) ;
            {
                flag++;
                //System.out.println(mm);
                System.out.println(mm.getName());
                //System.out.println(mm.getDeclaringClass());

            }

        }
        System.out.println("All count methods: "+flag);

        System.out.println("--------------------------------------");

        Class s=String.class;
        System.out.println("Полное имя класса "+s.getName());
        System.out.println("Простое имя класса "+s.getSimpleName());
        System.out.println("Result method start: ");
        start(s);
        System.out.println("--------------------------------!");
        ch(m);
        started(s);



   /*     for (int i = 0; i < flag; i++) {
            System.out.println(m[i].getName());
            //array[i]= String.valueOf(m[i]);
        }
*/
     /*   try {
            Method v = class1.class.getDeclaredMethod( "vivod");
            System.out.println(v);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

*/
    }

    }

