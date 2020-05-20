package com.sunsoft.sprint.dao;

import java.util.List;
import java.util.Optional;

import com.sunsoft.sprint.entity.Ticket;


public interface TicketDao {
	

	public void addTicket(Ticket ticket);
	
	public List<Ticket> showTicket();
	public void cancelBookings(int ticketId);
	
	public Optional<Ticket> showTicketById(int ticketId);
}
