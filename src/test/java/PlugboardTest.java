import org.example.Plugboard;
import org.junit.Test;

public class PlugboardTest {
    @Test
    public void SalvaConfigQuandoSetado(){
        int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Plugboard board = new Plugboard(10);
        board.setPlugs(a);


    }
}
