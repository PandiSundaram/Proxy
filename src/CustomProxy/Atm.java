package CustomProxy;

public class Atm implements Bank{
    @Override
    public void saveBalance(Integer amount) {

    }

    @Override
    public Integer getBalance() {
        return 500;
    }
}
