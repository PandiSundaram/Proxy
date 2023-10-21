package CustomProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AtmProxy implements InvocationHandler {

    private Object obj;

    public AtmProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("saveBalance")){
           System.out.println("saving loggs for save balance"+ args[0]);
        }

        Object o = method.invoke(this.obj,args);

        if(method.getName().equals("getBalance")){
            System.out.println("saving response logs"+ o);
        }

        return o;
    }
}
