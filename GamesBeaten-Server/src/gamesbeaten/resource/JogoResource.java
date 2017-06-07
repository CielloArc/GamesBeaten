package gamesbeaten.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gamesbeaten.bo.JogoBO;
import gamesbeaten.entity.Jogo;

@Path("/jogo")
public class JogoResource {
	
	private JogoBO bo = new JogoBO();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void cadastrar(Jogo pJogo){
		bo.cadastrar(pJogo);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Jogo pJogo){
		bo.atualizar(pJogo);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Jogo> listar(){
		return bo.listar();
	}
	
	@DELETE
	public void remover(int pCodigo){
		bo.remover(pCodigo);
	}
}
