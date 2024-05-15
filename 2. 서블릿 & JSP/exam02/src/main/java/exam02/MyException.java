package exam02;

/**
 * try catch 구문에서는 반드시 close를 해서 자원해제를 시켜줘야하는데
 * try with resource 구문에서는 close를 명시적으로 호출하지 않아도 자동으로 닫게 만들어준다.
 * 이 문법을 사용하려면 AutoCloseable 인터페이스를 구현해야 한다.
 *
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
        Class c = Class.forName(className); // ClassNotFoundException 발생 가능
        return c;
    }
    public static void main(String[] args) {
        MyException test = new MyException();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { // Exception  클래스로 그 외 예외 상황 처리
            e.printStackTrace();
        }
    }
}