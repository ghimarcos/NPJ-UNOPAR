package com.Npj.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Npj.domain.Agenda;
import com.Npj.domain.Atendimento;
import com.Npj.service.AtendimentoService;

@RestController
@RequestMapping(value = "/atendimentos")
public class AtendimentoResource {
//	@Autowired
//	private ModelMapper modelMapper;
	@Autowired
	private AtendimentoService service;


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<Atendimento> obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}	
//	@JsonView(AtendimentoView.Resumo1.class)
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Atendimento>> findAll() {
		List<Atendimento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> insert(@RequestBody Atendimento obj) {	
		Atendimento objNovo = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(objNovo.getId()).toUri();
		return ResponseEntity.created(uri).body(objNovo);
		
	}
	
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public ResponseEntity<?> update(@RequestBody AtendimentoFlat obj, @PathVariable Integer id) {
//		obj.setId(id);
//		AtendimentoFlat atividadeAtualizado = service.from(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
//				path("/{id}").buildAndExpand(atividadeAtualizado.getId()).toUri();
//		return ResponseEntity.created(uri).body(atividadeAtualizado);
//		
//	}	

	

	

}

