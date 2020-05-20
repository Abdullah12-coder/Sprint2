package com.sunsoft.sprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sunsoft.sprint.entity.Ticket;

@Service
public interface TicketService {

    
	public List<Ticket> showTicket();
	public void cancelBookings(int ticketId);
	
	public void addTicket(Ticket ticket);
	

	public Optional<Ticket> showTicketById(int ticketId);
}
