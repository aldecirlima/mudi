package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 11");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41kXRr2qHkL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B09QSB4N2C?ref_=cm_sw_r_cp_ud_dp_70VR68CCCSVZMMPEVTBC");
//		pedido.setUrlProduto("https://a.co/d/00l1aFu");
		pedido.setDescricao("Qualquer descrição");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
	
}
