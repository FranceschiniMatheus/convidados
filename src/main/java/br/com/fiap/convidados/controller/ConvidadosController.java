package br.com.fiap.convidados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.convidados.dto.ConvidadoDto;
import br.com.fiap.convidados.service.ConvidadoService;

@Controller
@RequestMapping("convidados")
public class ConvidadosController {
	
	@Autowired
	ConvidadoService service;
	
	@GetMapping("/lista")
	public ModelAndView listar(){		
		ModelAndView view = new ModelAndView("convidados/ListaConvidados");	
		List<ConvidadoDto> convidados = service.findAllConvidado();
		view.addObject(new ConvidadoDto());
		view.addObject("convidados", convidados);
		return view;		
	}
	
	@PostMapping("/salvar")
	public String salvar(ConvidadoDto convidado_dto) {
		ConvidadoDto entity = convidado_dto.toConvidadoEntity();
		repository.save(entity);
		return "redirect:/convidados/lista";
	}
	
	@GetMapping("/detalhar/{id}")
	public ModelAndView detalhar(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("convidados/convidadoDetalhar");
		ConvidadoDto convidado = repository.findById(id).get();
		view.addObject("convidado", convidado);
		return view;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("convidados/convidadoEditar");
		ConvidadoDto convidado = repository.findById(id).get();
		view.addObject("convidado", convidado);
		return view;
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		@SuppressWarnings("unused")
		ConvidadoDto convidado = repository.findById(id).get();
		repository.deleteById(id);
		return "redirect:/convidados/lista";
	}
}
