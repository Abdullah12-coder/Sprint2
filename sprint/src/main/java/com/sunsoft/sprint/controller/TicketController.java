package com.sunsoft.sprint.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.exception.ticketIdException;
import com.sunsoft.sprint.entity.Ticket;
import com.sunsoft.sprint.service.TicketService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	private static final Logger log = LoggerFactory.getLogger(TicketController.class);
	
	@GetMapping("/all")
	public List<Ticket> showTicket()
	{
		return ticketService.showTicket();
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("ticketId") int ticketId) throws ticketIdException {
		
		log.debug("Inside delete method in controller class");
		
		Optional<Ticket> ticketIdOpt = ticketService.showTicketById(ticketId);
		
		if(!ticketIdOpt.isPresent()) {
			throw new ticketIdException();
		}
		ticketService.cancelBookings(ticketId);
		
       return "Deletion is performed successfully";
	}
	
	@PostMapping("/addTicket")
	public void addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
	}
	

}
