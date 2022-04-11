package com.trybe.agenda;

import java.util.HashMap;

/** class agenda. */
public class AgendaMapa {
  private HashMap<String, String> agenda = new HashMap<String, String>();

  public void incluirContato(String name, String telefone) {
    agenda.put(name, telefone);
  }

  public void excluirContato(String name) {
    agenda.remove(name);
  }

  public boolean verificaContato(String name) {
    return agenda.containsKey(name);
  }

  public int tamanhoAgenda() {
    return agenda.size();
  }

  public void atualizarTelefone(String name, String telefone) {
    agenda.put(name, telefone);
  }

  public String obterTelefone(String name) {
    return agenda.get(name);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    AgendaMapa agenda = new AgendaMapa();
    agenda.incluirContato("João", "88889999");
    agenda.incluirContato("Maria", "77779999");
    agenda.verificaContato("João");
  }
}
