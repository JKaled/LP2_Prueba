package com.cibertec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.app.models.Alumno;
import com.cibertec.app.service.IAlumnoService;

import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@Autowired
	IAlumnoService servicioAlumno;

	@GetMapping("/inicio")
	public String inicio(Model model) {
		
		List<Alumno> lista= servicioAlumno.listar();
		model.addAttribute("listaAlumno", lista);
		return "/alumno/inicio";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "/alumno/crear";
	}
	
	@PostMapping("/crear")
	public String crear(Alumno alumno) {
		System.out.println("Alumno cod : "+ alumno.getCodigo());
		servicioAlumno.registrar(alumno);
		return "redirect:/alumno/inicio";
	}
	
	
	@GetMapping("/editar/{codigo}")
	public String editar(@PathVariable Long codigo, Model model) {
		Alumno objAlu = servicioAlumno.consultarXId(codigo);
		model.addAttribute("alumno", objAlu);
		return "/alumno/editar";
	}
	
	@GetMapping("/eliminar/{codigo}")
	public String eliminar(@PathVariable Long codigo, Model model) {
		Alumno objAlu = servicioAlumno.consultarXId(codigo);
		model.addAttribute("alumno", objAlu);
		return "/alumno/eliminar";
	}
	
	@PostMapping("/eliminar")
	public String eliminar(Alumno alu) {
		servicioAlumno.eliminar(alu.getCodigo());
		return "redirect:/alumno/inicio";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
