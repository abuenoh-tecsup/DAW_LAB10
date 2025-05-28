package com.tecsup.demo.controladores;

import com.tecsup.demo.modelo.documents.Alumno;
import com.tecsup.demo.servicios.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService servicio;

    @RequestMapping("/listar-alumnos")
    public String listarAlumnos(Model model) {
        model.addAttribute("alumnos", servicio.listar());
        model.addAttribute("titulo", "Listado de alumnos TECSUP");
        return "listarAlumnoView";
    }

    @RequestMapping("/form-alumno")
    public String crearlumno(Model model) {
        model.addAttribute("alumno", new Alumno());
        model.addAttribute("titulo", "Formulario de alumno");
        return "formAlumnoView";
    }

    @RequestMapping("/form-alumno/{id}")
    public String editarAlumno(@PathVariable("id") String id, Model model) {
        Alumno alumno = null;
        if (id != null && id.length() > 0) {
            alumno = servicio.buscar(id);
        } else {
            return "redirect:/listar-alumnos";
        }
        model.addAttribute("alumno", alumno);
        model.addAttribute("titulo", "Editar alumno");
        return "formAlumnoView";
    }

    @RequestMapping(value = "/form-alumno", method = RequestMethod.POST)
    private String guardarAlumno(@Valid Alumno alumno, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de alumno");
            return "formAlumnoView";
        }
        servicio.grabar(alumno);
        status.setComplete();
        return "redirect:/listar-alumnos";
    }

    @RequestMapping(value = "/eliminar-alumno/{id}")
    public String eliminarAlumno(@PathVariable("id") String id) {
        if (id != null && id.length() > 0) {
            servicio.eliminar(id);
        }
        return "redirect:/listar-alumnos";
    }
}
