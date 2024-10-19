package com.cibertec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.app.models.Empleado;
import com.cibertec.app.service.IEmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService servicioEmpleado;
	
	@GetMapping({"/inicio", "/",""})
	public String inicio(Model model) {	
		List<Empleado> lista= servicioEmpleado.listarTodo();
		model.addAttribute("listaEmpleado", lista);
		model.addAttribute("empleado", new Empleado());
		return "/empleado/inicio";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		model.addAttribute("empleado", new Empleado());
		return "/empleado/crear";
	}
	
	@PostMapping("/crear")
	public String crear(Empleado empleado) {
		System.out.println("Codigo : " + empleado.getCodigo());
		System.out.println("Nombre : " + empleado.getNombre());
		System.out.println("Apellido : " + empleado.getApellido());
		servicioEmpleado.guardar(empleado);
		return "redirect:/empleado/inicio";
	}
	
	@GetMapping("/editar/{codigo}")
	public String editar(@PathVariable Long codigo, Model model) {
		System.out.println("Codigo : " +  codigo);
		Empleado objEmp = servicioEmpleado.consultarXId(codigo);
		model.addAttribute("empleado", objEmp );
		return "/empleado/crear";
	}
	
	@GetMapping("/eliminar/codigo/{codigo}/nombre/{nombre}")
	public String eliminar(@PathVariable Long codigo, @PathVariable String nombre,  Model model) {
		Empleado objEmp = servicioEmpleado.consultarXId(codigo);
		model.addAttribute("empleado", objEmp );
		return "/empleado/eliminar";
	}
	
	@PostMapping("/eliminar")
	public String eliminar(Empleado empleado) {
		servicioEmpleado.eliminar(empleado.getCodigo());
		return "redirect:/empleado/inicio";
	}
	
}
