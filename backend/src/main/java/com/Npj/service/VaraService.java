package com.Npj.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Agenda;
import com.Npj.domain.Usuario;
import com.Npj.domain.Vara;
import com.Npj.repository.VaraRepostory;


@Service
public class VaraService {
	@Autowired
	private VaraRepostory repo;
	@Autowired
	private ModelMapper mp;
	
	public List<Vara> findAll() {
		
		List<Vara>varas = repo.findAllList();	
		
		return varas;

	}
	
	public Vara insert(Vara obj) {
		return repo.save(obj);
	}
	public Optional<Vara> find(Integer id) {
		Optional<Vara> vara = repo.findById(id);
		return vara;
	}
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Vara buscarOuFalhar(int id) {
		return repo.buscarPorId(id);
				
	}

	public Vara from(Vara obj) {
		Vara vara = buscarOuFalhar(obj.getId());		
//		BeanUtils.copyProperties(obj, vara, "id");
//		System.out.println(vara.toString());
//		Vara nova  = mp.map(obj, vara.getClass());
//		System.out.println(nova.toString());
//		Vara nova1 = new Vara(obj);
//		System.out.println(nova1.toString());
//		
		
		return repo.save(obj);
	}

}
