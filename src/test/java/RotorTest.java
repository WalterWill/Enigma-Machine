import org.example.RotationException;
import org.example.Rotor;
import org.example.RotorStatus;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RotorTest {
    @Test
    public void AvancaPosicaoQuandoRotaciona(){
        Rotor a = new Rotor(10, 9);
        String esperado = RotorStatus.TURN.toString();
        String recebido = null;
        try {
            a.rotate();
        } catch (RotationException e) {
            recebido = e.getMessage();
        }

        Assert.assertEquals(esperado, recebido);

    }

    @Test
    public void RetornaNumeroQuandoSolicitado() {
        Rotor a = new Rotor(10, 0);
        int input[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        a.setPosition(input);

        int index = 5;

        int valorEsperado = 5;
        int valorRecebido = a.pass(index);

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void RetornaNumeroQuandoRotacionado(){
        Rotor a = new Rotor(10, 0);
        int input[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        a.setPosition(input);

        try {
            RotorStatus rotate = a.rotate();
        }catch (RotationException e){

        }

        int index = 5;

        int valorEsperado = 6;
        int valorRecebido = a.pass(index);

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void RetornaNumeroQuandoAlteradoContato() {
        Rotor a = new Rotor(10, 0);
        int input[] = new int[]{9,8,7,6,5,4,3,2,1,0};
        a.setPosition(input);

        int index = 2;

        int valorEsperado = input[index];
        int valorRecebido = a.pass(index);

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void VoltaAoInicioQuandoRotacionadoUmaVolta(){
        Rotor a = new Rotor(10, 9);
        int input[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        a.setPosition(input);

        try {
            RotorStatus rotate = a.rotate();
        }catch (RotationException e){

        }

        int index = 5;

        int valorEsperado = 5;
        int valorRecebido = a.pass(index);

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void WindowZeraQuandoRotacionadoUmaVolta(){
        Rotor a = new Rotor(10, 9);
        int input[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        a.setPosition(input);

        try {
            RotorStatus rotate = a.rotate();
        }catch (RotationException e){

        }

        int valorEsperado = 0;
        int valorRecebido = a.getWindow();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void RetornaNumeroQuandoPassaReverso() {
        Rotor a = new Rotor(10, 0);
        int input[] = new int[]{0, 1, 2, 3, 4, 9, 6, 5, 8, 7};
        a.setPosition(input);

        int output = 5;

        int valorEsperado = 7;
        int valorRecebido = a.pass_reverse(output);

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void RetornaNumeroQuandoPassaReversoComWindow() {
        Rotor a = new Rotor(10, 4);
        int input[] = new int[]{0, 1, 2, 3, 4, 9, 6, 5, 8, 7};
        a.setPosition(input);

        int output = 5;

        int valorEsperado = 7;
        int valorRecebido = a.pass_reverse(output);

        Assert.assertEquals(valorEsperado, valorRecebido);
    }
}
