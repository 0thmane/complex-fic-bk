package io.hitos.complexeficbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hitos.complexeficbk.model.Fic;
import io.hitos.complexeficbk.repository.FicRepository;

@Service
public class FicService {

	@Autowired
	private FicRepository ficRepository;
	
	public Fic saveFic(Fic fic) {
		//redisPublisher.publish(message);
		List<Fic> lFics = ficRepository.findByNumber(fic.getNumber());
		if (lFics == null || lFics.isEmpty())
			return ficRepository.save(fic);
		return lFics.get(0);
	}
	
	public Long calcule(Long number) {
		if (number == 1)
			return 1L;
		return calcule(number-1) * number;
		
	}
	
	
	
	
	
	

}
