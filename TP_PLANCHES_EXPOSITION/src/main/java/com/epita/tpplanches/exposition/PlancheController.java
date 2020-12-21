package com.epita.tpplanches.exposition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epita.tpplanches.application.ParquetService;
import com.epita.tpplanches.domain.Parquet;

@RestController
@RequestMapping(value="/Planche")
public class PlancheController {
	
	@Autowired
	private ParquetService parquetService;
	
	@PostMapping(value="/calcul/{nomPiece}/{surface}")
	public void calculerNombrePlancheWithPost(@PathVariable String nomPiece, @PathVariable double surface) {
		parquetService.calculPlanche(nomPiece, surface);
	}
	
	@GetMapping(value="/planche/{id}")
	public Parquet getParquet(@PathVariable long id) {
		return parquetService.getParquet(id);
	}

}
