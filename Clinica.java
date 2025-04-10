import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Clinica {
    private PriorityQueue<Paciente> listaPaciente;

    public Clinica() {
        listaPaciente=new PriorityQueue<>();
    }

    public void encolar(Paciente dato){
        listaPaciente.add(dato);
    }

    public Paciente atender() throws Exception{
        if(listaPaciente.isEmpty())
            throw new Exception("No existen mas elementos");
        return listaPaciente.poll();
    }

    public List<Paciente> listarPacientes(){
        return listaPaciente.stream().collect(Collectors.toList());
    }
}
