package io.hitos.complexeficbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.hitos.complexeficbk.model.Fic;
import io.hitos.complexeficbk.service.FicService;

@Controller
public class FicController {

	@Autowired
	private FicService ficService;
	
	@GetMapping("/api/fic/{number}")
	public ResponseEntity<Fic> fic(@PathVariable Long number) {
		Fic f = new Fic();
		f.setNumber(number);
		f.setResult(ficService.calcule(number));
		f =  ficService.saveFic(f);
		return new ResponseEntity<Fic>(f, HttpStatus.OK);
	}
}
