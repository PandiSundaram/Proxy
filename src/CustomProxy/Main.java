package CustomProxy;

import java.lang.reflect.Proxy;

public class Main {


      public static void main(String arg[]) {


      Bank bank = (Bank) Proxy.newProxyInstance(Atm.class.getClassLoader(),
              new Class[]{Bank.class},
              new AtmProxy(new Atm()));

      bank.saveBalance(100);
      System.out.println(bank.getBalance());
}

}
