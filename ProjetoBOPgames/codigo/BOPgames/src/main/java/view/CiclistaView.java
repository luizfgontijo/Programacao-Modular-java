package view;

import controller.CiclistaController;
import javax.swing.*;
import java.awt.*;

public class CiclistaView extends JFrame {
    private CiclistaController controller;

    private JComboBox<Integer> comboEtapa;
    private JTextField txtNomeCiclista1;
    private JTextField txtNumeroCiclista1;
    private JTextField txtCidadeCiclista1;
    private JTextField txtDuracaoCiclista1;
    private JTextField txtNomeCiclista2;
    private JTextField txtNumeroCiclista2;
    private JTextField txtCidadeCiclista2;
    private JTextField txtDuracaoCiclista2;
    private JTextArea resultadoArea;

    public CiclistaView() {
        setTitle("Cadastro de Ciclistas e Etapas");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(10, 2));

        inputPanel.add(new JLabel("Selecione Etapa:"));
        Integer[] etapas = new Integer[21];
        for (int i = 0; i < 21; i++) {
            etapas[i] = i + 1;
        }
        comboEtapa = new JComboBox<>(etapas);
        inputPanel.add(comboEtapa);

        inputPanel.add(new JLabel("Nome do Primeiro Ciclista:"));
        txtNomeCiclista1 = new JTextField();
        inputPanel.add(txtNomeCiclista1);

        inputPanel.add(new JLabel("Número do Primeiro Ciclista:"));
        txtNumeroCiclista1 = new JTextField();
        inputPanel.add(txtNumeroCiclista1);

        inputPanel.add(new JLabel("Cidade de Nascimento do Primeiro Ciclista:"));
        txtCidadeCiclista1 = new JTextField();
        inputPanel.add(txtCidadeCiclista1);

        inputPanel.add(new JLabel("Duração da Etapa do Primeiro Ciclista (segundos):"));
        txtDuracaoCiclista1 = new JTextField();
        inputPanel.add(txtDuracaoCiclista1);

        // Campos do segundo ciclista
        inputPanel.add(new JLabel("Nome do Segundo Ciclista:"));
        txtNomeCiclista2 = new JTextField();
        inputPanel.add(txtNomeCiclista2);

        inputPanel.add(new JLabel("Número do Segundo Ciclista:"));
        txtNumeroCiclista2 = new JTextField();
        inputPanel.add(txtNumeroCiclista2);

        inputPanel.add(new JLabel("Cidade de Nascimento do Segundo Ciclista:"));
        txtCidadeCiclista2 = new JTextField();
        inputPanel.add(txtCidadeCiclista2);

        inputPanel.add(new JLabel("Duração da Etapa do Segundo Ciclista (segundos):"));
        txtDuracaoCiclista2 = new JTextField();
        inputPanel.add(txtDuracaoCiclista2);

        JButton adicionarEtapaBtn = new JButton("Adicionar Etapa");
        inputPanel.add(adicionarEtapaBtn);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);

        add(inputPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        adicionarEtapaBtn.addActionListener(e -> {
            if (controller != null) {
                controller.adicionarEtapaParaCiclistas();
            } else {
                mostrarResultado("Erro: Controller não foi inicializado corretamente.");
            }
        });
    }

    public void setController(CiclistaController controller) {
        this.controller = controller;
    }

    public int getNumeroEtapa() {
        return (int) comboEtapa.getSelectedItem();
    }

    public String getNomeCiclista1() {
        return txtNomeCiclista1.getText();
    }

    public int getNumeroCiclista1() {
        return Integer.parseInt(txtNumeroCiclista1.getText());
    }

    public String getCidadeCiclista1() {
        return txtCidadeCiclista1.getText();
    }

    public int getDuracaoCiclista1() {
        return Integer.parseInt(txtDuracaoCiclista1.getText());
    }

    public String getNomeCiclista2() {
        return txtNomeCiclista2.getText();
    }

    public int getNumeroCiclista2() {
        return Integer.parseInt(txtNumeroCiclista2.getText());
    }

    public String getCidadeCiclista2() {
        return txtCidadeCiclista2.getText();
    }

    public int getDuracaoCiclista2() {
        return Integer.parseInt(txtDuracaoCiclista2.getText());
    }

    public void mostrarResultado(String mensagem) {
        resultadoArea.append(mensagem + "\n");
    }

    public void iniciar() {
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
        });
    }

    public void limparCampos() {
        txtNomeCiclista1.setText("");
        txtNumeroCiclista1.setText("");
        txtCidadeCiclista1.setText("");
        txtDuracaoCiclista1.setText("");
        txtNomeCiclista2.setText("");
        txtNumeroCiclista2.setText("");
        txtCidadeCiclista2.setText("");
        txtDuracaoCiclista2.setText("");
    }
}