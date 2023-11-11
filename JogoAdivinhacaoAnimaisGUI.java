package com.mycompany.jogoadivinhacaoanimaisgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoAdivinhacaoAnimaisGUI {
    private JFrame frame;
    private JTextArea textArea;
    private JButton startButton;
    private JPanel panel;

    public JogoAdivinhacaoAnimaisGUI() {
        frame = new JFrame("Jogo de Adivinhação de Animais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Repertório de animais
        textArea.setText("REPOSITÓRIO DE ANIMAIS:\nESCOLHA UM ANTES DE INICIAR O JOGO\n\n" +
                "Mamíferos: Leão | Elefante | Tigre | Macaco | Urso-pardo\n\n" +
                "Aves: Águia | Coruja | Flamingo | Beija-flor\n\n" +
                "Animais Marinhos: Baleia | Polvo | Golfinho | Tubarão | Peixe-palhaço\n\n");

        startButton = new JButton("Iniciar Jogo");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarJogo();
            }
        });
        panel.add(startButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void iniciarJogo() {
        // Lógica do jogo deve ser implementada aqui.
        String mensagem = "Bem-vindo ao Jogo de Adivinhação de Animais!\n" +
                "Pense em um animal do nosso repertório e responda às perguntas com 'S' para Sim e 'N' para Não.\n"
                + "Mamíferos: Leão | Elefante | Tigre | Macaco | Urso-pardo\n\n"
                + "Aves: Águia | Coruja | Flamingo | Beija-flor\n\n"
                + "Animais Marinhos: Baleia | Polvo | Golfinho | Tubarão | Peixe-palhaço\n\n";
        textArea.setText(mensagem);

        int resultado = JOptionPane.showConfirmDialog(frame, "Este animal é um mamífero terrestre e amamenta seus filhotes?", "Pergunta", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            resultado = JOptionPane.showConfirmDialog(frame, "O animal consegue andar sobre duas patas?", "Pergunta", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                resultado = JOptionPane.showConfirmDialog(frame, "É um dos parentes mais próximos dos humanos?", "Pergunta", JOptionPane.YES_NO_OPTION);
                if (resultado == JOptionPane.YES_OPTION) {
                    textArea.append("Você está pensando em um Macaco.");
                } else {
                    textArea.append("Você está pensando em um Urso-Pardo.");
                }
            } else {
                resultado = JOptionPane.showConfirmDialog(frame, "Este animal é conhecido por sua juba?", "Pergunta", JOptionPane.YES_NO_OPTION);
                if (resultado == JOptionPane.YES_OPTION) {
                    textArea.append("Você está pensando em um Leão.");
                } else {
                    resultado = JOptionPane.showConfirmDialog(frame, "Ele é o maior animal terrestre?", "Pergunta", JOptionPane.YES_NO_OPTION);
                    if (resultado == JOptionPane.YES_OPTION) {
                        textArea.append("Você está pensando em um Elefante.");
                    } else {
                        resultado = JOptionPane.showConfirmDialog(frame, "Possui listras em seu corpo?", "Pergunta", JOptionPane.YES_NO_OPTION);
                        if (resultado == JOptionPane.YES_OPTION) {
                            textArea.append("Você está pensando em um Tigre.");
                        } else {
                            textArea.append("Não consegui adivinhar em qual mamífero você está pensando.");
                        }
                    }
                }
            }
        } else {
            resultado = JOptionPane.showConfirmDialog(frame, "Este animal voa?", "Pergunta", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                resultado = JOptionPane.showConfirmDialog(frame, "Esse animal tem instinto de caçar?", "Pergunta", JOptionPane.YES_NO_OPTION);
                if (resultado == JOptionPane.YES_OPTION) {
                    resultado = JOptionPane.showConfirmDialog(frame, "Este animal é conhecido por seu bico amarelo?", "Pergunta", JOptionPane.YES_NO_OPTION);
                    if (resultado == JOptionPane.YES_OPTION) {
                        textArea.append("Você está pensando em uma Águia.");
                    } else {
                        resultado = JOptionPane.showConfirmDialog(frame, "É conhecido pela grande mobilidade no pescoço?", "Pergunta", JOptionPane.YES_NO_OPTION);
                        if (resultado == JOptionPane.YES_OPTION) {
                            textArea.append("Você está pensando em uma Coruja.");
                        } else {
                            textArea.append("Não consegui adivinhar em qual ave você está pensando.");
                        }
                    }
                } else {
                    resultado = JOptionPane.showConfirmDialog(frame, "Esse animal tem o hábito de entrar na água?", "Pergunta", JOptionPane.YES_NO_OPTION);
                    if (resultado == JOptionPane.YES_OPTION) {
                        resultado = JOptionPane.showConfirmDialog(frame, "É famoso por sua coloração rosa?", "Pergunta", JOptionPane.YES_NO_OPTION);
                        if (resultado == JOptionPane.YES_OPTION) {
                            textArea.append("Você está pensando em um Flamingo.");
                        } else {
                            resultado = JOptionPane.showConfirmDialog(frame, "É o menor pássaro do mundo?", "Pergunta", JOptionPane.YES_NO_OPTION);
                            if (resultado == JOptionPane.YES_OPTION) {
                                textArea.append("Você está pensando em um Beija-Flor.");
                            } else {
                                textArea.append("Não consegui adivinhar em qual ave você está pensando.");
                            }
                        }
                    } else {
                        textArea.append("Não é um animal do repertório.");
                    }
                }
            } else {
                resultado = JOptionPane.showConfirmDialog(frame, "Este animal é encontrado em ambientes marinhos?", "Pergunta", JOptionPane.YES_NO_OPTION);
                if (resultado == JOptionPane.YES_OPTION) {
                    resultado = JOptionPane.showConfirmDialog(frame, "Este animal tem instinto predador?", "Pergunta", JOptionPane.YES_NO_OPTION);
                    if (resultado == JOptionPane.YES_OPTION) {
                        resultado = JOptionPane.showConfirmDialog(frame, "É temido pelos nadadores devido a seus dentes afiados?", "Pergunta", JOptionPane.YES_NO_OPTION);
                        if (resultado == JOptionPane.YES_OPTION) {
                            textArea.append("Você está pensando em um Tubarão.");
                        } else {
                            resultado = JOptionPane.showConfirmDialog(frame, "Possui tentáculos e solta tinta?", "Pergunta", JOptionPane.YES_NO_OPTION);
                            if (resultado == JOptionPane.YES_OPTION) {
                                textArea.append("Você está pensando em um Polvo.");
                            } else {
                                resultado = JOptionPane.showConfirmDialog(frame, "É conhecido por suas acrobacias na água?", "Pergunta", JOptionPane.YES_NO_OPTION);
                                if (resultado == JOptionPane.YES_OPTION) {
                                    textArea.append("Você está pensando em um Golfinho.");
                                } else {
                                    resultado = JOptionPane.showConfirmDialog(frame, "É conhecido por sua coloração peculiar e já foi personagem principal de um filme?", "Pergunta", JOptionPane.YES_NO_OPTION);
                                    if (resultado == JOptionPane.YES_OPTION) {
                                        textArea.append("Você está pensando em um Peixe-palhaço.");
                                    } else {
                                        textArea.append("Não consegui adivinhar em qual animal marinho você está pensando.");
                                    }
                                }
                            }
                        }
                    } else {
                        resultado = JOptionPane.showConfirmDialog(frame, "É conhecido por suas acrobacias na água?", "Pergunta", JOptionPane.YES_NO_OPTION);
                        if (resultado == JOptionPane.YES_OPTION) {
                            textArea.append("Você está pensando em um Golfinho.");
                        } else {
                            resultado = JOptionPane.showConfirmDialog(frame, "É conhecido por sua coloração peculiar?", "Pergunta", JOptionPane.YES_NO_OPTION);
                            if (resultado == JOptionPane.YES_OPTION) {
                                textArea.append("Você está pensando em um Peixe-palhaço.");
                            } else {
                                textArea.append("Não consegui adivinhar em qual animal marinho você está pensando.");
                            }
                        }
                    }
                } else {
                    textArea.append("Não é um animal do repertório.");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JogoAdivinhacaoAnimaisGUI();
            }
        });
    }
}
