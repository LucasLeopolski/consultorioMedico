package objeto.consultoriomedico;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Lucas Pessoli
 */
public class Datas {
    
        public String gerarData(boolean resposta){
            String data;
            if(resposta == true){ //retornará a data atual
                Calendar calendario = Calendar.getInstance();
                data = calendario.getTime().toString();   
            }else{
                Random random = new Random(); //retorna uma data randomizada
                int dia = random.nextInt(365);
                int mes = random.nextInt(12) + 1;
                Calendar calendario = Calendar.getInstance();
                calendario.set(Calendar.YEAR, 2023);
                calendario.set(Calendar.MONTH, mes - 1);
                calendario.set(Calendar.DAY_OF_MONTH, 1);
                calendario.add(Calendar.DAY_OF_MONTH, dia);
                data = calendario.getTime().toString();
            }
            return data;
        }
}
