/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Leopolski
 */
public class CadastroEspecialidade {

    public String nomeEspecialidade;
    public ArrayList<String> Especialidades;

    public CadastroEspecialidade() {
    }

    public CadastroEspecialidade(String nomeEspecialidade) {

        this.nomeEspecialidade = nomeEspecialidade;

    }

    public ArrayList  cadastrarEspecialidades() {
        Especialidades = new ArrayList<String>();
        Especialidades.add("");
        Especialidades.add("\n[1] Cardiologia - Medico(a): Dr(a) Marcos.");
        Especialidades.add("\n[2] Pediatria - Medico(a): Dr(a) Paula.");
        Especialidades.add("\n[3] Psiquiatria - Medico(a): Dr(a) Carlos.");
        
        
        return Especialidades;

    
    }
    
    public String retornarDescricaoEspecialidade(int codEspecialidade){
        return Especialidades.get(codEspecialidade);
    }
}
