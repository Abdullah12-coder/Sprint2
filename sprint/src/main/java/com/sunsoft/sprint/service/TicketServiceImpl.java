package com.sunsoft.sprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.sprint.dao.TicketDao;
import com.sunsoft.sprint.entity.Ticket;
import com.sunsoft.sprint.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	TicketDao ticketDao;
	
	@Override
	public List<Ticket> showTicket() {
		return ticketDao.showTicket();
	}

	@Override
	public void cancelBookings(int ticketId) {
		ticketDao.cancelBookings(ticketId);

		
	}

	@Override
	public void addTicket(Ticket ticket){
		ticketDao.addTicket(ticket);
	}

	@Override
	public Optional<Ticket> showTicketById(int ticketId) {
		return ticketDao.showTicketById(ticketId);
	}

}
