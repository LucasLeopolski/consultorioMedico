/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class CadastroEspecialidade {

    public String nomeEspecialidade;

    public CadastroEspecialidade() {
    }

    public CadastroEspecialidade(String nomeEspecialidade) {

        this.nomeEspecialidade = nomeEspecialidade;

    }

    public String cadastrarEspecialidades() {
        ArrayList<String> Especialidades = new ArrayList<String>();
        Especialidades.add("Cardiologia - Medico(a): Dr(a) Marcos.");
        Especialidades.add("Pediatria - Medico(a): Dr(a) Paula.");
        Especialidades.add("Psiquiatria - Medico(a): Dr(a) Carlos.");
        return null;

    }
}
