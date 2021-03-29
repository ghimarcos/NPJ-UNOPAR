package com.Npj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Agenda;
import com.Npj.domain.flat.AgendaFlat;
import com.Npj.repository.AgendaRepostory;


@Service
public class AgendaService {
	@Autowired
	private AgendaRepostory repo;
	@Autowired
	private ModelMapper mp;

	public List<AgendaFlat> findAll() {
		List<AgendaFlat> aFlats = new ArrayList<AgendaFlat>();
		List<Agenda>agendas = repo.findAllList();
		for(Agenda agenda: agendas ) {
			AgendaFlat aflat = new AgendaFlat(agenda);
			aFlats.add(aflat);
		}

		return aFlats;

	}

	public AgendaFlat find(Integer id) {
		Agenda agenda = repo.buscarPorId(id);
		AgendaFlat aflat = new AgendaFlat(agenda);
		return aflat;
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Agenda insert(Agenda obj) {
		return repo.save(obj);
	}

	public Agenda buscarOuFalhar(int id) {
		return repo.buscarPorId(id);

	}

	public Agenda from(Agenda agendaNovo) {
		Agenda agenda = buscarOuFalhar(agendaNovo.getId());
		BeanUtils.copyProperties(agendaNovo, agenda, "id");
		System.out.println(agenda.toString());
		Agenda nova  = mp.map(agendaNovo, agenda.getClass());
		System.out.println(nova.toString());
		Agenda nova1 = new Agenda(agendaNovo);
		System.out.println(nova1.toString());

		return repo.save(nova);
	}





}
