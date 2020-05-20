package com.sunsoft.sprint.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sunsoft.sprint.entity.Ticket;
import com.sunsoft.sprint.repository.TicketRepository;

@Component
public class TicketDaoImpl implements TicketDao{

	@Autowired
	TicketRepository ticketRepository;
	
	
	@Override
	public List<Ticket> showTicket() {
		// TODO Auto-generated method stub
		return (List<Ticket>)ticketRepository.findAll();
	}

	@Override
	@Transactional
	public void cancelBookings(int ticketId) {
		// TODO Auto-generated method stub
	      ticketRepository.deleteById(ticketId);		

	}

	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepository.save(ticket);
	}


	@Override
	public Optional<Ticket> showTicketById(int ticketId) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(ticketId);
	}
	
	

}
