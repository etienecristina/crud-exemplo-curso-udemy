package primeiro.cliente.aulanivelamentointerface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;
    Produto objProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();
        objProduto = new Produto();

        objCliente.setNome("etiene");
        objCliente.setEmail("etiene@teste.com");

        objProduto.setNome("HD SSD 1 TB");
        objProduto.setFornecedor("DELL");

        objCliente.incluir();
        objProduto.alterar();

        objProduto.deletar();
        objProduto.listar();

    }
}