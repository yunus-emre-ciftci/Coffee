import java.util.ArrayList;
import java.util.List;

public class Americano extends Coffee {
    List list = new ArrayList<>();

    public Americano(List list) {
        this.list = list;
    }

    @Override
    public int sugarValue(int value) {
        return 0;
    }

    @Override
    public int milkValue(int value) {
        return 0;
    }

    @Override
    public int waterValue(int value) {
        return 0;
    }

    @Override
    public int coffeeValue(int value) {
        return 0;
    }
}
