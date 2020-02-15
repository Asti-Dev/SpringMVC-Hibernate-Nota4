package isil.ejemplo.juan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import isil.ejemplo.juan.service.ReservaService;
import isil.ejemplo.juan.model.Reserva;

@Controller
public class ReservaController {
	
	private ReservaService reservaService;
	
	@Autowired(required=true)
	@Qualifier(value="reservaService")
	public void setReservaService(ReservaService rs){
		this.reservaService = rs;
	}
	
	@RequestMapping(value = {"/reservas","/"}, method = RequestMethod.GET)
	public String listReservas(Model model) {
		model.addAttribute("reserva", new Reserva());
		model.addAttribute("listReservas", this.reservaService.listReservas());
		return "reserva";
	}
	
	//Añade reserva o actualiza reserva
	@RequestMapping(value= "/reserva/add", method = RequestMethod.POST)
	public String addReserva(@ModelAttribute("reserva") Reserva r){
		
		if(r.getId() == 0){
			
			this.reservaService.addReserva(r);
		}else{
			
			this.reservaService.updateReserva(r);
		}
		
		return "redirect:/reservas";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removeReserva(@PathVariable("id") int id){
		
        this.reservaService.removeReserva(id);
        return "redirect:/reservas";
    }
 
    @RequestMapping("/edit/{id}")
    public String editReserva(@PathVariable("id") int id, Model model){
        model.addAttribute("reserva", this.reservaService.getReservaById(id));
        model.addAttribute("listReservas", this.reservaService.listReservas());
        return "reserva";
    }
	
}
