import org.example.Rotor;
import org.example.Rotorbox;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class RotorboxTest {
    @Test
    public void AvancaPosicaoQuandoRotaciona(){
        Rotorbox box = new Rotorbox(2, false);
        Rotor r0 = new Rotor(10,9);
        Rotor r1 = new Rotor(10, 0);

        box.setRotor(0, r0);
        box.setRotor(1, r1);

        box.rotate(0);

        int esperado = 1;
        int recebido = box.getRotor(1).getWindow();
        Assert.assertEquals(esperado, recebido);
    }

    @Test
    public void VoltaParaPosicaoInicialQuandoRotaciona(){
        Rotorbox box = new Rotorbox(2, false);
        Rotor r0 = new Rotor(10,9);
        Rotor r1 = new Rotor(10, 0);

        box.setRotor(0, r0);
        box.setRotor(1, r1);

        box.rotate(0);

        int esperado = 0;
        int recebido = box.getRotor(0).getWindow();
        Assert.assertEquals(esperado, recebido);
    }
}
