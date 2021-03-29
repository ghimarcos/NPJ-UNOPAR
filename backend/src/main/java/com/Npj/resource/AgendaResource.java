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

import com.fasterxml.jackson.annotation.JsonView;
import com.Npj.domain.Agenda;
import com.Npj.domain.Comarca;
import com.Npj.domain.flat.AgendaFlat;
import com.Npj.domain.view.AgendaView;
import com.Npj.service.AgendaService;

@RestController
@RequestMapping(value = "/agendas")
public class AgendaResource {
	//	@Autowired
//	private ModelMapper modelMapper;
	@Autowired
	private AgendaService service;


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		AgendaFlat obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@JsonView(AgendaView.Resumo1.class)
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<AgendaFlat>> findAll() {
		List<AgendaFlat> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}



	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> insert(@RequestBody Agenda obj) {
		Agenda objNovo = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(objNovo.getId()).toUri();
		return ResponseEntity.created(uri).body(objNovo);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@RequestBody Agenda obj, @PathVariable Integer id) {
		obj.setId(id);
		Agenda agenda = service.from(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(agenda.getId()).toUri();
		return ResponseEntity.created(uri).body(agenda);

	}





}

